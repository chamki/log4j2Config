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
     //��̨��ӡ���Խ��
     System.out.println("CONSOLE������ɣ�");
     return logger.exit(false);
     
  }
}
