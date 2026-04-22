package jp.co.aforce.sample;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Two45 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);

		LocalDate Birthday = LocalDate.of(2003, 11, 03);

		long days = ChronoUnit.DAYS.between(Birthday, today);
		System.out.println(days + "日");
		
//		問３ C
//		問４ B
//		問５ A
//		問６ A
	}
}
