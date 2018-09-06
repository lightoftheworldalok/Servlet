package com.alok.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	
	public static List<Student> getStudent(){
		//create an empty list
		List<Student> students = new ArrayList<>();
		//add sample data 
		students.add(new Student("Alok", "Kumar", "alok@gmail.com"));
		students.add(new Student("Manish", "Kumar", "Manish@gmail.com"));
		students.add(new Student("LOL", "Kumar", "lol@gmail.com"));
		//return list
		return students;
	}

}
