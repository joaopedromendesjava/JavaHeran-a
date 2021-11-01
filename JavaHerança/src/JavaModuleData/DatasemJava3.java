package JavaModuleData;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatasemJava3 {

	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance(); // pega a data atual
		
		// simular que a data veio do banco de dados
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("21-10-2021")); // definindo uma data qualquer
		
		calendar.add(Calendar.DAY_OF_MONTH, 10); // data de hoje mais 10 dias / ou subtraindo a data do dia
		System.out.println("Somando o dia do mês " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.MONTH, 1); // somando o mes ou subtraindo
		System.out.println("Somando o mês ou subtraindo " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

		calendar.add(Calendar.YEAR, 1); // somando o ano ou subtraindo
		System.out.println("Somando o Ano " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
	}
	
}
