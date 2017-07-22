package com.test.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.test.bean.Dt;
import com.test.bean.Weather;



@RestController
public class ApiController {

	
	@RequestMapping("/api")
	public String getWeatherdata() {
		Object o;
		RestTemplate r = new RestTemplate();
		Weather w = r.getForObject(
				"http://api.openweathermap.org/data/2.5/forecast?q=kolkata,IN&APPID=10d5414f3680d2f4061949295552471d",Weather.class);
		List<Dt> l=  w.getList();
		return l.get(0).getMain().getTemp();
	}
}
