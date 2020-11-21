package com.jitendra.nimesa.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jitendra.nimesa.service.DataService;

@RestController
public class MyTestController {

	@Autowired
	private DataService dservice;
	
	@GetMapping("/getDayMaxTemp")
	public String getDayMaxtemp()
	{
		dservice.getData();
		String data = dservice.returnMaxTempDay();
		return data;
	}
	
	@GetMapping("/getRainDates")
	public List<String> getDates()
	{
		dservice.getData();
		List<String> data = dservice.returnListofRainDates(); 	
		return data;
	}
	
	@GetMapping("/getPerticularData")
	public Map<String, String> getPerticularData(@RequestParam String val)
	{
		dservice.getData();
		Map<String, String> data = dservice.returnDataForDate(val); 	
		return data;
	}
}
