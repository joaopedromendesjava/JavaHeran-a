package JavaModuleData;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatasemJava6 {

	public static void main(String[] args) {
		
		// nova API de data do Java 8
	
			LocalDate dataAtual = LocalDate.now();
			
			System.out.println("Data Atual: " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			
			LocalTime horaAtual = LocalTime.now();
			
			System.out.println("Horas Atual: " + horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
			
			LocalDateTime dataAtualHoraAtual = LocalDateTime.now();
			
			System.out.println("Data e hora atual " + dataAtualHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		
		
	}

}
