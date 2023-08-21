package com.juwoong.student.client;

import com.juwoong.student.model.Student;
import com.juwoong.student.service.StudentService;
import com.juwoong.student.service.dbimpl.StudentDbService;

public class StudentClient {

	public static void main(String[] args) {
		StudentService service = new StudentDbService();
		service.create(new Student());
		service.read("17SS0001");
		service.update(new Student());
		service.delete("17SS0001");
	}

}
