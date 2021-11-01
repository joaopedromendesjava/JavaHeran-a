package JavaModuleData;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DatasemJava4 {
	
	public static void main(String[] args) {
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2002-01-02"),LocalDate.now()); // total de dias de uma data ate hoje
		
		System.out.println("possui " + dias + " dias de vida até a presente data " + LocalDate.now());  
		
	}

}
