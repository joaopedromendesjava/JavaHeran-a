package JavaModuleData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasemJava5 {
	
	public static void main(String[] args) throws ParseException {
		
		Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("30/10/2021"); // data inicial
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInicial);
	
		
		for (int parcela = 1; parcela <=12; parcela++) {
			
			calendar.add(Calendar.MONTH, 1);
			
			
			System.out.println("Parcela de numero " + parcela + " vencimento � em " + 
			new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
			
			
		}

	}
}