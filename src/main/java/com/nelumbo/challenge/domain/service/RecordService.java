package com.nelumbo.challenge.domain.service;

import com.nelumbo.challenge.domain.model.Record;

import java.util.Arrays;

public interface RecordService {
    Record createEntryRecord(Record record);
    Record createCheckoutRecord(Record record);
    Record findRecordByParkingId(Integer parkingId);

}
