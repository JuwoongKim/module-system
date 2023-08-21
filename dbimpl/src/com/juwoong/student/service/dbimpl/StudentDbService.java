package com.juwoong.student.service.dbimpl;

import com.juwoong.student.model.Student;
import com.juwoong.student.service.StudentService;

public class StudentDbService implements StudentService {

	public String create(Student student) {
		// Creating student in DB
		return student.getRegistrationId();
	}

	public Student read(String registrationId) {
		// Reading student from DB
		return new Student();
	}

	public Student update(Student student) {
		// Updating student in DB
		return student;
	}

	public String delete(String registrationId) {
		// Deleting student in DB
		return registrationId;
	}

}
