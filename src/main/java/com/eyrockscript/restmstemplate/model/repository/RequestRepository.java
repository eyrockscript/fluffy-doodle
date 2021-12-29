package com.eyrockscript.restmstemplate.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eyrockscript.restmstemplate.model.entity.Request;

@Repository
public interface RequestRepository extends CrudRepository<Request, Integer>{

	Request save(Request entity);

}
