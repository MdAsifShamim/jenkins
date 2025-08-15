package com.training.jenkins.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CalculatorController {

	@GetMapping("/add")
	public ResponseEntity<Integer> addNumber(@RequestParam(defaultValue = "10") int a, @RequestParam(defaultValue = "20") int b){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(a+b);
	}
	
	@GetMapping("/substract")
	public ResponseEntity<Integer> substractNumber(@RequestParam(defaultValue = "10") int a, @RequestParam(defaultValue = "20") int b){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(a-b);
	}
}
