package com.eyrockscript.restmstemplate.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.eyrockscript.restmstemplate.dto.request.SimpleRequestDTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table( name = "TBL_REQUEST" )
public class Request {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "simple_data")
	private String data;
	
	public Request( SimpleRequestDTO request ) {
		this.setFromDTO( request );
	}
	
	public void setFromDTO( SimpleRequestDTO request ) {
		this.setData( request.getData() );
	}
	
	public SimpleRequestDTO getDTO() {
		SimpleRequestDTO request = new SimpleRequestDTO();
		request.setData( this.getData() );
		
		return request;
	}

}
