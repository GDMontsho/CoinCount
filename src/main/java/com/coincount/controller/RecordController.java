package com.coincount.controller;

import com.coincount.model.Record;
import com.coincount.repository.RecordRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/records")
public class RecordController {

    private final RecordRepository recordRepository;

    public RecordController(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    @GetMapping
    public List<Record> getAllRecords() {
        return recordRepository.findAll();
    }

    @GetMapping("/{id}")
    public Record getRecordById(@PathVariable Long id) {
        return recordRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Record not found"));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Record createRecord(@RequestBody Record record) {
        return recordRepository.save(record);
    }

    @GetMapping("/category/{category}")
    public List<Record> getRecordsByCategory(@PathVariable String category) {
        return recordRepository.findByCategory(category);
    }
}