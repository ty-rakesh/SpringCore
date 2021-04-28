package com.tc.SpringCoreDemo.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
	
	
	
	public Student() {
		
	}

	private int sid;
	
	private String name;

	private Branch branch;
	

}
