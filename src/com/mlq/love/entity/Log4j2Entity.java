package com.mlq.love.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
 
public class Log4j2Entity {
  private static final Logger logger = LogManager.getLogger(Log4j2Entity.class);
  
  public static boolean printTestString(){
     logger.entry();
     System.out.println("�����ڲ���ʹ��Log4j2");
     logger.error("Did it again");
     logger.info("������ɣ�");
     //打印数据
     System.out.println("CONSOLE输出数据");
     logger.info("输出日志信息");
     return logger.exit(false);
     
  }
}
