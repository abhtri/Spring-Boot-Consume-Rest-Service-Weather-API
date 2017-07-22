package com.test.bean;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Weather {

	List<Dt> list = new ArrayList() ;
	String cod;
	

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public List<Dt> getList() {
		return list;
	}

	public void setList(List<Dt> list) {
		this.list = list;
	}

	
}
