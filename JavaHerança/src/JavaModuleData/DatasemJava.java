package JavaModuleData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasemJava {
	
	public static void main(String[] args) throws InterruptedException, ParseException {
		
		Calendar calendar = Calendar.getInstance();
		 
		 Date date = new Date();
		
		System.out.println("data em mile segundos " + date.getTime());
		System.out.println("Calendar em milisegundos " + calendar.getTimeInMillis());
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println("dia do mes " + date.getDate());
		System.out.println("Calendar dia do mes " + calendar.get(calendar.DAY_OF_MONTH));
		
		System.out.println("--------------------------------------------------------");
		
		
		System.out.println("dia da semana " + date.getDay());
		System.out.println("Calendar dia da semana " + (calendar.get(calendar.DAY_OF_WEEK)-1));
	
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Horas do dia " + date.getHours());
		System.out.println("Calendar Horas do dia " + calendar.get(calendar.HOUR_OF_DAY));
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Minutos do segundo da hora do dia " + date.getMinutes());
		System.out.println("Calendar Minutos do segundo da hora do dia " + calendar.get(calendar.MINUTE));
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Segundos do minuto " + date.getSeconds());
		System.out.println("Calendar segundos do minuto " + calendar.get(calendar.SECOND));
		
		System.out.println("--------------------------------------------------------");

		System.out.println("Mês do Ano " + (date.getMonth() + 1));
		System.out.println("Calendar Mês do Ano " + (calendar.get(calendar.MONTH)+1));
		
		System.out.println("--------------------------------------------------------");

		System.out.println("Ano " + (date.getYear() + 1900));
		System.out.println("Calendar Ano " + calendar.get(calendar.YEAR));
		
		System.out.println("--------------------------------------------------------");

		// Simple date formate
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		
		System.out.println("data atual em formato padrao e String " + dateFormat.format(date));
		System.out.println("Calendar data atual em formato padrao e String " + dateFormat.format(calendar.getTime()));

		System.out.println("--------------------------------------------------------");

		
		dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		System.out.println("Data em formato de banco de dados " + dateFormat.format(date));
		System.out.println("Calendar Data em formato de banco de dados " + dateFormat.format(calendar.getTime()));

		System.out.println("--------------------------------------------------------");
		
		dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Objeto Date " + dateFormat.parse("2002-01-02 "));
		
		dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Objeto Date " + dateFormat.parse("02/02/2002")); 
		 
		
		
		
	}
	
}