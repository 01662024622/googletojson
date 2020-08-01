package com.google.spreadsheet.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.spreadsheet.json.model.Phonetic;
import com.google.spreadsheet.json.services.impl.GoogleToJsonServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

@SpringBootApplication
@Slf4j
@EnableScheduling
public class GoogleSheetToJsonApplication implements CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(GoogleSheetToJsonApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		String idFile = "1GUnx5sRsc7Vd6KtQYrcCh9AWaCtqB9Vjwd9ffWB1Rvc";
		ObjectMapper objectMapper = new ObjectMapper();
		GoogleToJsonServiceImpl googleToJsonService = new GoogleToJsonServiceImpl();
		List<Phonetic> phonetics = googleToJsonService.importData(idFile);
		if (phonetics.size()>0){
			objectMapper.writeValue(new File("target/"+idFile+".json"), phonetics);
		}
		log.info(phonetics.toString());
	}
}
