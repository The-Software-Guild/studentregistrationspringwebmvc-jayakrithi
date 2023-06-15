package com.wileyedge.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wileyedge.model.Student;
import com.wileyedge.service.IService;
import com.wileyedge.service.StudentService;

/**
 * Servlet implementation class StudentRegistrationServlet
 */
public class StudentRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private IService service;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentRegistrationServlet() {
        super();
        service = new StudentService();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside do Post -- Updated");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String mobileno = request.getParameter("mobileno");
		String address = request.getParameter("address");
		
		Student s = new Student(name,age,mobileno,address);
	//	System.out.println(s.getName());
	//	dao.saveStudent(s);
		List<Student> studList = new ArrayList<>();
		System.out.println(s.getMobileno());
		studList.add(s);
		service.saveStudentsInfo(studList);
		
		System.out.println("Inside do Post -- Updated");
		RequestDispatcher rd = request.getRequestDispatcher("/success.jsp");
		rd.forward(request, response);
	}

}
