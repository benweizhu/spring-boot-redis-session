package me.zeph.example.spring.springredissessionexample.controller;

import me.zeph.example.spring.springredissessionexample.model.Job;
import me.zeph.example.spring.springredissessionexample.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {

  @Autowired
  private JobService jobService;

  @GetMapping(value = "/jobs/{jobId}")
  public ResponseEntity<Job> getJobById(@PathVariable long jobId) {
    return new ResponseEntity<>(jobService.getJob(jobId), HttpStatus.OK);
  }
}
