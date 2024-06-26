package com.tap2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		int id=0;
		int sal=0;
		String idParam=req.getParameter("id");
		String salParam=req.getParameter("sal");
		
		try {
			if(idParam!=null &&!idParam.isEmpty()){
				id=Integer.parseInt(idParam);
			}else {
				resp.getWriter().println("Id is required.");
				return;
			}
			if((salParam!=null &&!salParam.isEmpty())) {
				sal=Integer.parseInt(salParam);
				
			}else {
				resp.getWriter().println("sal is required.");
				return;
			}
			
		}catch(NumberFormatException e) {
			resp.getWriter().println("Invalid Id Format");
			return;
		}
	
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String dept=req.getParameter("dept");
		Employee e=new Employee(id, name, email, dept, sal);
		EmployeeBo bo=new EmployeeBo();
		int i=bo.save(e);
		PrintWriter out=resp.getWriter();
		if(i==1) {
			out.print(e.getName()+" saved successfully");
		}else {
			out.print("saving unsuccesful");
		}
	}
		
	
}	
			
		

