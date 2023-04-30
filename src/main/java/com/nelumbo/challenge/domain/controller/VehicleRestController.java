package com.nelumbo.challenge.domain.controller;

import com.nelumbo.challenge.domain.dto.VehicleDto;
import com.nelumbo.challenge.domain.model.Vehicle;
import com.nelumbo.challenge.domain.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RequiredArgsConstructor
@RestController
public class VehicleRestController {

    private final VehicleService vehicleService;
    private final ModelMapper modelMapper;

    @GetMapping("/vehicles/{parkingId}/parking")
    public List<VehicleDto> getAllVehiclesWithParking(@PathVariable Integer parkingId) {
        return vehicleService.listOfVehiclesByParking(parkingId)
                .stream().map(this::convertToDto).collect(toList());
    }

    @GetMapping("/vehicles/{memberId}")
    public List<VehicleDto> getAllVehiclesByMember(@PathVariable Integer memberId) {
        return vehicleService.listOfVehiclesByMemberId(memberId)
                .stream().map(this::convertToDto).collect(toList());
    }

    @GetMapping("/vehicle/{vehicleId}")
    public VehicleDto getVehicleById(@PathVariable Integer vehicleId) {
        return convertToDto(vehicleService.findVehicleById(vehicleId));
    }

    private VehicleDto convertToDto(Vehicle vehicle) {
        return modelMapper.map(vehicle, VehicleDto.class);
    }

}
