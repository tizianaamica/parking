package com.nelumbo.challenge.domain.controller;

import com.nelumbo.challenge.domain.dto.ParkingDto;
import com.nelumbo.challenge.domain.model.Parking;
import com.nelumbo.challenge.domain.service.ParkingService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.stream.Collectors.toList;

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
    public Parking getParkingById(@PathVariable Integer id) {
        return parkingService.findParkingById(id);
    }

    @PostMapping("/createParking")
    public Parking saveParking(@RequestBody Parking parking) {
        return parkingService.saveParking(parking);
    }

    @PutMapping("/updateParking/{id}")
    public Parking updateParking(@PathVariable Integer id, @RequestBody Parking parking) {
        return parkingService.updateParking(id, parking);
    }

    @DeleteMapping("/deleteParking/{id}")
    public void deleteParking(@PathVariable Integer id) {
        parkingService.deleteParking(id);
    }


    private ParkingDto convertToDto(Parking parking) {
        return modelMapper.map(parking, ParkingDto.class);
    }

}
