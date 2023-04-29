package com.nelumbo.challenge.domain.service;

import com.nelumbo.challenge.domain.model.Record;

public interface RecordService {
    Record createEntryRecord(Record record);
    Record createCheckoutRecord(Record record);

}
