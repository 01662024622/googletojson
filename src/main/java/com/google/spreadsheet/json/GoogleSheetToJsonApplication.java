package com.google.spreadsheet.json;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableTransactionManagement
@Slf4j
@EnableScheduling
//@EntityScan(basePackages = {"com.google.spreadsheet.facebook.model"})
//@EnableJpaRepositories(basePackages = {"com.google.spreadsheet.json.repository"})
public class GoogleSheetToJsonApplication
		implements CommandLineRunner
{

//	PageSchedule pageSchedule;
//	@Autowired
//	PostSchedule postSchedule;
	public static void main(String[] args) {
		SpringApplication.run(GoogleSheetToJsonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.printf("xx");
	}
}
