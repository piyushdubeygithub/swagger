package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@RequestMapping(value = "api/v1/getData", method=RequestMethod.GET)
	public Map<String,Object> getData() {
		Map<String, Object> result = new HashMap<>();
		result.put("RESPONSE_MESSAGE", "SUCCESS");
		return result;
	}

	
}
