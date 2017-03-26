package com.mlq.love;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.mlq.love.entity.Log4j2Entity;
 
public class TestLog4j2 {
	
  private static final Logger logger = LogManager.getLogger(TestLog4j2.class);
  
  public static void main(String[] args){
     logger.trace("Appliaction is entering the Log4j2Entity...");
     if(!Log4j2Entity.printTestString()){
        logger.error("Didn`t do it");
     }
     //打印数据
System.out.println("application is ended!");
     logger.trace("Appliaction is exiting the Log4j2Entity...");
  }
}
