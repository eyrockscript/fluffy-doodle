package com.eyrockscript.restmstemplate.controller;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/")
	public Map<String, Object> greeting() {
		return Collections.singletonMap("message", "Hello, World");
	}

}