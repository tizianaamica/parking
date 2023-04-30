package com.nelumbo.challenge.domain.service;

import com.nelumbo.challenge.domain.exception.BadRequestException;
import com.nelumbo.challenge.domain.model.Record;
import com.nelumbo.challenge.domain.repository.RecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class RecordServiceImpl implements RecordService {

    private final RecordRepository recordRepository;

    @Override
    public Record createEntryRecord(Record record) {
        if (recordRepository.existsByVehiclePlate(record.getVehiclePlate())) {
            throw new BadRequestException("There is already a vehicle registration plate: " + record.getVehiclePlate());
        }
        Record createEntryRecord = Record.builder()
                .vehiclePlate(record.getVehiclePlate())
                .parkingId(record.getParkingId())
                .vehicleId(record.getVehicleId())
                .build();
        return recordRepository.save(createEntryRecord);
    }

    @Override
    public Record createCheckoutRecord(Record record) {
        Optional<Record> optionalExistingRecord = recordRepository.findByVehiclePlate(record.getVehiclePlate());
        if (optionalExistingRecord.isPresent()) {
            Record existingRecord = optionalExistingRecord.get();
            Record updateRecord = Record.builder()
                    .vehiclePlate(existingRecord.getVehiclePlate())
                    .parkingId(existingRecord.getParkingId())
                    .vehicleEntryDate(existingRecord.getVehicleEntryDate())
                    .vehicleCheckoutDate(record.getVehicleCheckoutDate())
                    .build();
            return recordRepository.save(updateRecord);
        } else {
            throw new BadRequestException("There is no vehicle with that plate: " + record.getVehiclePlate());
        }
    }

}
