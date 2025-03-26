package com.study.spring.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import lombok.Data;

@Data
public class SimpleBbsDto {
	private int id;
	private String title;
	private LocalDateTime wdate;
	private String writer;
	private String category;
	
	public String getFormatterDate() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy.MM.dd");
		
		return wdate != null ? wdate.format(formatter): "";
		
	}
}