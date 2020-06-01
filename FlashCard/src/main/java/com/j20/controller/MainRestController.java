package com.j20.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {
	
	
	@RequestMapping("disp")
	public String display() {
		return "request mapping from rest controller";
	}
	
	@GetMapping(path ="get/{index}",produces = {"application/json"})
	//  @ResponseBody
	public String get(@PathVariable("index") int n) {
		String [] listName = {"Vishnu","Jay","John","Jay","Ray"};
		
		return listName[n];
	}

}
