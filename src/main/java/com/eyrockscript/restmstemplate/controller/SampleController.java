package com.eyrockscript.restmstemplate.controller;

import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.eyrockscript.restmstemplate.dto.request.SimpleRequestDTO;
import com.eyrockscript.restmstemplate.dto.response.SimpleResponseDTO;
import com.eyrockscript.restmstemplate.service.intrface.ISimpleSevice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class SampleController {
	
	@Autowired
	private ISimpleSevice service;

	@GetMapping("/")
	public Map<String, Object> greeting() {
		log.info(this.getClass().getCanonicalName(), "enter on greeting method");
		return Collections.singletonMap("message", "Hello, World");
	}
	
	@PostMapping("/save-simple")
	public @ResponseBody ResponseEntity<SimpleResponseDTO> saveSimple( @RequestBody SimpleRequestDTO request ) {
		log.info(this.getClass().getCanonicalName(), "enter on saveSimple method");
		return ResponseEntity.ok( service.simpleSave( request ) );
	}

}