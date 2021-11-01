package JavaModuleData;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasemJava7 {

	public static void main(String[] args) {
		
		LocalDate localdate = LocalDate.now();
		System.out.println("Data atual: " + localdate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Dia da semana: " + localdate.getDayOfWeek());
		
		System.out.println("Dia da semana em numero: " + localdate.getDayOfWeek().ordinal());
		
		System.out.println("Dia do ano: " + localdate.getDayOfYear());
		
		System.out.println("M�s " + localdate.getMonth() );
		System.out.println("M�s de numero: " + localdate.getMonthValue());
		System.out.println("Dia do M�s: " + localdate.getDayOfMonth());
		
		System.out.println("Ano " + localdate.getYear());
			
		
	}
}
