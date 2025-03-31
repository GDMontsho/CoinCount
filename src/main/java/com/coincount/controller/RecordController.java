package com.coincount.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/records")

public class RecordController {

    @GetMapping
    public String getAllRecords(){
        return "Here are all the records";
    }
    
}
