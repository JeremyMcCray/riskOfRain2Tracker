package com.riskofraintracker.riskOfRain2Tracker.controllers;

import com.riskofraintracker.riskOfRain2Tracker.models.RunReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.riskofraintracker.riskOfRain2Tracker.services.RunReportService;

import java.util.Optional;
@RequestMapping("/jcool")
@RestController
public class RunReportController {

    RunReportService runReportService;

    @Autowired
    public RunReportController(RunReportService service){
        this.runReportService = service;
    }


    @GetMapping("/getRR/{id}")
    public ResponseEntity<Optional<RunReport>> findByID(@PathVariable Long id){
        return new ResponseEntity<>(runReportService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/save/")
    public ResponseEntity<RunReport> save(){
        return new ResponseEntity<>(runReportService.saveCurrentRun(), HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public String getAll(){
//        return new ResponseEntity<>(runReportService.getAll(),HttpStatus.I_AM_A_TEAPOT);
        return "Poop";
    }

}
