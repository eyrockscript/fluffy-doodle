package com.eyrockscript.restmstemplate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eyrockscript.restmstemplate.dto.request.SimpleRequestDTO;
import com.eyrockscript.restmstemplate.dto.response.SimpleResponseDTO;
import com.eyrockscript.restmstemplate.model.entity.Request;
import com.eyrockscript.restmstemplate.model.repository.RequestRepository;
import com.eyrockscript.restmstemplate.service.intrface.ISimpleSevice;

@Service
public class SimpleService implements ISimpleSevice {
	
	@Autowired
	private RequestRepository repository;

	@Override
	public SimpleResponseDTO simpleSave( SimpleRequestDTO request ) {
		Request entity = new Request( request );
		entity = repository.save(entity);
		
		return new SimpleResponseDTO( entity.getId().toString() );
	}

}
