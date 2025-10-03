package com.example.OnlineClipBoard1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
@Entity
public class clips {
	@Id
	private String id;
	@Lob //as data is too large and multi line use this @Lob annotation for safety purpose
	private String data;
	public clips() {}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
}
