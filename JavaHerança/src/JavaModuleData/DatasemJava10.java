package JavaModuleData;

import java.time.LocalDate;

public class DatasemJava10 {
	
	public static void main(String[] args) {
		
		LocalDate dataBase = LocalDate.parse("2021-01-03");
		
		System.out.println("Data de inicio " + dataBase);
		
		System.out.println("Mais 5 dias: " + (dataBase = dataBase.plusDays(5)));
		
		System.out.println("Mais 5 semanas: " + ( dataBase = dataBase.plusWeeks(5)));
		
		System.out.println("Mais 5 Anos: " + (dataBase = dataBase.plusYears(5)));
		
		System.out.println("Mais 5 Meses: " + (dataBase = dataBase.plusMonths(5)));
		
		System.out.println("Menos 1 Ano: " + (dataBase = dataBase.minusYears(1)));
		
		
		
	}

}
