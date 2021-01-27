package com.ss.basics.weekone;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.TemporalAdjuster;
import java.time.LocalDateTime;

public class DatTime {
	//1.  Class to store birthday - Local DateTime
	LocalDateTime birthday = LocalDateTime.now();
	
	public static void main(String[] args) {
		
		//1.  Class to store birthday - Local DateTime
		LocalDateTime birthday = LocalDateTime.now();
		
		System.out.println(birthday);
		
		// 2. ZoneId vs ZoneOffset 
		
		//Zone Id is the representative of a specific time zone
		ZoneId zoneId = ZoneId.of("Europe/Berlin");
		System.out.println(zoneId);
		//Zone offset represents the exact time awy from GMT
		LocalDateTime now = LocalDateTime.now();
		ZoneId zone = ZoneId.of("Europe/Berlin");
		ZoneOffset zoneOffSet = zone.getRules().getOffset(now);
		System.out.println(zoneOffSet);
						
		
	}
	
	
}
