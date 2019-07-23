package com.dispatcher;
import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.mvc.Controller;



public class Dispatcherss extends HttpServlet {
       ApplicationContext context=null;
       ApplicationContext rootcontext=null;
	
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		       String sname=config.getServletName();
		      // root application context created checking
		       //if not exit
		       String resource="/WEB-INF"+sname+"-servlet.xml";
		   ServletContext servletContext=    config.getServletContext();
		                    
		      //  context=new  ClassPathXmlApplicationContext(passsPath resource,rootCOnte);
		        
		         
		
		super.init(config);
	}


	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
                  
		
		HandlerMapping  map=context.getBean(HandlerMapping.class);
		                   //handl ampping passthe request
		                    //return controller id
		
		    //Controller c=   context.getBean(id,Conteoll.class);
		       //   mav=  c.handleRequest(request, response);
		            
		          // passin gto thr view resolver 
		                    //jstl view
		          //jsp locaton and jsp name
		          
		         req.getRequestDispatcher("jsp").forward(req, res); 
		
		//super.service(req, req);
	}


            
}
