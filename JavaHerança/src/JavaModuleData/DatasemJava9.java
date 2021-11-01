package JavaModuleData;

import java.time.LocalDate;
import java.time.Period;

public class DatasemJava9 {
	
	public static void main(String[] args) {
		
		
		LocalDate dataAntiga = LocalDate.parse("2020-01-03");
		
		LocalDate dataNova = LocalDate.parse("2021-04-03");
		
		System.out.println("Data antiga é maior que data nova: " + dataAntiga.isAfter(dataNova));
		
		System.out.println("Data antiga é anterior a nova: " + dataAntiga.isBefore(dataNova));
		
		System.out.println("Datas sao iguais " + dataAntiga.isEqual(dataNova));
		
		
		Period periodo =  Period.between(dataAntiga, dataNova);
		
		System.out.println("Quantos Anos: " + periodo.getYears());
		
		System.out.println("Quantos Meses: " + periodo.getMonths());
		
		System.out.println("Diferença somente de Meses: " + periodo.toTotalMonths());
		
		System.out.println("Quantos Dias: " + periodo.getDays());
		
		System.out.println("A diferença de tempo é " + periodo.getYears() + " Anos " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias ");
	}

}
 