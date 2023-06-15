package com.wileyedge.service;

import java.util.List;

import com.wileyedge.dao.IDao;
import com.wileyedge.dao.StudentDao;
import com.wileyedge.model.Student;

public class StudentService implements IService {

	private IDao dao;
	
	public StudentService() {
		dao = new StudentDao();
	}
	
	@Override
	public void saveStudentsInfo(List<Student> list) {
		for(Student s : list) {
			dao.saveStudent(s);
		}

	}

}
