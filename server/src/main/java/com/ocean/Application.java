package com.ocean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
*    @author
*      Front End:
*        -Angel Walker
*       -Trevor Drury
*       Back End:
*        -David Burton
*        -Shane Danner
 */


@SpringBootApplication
public class Application {

	private static final Logger LOGGER = LogManager.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);


		LOGGER.debug("Debug level log message");
		LOGGER.warn("Warning level log message");
		LOGGER.error("Error level log message");
	}

}
