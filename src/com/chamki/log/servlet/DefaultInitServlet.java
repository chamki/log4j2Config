package com.chamki.log.servlet;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class DefaultInitServlet
 */
@WebServlet("/DefaultInitServlet")
public class DefaultInitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Logger logger = LoggerFactory.getLogger(DefaultInitServlet.class);  ;
	
	public void init() throws ServletException {  
	    String configRoot = this.getInitParameter("configRoot");  
	    String log4j2Config = configRoot + File.separator + this.getInitParameter("log4j2Config");  
	    File file = new File(log4j2Config);  
	    
        LoggerContext context =(LoggerContext)LogManager.getContext(false);  
        context.setConfigLocation(file.toURI());  
          
        //重新扫描配log4j2.xml置文件
        context.reconfigure(); 
        logger.info("初始化日志文件配置");
	
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
