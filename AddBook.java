/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.bean.BookBean;
import com.example.dao.BookDao;
@WebServlet("/AddBook")
public class AddBook extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.println("<head>");
		out.println("<title>Add Book Form</title>");
		out.println("<link rel='stylesheet' href='bootstrap.min.css'/>");
		out.println("</head>");
		out.println("<body>");
                
		request.getRequestDispatcher("addbookform.html").include(request, response);
		out.println("<div class='container'>");
                
		String name=request.getParameter("name");
		String author=request.getParameter("author");
		String publisher=request.getParameter("publisher");
		String subject=request.getParameter("subject");
                String link=request.getParameter("link");
		BookBean bean=new BookBean(name,author,publisher,subject,link);
		int i=BookDao.save(bean);
		if(i>0){
			out.println("<h3>Book saved successfully</h3>");
                        request.getRequestDispatcher("logout.html").include(request, response);
		}
		
		
		request.getRequestDispatcher("footer.html").include(request, response);
		out.close();
	}

}
