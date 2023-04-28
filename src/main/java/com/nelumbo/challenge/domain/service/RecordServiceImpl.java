package com.nelumbo.challenge.domain.service;

import com.nelumbo.challenge.domain.model.Record;
import com.nelumbo.challenge.domain.repository.RecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RecordServiceImpl implements RecordService {

    private final RecordRepository recordRepository;

    @Override
    public Record createRecord(Record record) {
        Record createRecord = new Record();
        createRecord.setVehiclePlate(record.getVehiclePlate());
        createRecord.setParkingId(record.getParkingId());
        createRecord.setVehicleEntryDate(record.getVehicleEntryDate());
        createRecord.setVehicleExitDate(record.getVehicleExitDate());
        return recordRepository.save(createRecord);
    }

}
