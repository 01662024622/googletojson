package com.google.spreadsheet.json;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@Slf4j
@EnableScheduling
public class GoogleSheetToJsonApplication
{

	public static void main(String[] args) {
		SpringApplication.run(GoogleSheetToJsonApplication.class, args);
	}


}
