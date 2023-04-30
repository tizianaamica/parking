package com.nelumbo.challenge.domain.controller;

import com.nelumbo.challenge.domain.dto.RecordDto;
import com.nelumbo.challenge.domain.dto.RecordListDto;
import com.nelumbo.challenge.domain.model.Record;
import com.nelumbo.challenge.domain.service.RecordService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;



@RequiredArgsConstructor
@RestController
public class RecordRestController {

    private final RecordService recordService;
    private final ModelMapper modelMapper;

    @PostMapping("/createEntryRecord")
    @ResponseStatus(CREATED)
    public RecordDto createRecord(@RequestBody Record record) {
        return convertToDto(recordService.createEntryRecord(record));
    }

    @PutMapping("/createCheckoutRecord")
    @ResponseStatus(OK)
    public RecordDto checkoutRecord(@RequestBody Record record) {
        return convertToDto(recordService.createCheckoutRecord(record));
    }

    @GetMapping("/record/{parkingId}")
    @ResponseStatus(OK)
    public RecordListDto getRecordById(@PathVariable Integer parkingId) {
        return convertToDtoList(recordService.findRecordByParkingId(parkingId));
    }

    private RecordDto convertToDto(Record record) {
        return modelMapper.map(record, RecordDto.class);
    }

    private RecordListDto convertToDtoList(Record record) {
        return modelMapper.map(record, RecordListDto.class);
    }


}
