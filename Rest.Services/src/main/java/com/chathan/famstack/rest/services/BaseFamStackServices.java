package com.chathan.famstack.rest.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseFamStackServices {
	
	private static final Logger logger = LogManager.getLogger();
	
	public void logDebug(String message) {
		logger.debug(message);
	}
	
	public void logInfo(String message) {
		logger.info(message);
	}
	
	public void logError(String message) {
		logger.error(message);
	}

	public void logTrace(String message) {
		logger.trace(message);
	}
	
	public boolean isLogDebugEnabled() {
		return logger.isDebugEnabled();
	}
	
	public boolean isLogInfoEnabled() {
		return logger.isInfoEnabled();
	}
	
	public Logger getLogger() {
		return logger;
	}

}
