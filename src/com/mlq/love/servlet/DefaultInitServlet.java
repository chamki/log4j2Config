package com.mlq.love.servlet;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

/**
 * Servlet implementation class DefaultInitServlet
 */
@WebServlet("/DefaultInitServlet")
public class DefaultInitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Logger logger;
	
	public void init() throws ServletException {  
	    String configRoot = this.getInitParameter("configRoot");  
	    String log4j2Config = configRoot + File.separator + this.getInitParameter("log4j2Config");  
	    File file = new File(log4j2Config);  
	    
        LoggerContext context =(LoggerContext)LogManager.getContext(false);  
        context.setConfigLocation(file.toURI());  
          
        //重新初始化Log4j2的配置上下文  
        context.reconfigure();  
	  
	      
	    //todo: 这里拿到的logger，已经是按新配置文件初始化的了  
	    logger = LogManager.getLogger(DefaultInitServlet.class);  
	}  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
