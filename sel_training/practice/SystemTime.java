package practice;

import java.sql.Timestamp;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SystemTime {

	public static void main(String[] args) {
		long we = System.currentTimeMillis();

		LocalDate Date = java.time.LocalDate.now();
		LocalDateTime Datetime = java.time.LocalDateTime.now();

		DayOfWeek dayofWeek = java.time.DayOfWeek.of(1);

		Timestamp ts = new Timestamp(System.currentTimeMillis());

		System.out.println("ishan" + we);

		System.out.println(ts);
		System.out.println(Date);
		System.out.println(Datetime);
		System.out.println(dayofWeek);

	}

}
