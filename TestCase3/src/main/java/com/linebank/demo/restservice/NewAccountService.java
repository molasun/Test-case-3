package com.linebank.demo.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.linebank.demo.restservice.model.NewAccountRequestRso;
import com.linebank.demo.restservice.model.NewAccountResponseRso;

import io.swagger.annotations.ApiOperation;

@RestController
public class NewAccountService {
	@ApiOperation(value = "Create link bank account")
	@RequestMapping(value ="/account", method= {RequestMethod.POST}, produces="application/json", consumes="application/json" )
	public Object createAccount(@RequestBody NewAccountRequestRso account) {
		
		NewAccountResponseRso response = new NewAccountResponseRso();
		response.setStatus("success");
		response.setMessage("waiting for approve");
		return response;	
		
	}
}
