package com.cicd.jenkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	/*	try {
			int i=0;
			if(i==0) {
				throw new Exception();
			}
		}catch(Exception ex) {
			throw ex;
		}*/
	}

}
