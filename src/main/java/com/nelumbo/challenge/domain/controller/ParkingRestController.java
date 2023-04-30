package com.nelumbo.challenge.domain.controller;

import com.nelumbo.challenge.domain.dto.ParkingDto;
import com.nelumbo.challenge.domain.model.Parking;
import com.nelumbo.challenge.domain.service.ParkingService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.springframework.http.HttpStatus.CREATED;

@RequiredArgsConstructor
@RestController
public class ParkingRestController {

    private final ParkingService parkingService;

    private final ModelMapper modelMapper;

    @GetMapping("/parkings")
    public List<ParkingDto> getParkings() {
        return parkingService.listOfParkings()
                .stream().map(this::convertToDto).collect(toList());
    }

    @GetMapping("/parking/{id}")
    public ParkingDto getParkingById(@PathVariable Integer id) {
        return convertToDto(parkingService.findParkingById(id));
    }

    @PostMapping("/createParking")
    @ResponseStatus(CREATED)
    public ParkingDto saveParking(@RequestBody Parking parking) {
        return convertToDto(parkingService.saveParking(parking));
    }

    @PutMapping("/updateParking/{id}")
    public ParkingDto updateParking(@PathVariable Integer id, @RequestBody Parking parking) {
        return convertToDto(parkingService.updateParking(id, parking));
    }

    @DeleteMapping("/deleteParking/{id}")
    public void deleteParking(@PathVariable Integer id) {
        parkingService.deleteParking(id);
    }

    private ParkingDto convertToDto(Parking parking) {
        return modelMapper.map(parking, ParkingDto.class);
    }

}
