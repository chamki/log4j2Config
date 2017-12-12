/**
 * 
 */
package com.chamki.log.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author chamki
 * @version 1.0
 * @createtime 2017-12-12 22:58:39
 */
public class Client {
	
	private static final Logger logger = LoggerFactory.getLogger(Client.class);

	public static void main(String[] args) {
		
		logger.trace("trace level--信息");
		logger.debug("debug level--信息");
		logger.info("info level--信息");
		logger.warn("warn level--信息");
		logger.error("error level--信息");
		//logger.fatal("fatal level--信息");
	}
}
