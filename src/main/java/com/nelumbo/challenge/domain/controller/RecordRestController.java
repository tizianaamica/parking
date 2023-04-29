package com.nelumbo.challenge.domain.controller;

import com.nelumbo.challenge.domain.dto.RecordDto;
import com.nelumbo.challenge.domain.model.Record;
import com.nelumbo.challenge.domain.service.RecordService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;

@RequiredArgsConstructor
@RestController
public class RecordRestController {

    private final RecordService recordService;
    private final ModelMapper modelMapper;

    @PostMapping("/createEntryRecord")
    @ResponseStatus(OK)
    public RecordDto createRecord(@RequestBody Record record) {
        return convertToDto(recordService.createEntryRecord(record));
    }

    @PutMapping("/createCheckoutRecord")
    @ResponseStatus(OK)
    public RecordDto checkoutRecord(@RequestBody Record record) {
        return convertToDto(recordService.createCheckoutRecord(record));
    }

    private RecordDto convertToDto(Record record) {
        return modelMapper.map(record, RecordDto.class);
    }


}
