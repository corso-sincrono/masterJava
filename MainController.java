package com.dvdStore.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dvdStore.model.Actor;
import com.dvdStore.model.ActorImpl;

/**
 * Servlet implementation class MainController
 */
@WebServlet("/MainController")
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String p=request.getParameter("param");
		
		ActorImpl aim=new ActorImpl();
		ArrayList<Actor> list=null;
		RequestDispatcher disp=null;
		
		if(p.equals("1")) {
			
			list=aim.getAll();
			disp=request.getRequestDispatcher("views/allActor.jsp");
			request.setAttribute("fullList", list);
			disp.forward(request, response);
			
			
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String id=request.getParameter("id");
		Actor a=new ActorImpl().findById(Integer.parseInt(id));
		
		RequestDispatcher disp=request.getRequestDispatcher("views/byId.jsp");
		
		request.setAttribute("attore", a);
		disp.forward(request, response);
	}

}
