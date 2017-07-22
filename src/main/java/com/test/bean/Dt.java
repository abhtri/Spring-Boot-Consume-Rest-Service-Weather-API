package com.test.bean;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Dt {
	String dt ;
	Temp main = new Temp() ;

	

	public Temp getMain() {
		return main;
	}

	public void setMain(Temp main) {
		this.main = main;
	}

	public String getDt() {
		return dt;
	}

	public void setDt(String dt) {
		this.dt = dt;
	}
	

}
