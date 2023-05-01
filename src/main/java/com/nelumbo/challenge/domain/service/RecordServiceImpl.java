package com.nelumbo.challenge.domain.service;

import com.nelumbo.challenge.domain.exception.BadRequestException;
import com.nelumbo.challenge.domain.model.History;
import com.nelumbo.challenge.domain.model.Record;
import com.nelumbo.challenge.domain.model.Vehicle;
import com.nelumbo.challenge.domain.repository.HistoryRepository;
import com.nelumbo.challenge.domain.repository.RecordRepository;
import com.nelumbo.challenge.domain.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class RecordServiceImpl implements RecordService {

    private final RecordRepository recordRepository;
    private final VehicleRepository vehicleRepository;

    private final HistoryRepository historyRepository;

    @Override
    public Record createEntryRecord(Record record) {
        if (recordRepository.existsByVehiclePlateAndVehicleCheckoutIsFalse(record.getVehiclePlate())) {
            throw new BadRequestException("There is already a vehicle registration plate: " + record.getVehiclePlate());
        }
        Vehicle createVehicle;

        if (!vehicleRepository.existsByVehiclePlate(record.getVehiclePlate())) {
            createVehicle = Vehicle.builder()
                    .vehiclePlate(record.getVehiclePlate())
                    .vehicleType("Corolla")
                    .vehicleMake("Ford")
                    //.parkingId(record.getParkingId())
                    .build();
            vehicleRepository.save(createVehicle);
        } else {
          createVehicle = vehicleRepository.findByVehiclePlate(record.getVehiclePlate());
        }
        Record createEntryRecord = Record.builder()
                .vehiclePlate(record.getVehiclePlate())
                .parkingId(record.getParkingId())
                .vehicleId(createVehicle.getVehicleId())
                .build();
        return recordRepository.save(createEntryRecord);
    }

    @Override
    public Record createCheckoutRecord(Record record) {
        Optional<Record> optionalExistingRecord = recordRepository.findByVehiclePlateAndVehicleCheckoutIsFalse(record.getVehiclePlate());
        if (optionalExistingRecord.isPresent()) {
            Record existingRecord = optionalExistingRecord.get();
            History createHistory = History.builder()
                    .recordId(existingRecord.getRecordId())
                    .build();
            historyRepository.save(createHistory);
            existingRecord.setVehicleCheckout(true);
            return recordRepository.save(existingRecord);
        } else {
            throw new BadRequestException("There is no vehicle with that plate: " + record.getVehiclePlate());
        }
    }

    @Override
    public Record findRecordByParkingId(Integer parkingId) {
        return recordRepository.findByParkingId(parkingId);
    }

}
