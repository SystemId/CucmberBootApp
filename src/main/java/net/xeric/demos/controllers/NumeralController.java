package net.xeric.demos.controllers;

import net.xeric.demos.services.NumeralService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class NumeralController {
	@Autowired
	NumeralService numeralService;
	
	
	private ObjectMapper mapper = new ObjectMapper();
	
	@RequestMapping("/numeral")
	@ResponseBody
	public String numeral(@RequestParam(value="number", defaultValue="0") int firstNumber) throws JsonProcessingException {
		String convertToRoman = numeralService.convertToRoman(firstNumber);		
		return mapper.writeValueAsString(convertToRoman);
	}



}
