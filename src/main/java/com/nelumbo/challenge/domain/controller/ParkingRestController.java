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

    @GetMapping("/{id}")
    public Parking getParkingById(@PathVariable Long id) {
        return parkingService.findParkingById(id);
    }

    @PostMapping
    public Parking saveParking(@RequestBody Parking parking) {
        return parkingService.saveParking(parking);
    }

    @PutMapping("/{id}")
    public Parking updateParking(@RequestBody Parking parking) {
        return parkingService.saveParking(parking);
    }

    @DeleteMapping("/{id}")
    public void deleteParking(@PathVariable Long id) {
        parkingService.deleteParking(id);
    }


    private ParkingDto convertToDto(Parking parking) {
        return modelMapper.map(parking, ParkingDto.class);
    }

}
