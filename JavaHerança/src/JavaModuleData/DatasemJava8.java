package JavaModuleData;

import java.time.Duration;
import java.time.Instant;

public class DatasemJava8 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Instant inicio = Instant.now();
	
		Thread.sleep(2000); // pode ser um processo com um tempo qualquer que nao conhecemos 
		
		Instant ifinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		System.out.println("Duracao em nano segundos: " + duracao.toNanos());
		
		System.out.println("Duracao em minutos: " + duracao.toMinutes());

		System.out.println("Duracao em Horas: " + duracao.toHours());

		System.out.println("Duracao em milisegundos: " + duracao.toMillis());

		System.out.println("Duracao em Dias: " + duracao.toDays());

		
	}

}
