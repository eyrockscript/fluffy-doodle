package com.eyrockscript.restmstemplate.service.intrface;

import com.eyrockscript.restmstemplate.dto.request.SimpleRequestDTO;
import com.eyrockscript.restmstemplate.dto.response.SimpleResponseDTO;

public interface ISimpleSevice {

	SimpleResponseDTO simpleSave( SimpleRequestDTO request );
	
}
