package com.nelumbo.challenge.domain.controller;

import com.nelumbo.challenge.domain.model.Record;
import com.nelumbo.challenge.domain.service.RecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class RecordRestController {

    private final RecordService recordService;

    @PostMapping("/createRecord")
    public Record createRecord(@RequestBody Record record) {
        return recordService.createRecord(record);
    }

}
