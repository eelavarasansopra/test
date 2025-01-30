package com.myspace.controller;

import com.myspace.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/v1")
public class TestController {
	
	@Autowired
	public TestServiceImpl testServiceImpl;

	@GetMapping("/test")
	public String test(@RequestParam("value")long value, @RequestParam("service") String service) throws InterruptedException {
		testServiceImpl.test(value,service);
		return "testdata";
	}
}
