package javaprogramming1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDatewithPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Please find below todays date ");
		LocalDateTime current = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss.SS");
		String formatted = current.format(formatter);
		
		System.out.println("current date and time is " +formatted);
	}

}
