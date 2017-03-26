package com.mlq.love.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
 
public class Log4j2Entity {
  private static final Logger logger = LogManager.getLogger(Log4j2Entity.class);
  
  public static boolean printTestString(){
     logger.entry();
     System.out.println("我正在测试使用Log4j2");
     logger.error("Did it again");
     logger.info("测试完成！");
     //后台打印测试结果
     System.out.println("CONSOLE测试完成！");
     return logger.exit(false);
     
  }
}
