package JavaModuleData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasemJava11 {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat simpleDateFormatt = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataHoje = new SimpleDateFormat("dd/MM/yyyy").parse("01/11/2021");
		Date dataVencimentoboleto = simpleDateFormatt.parse("10/12/2021");

		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataVencimentoboleto);
	
		for (int parcela = 1; parcela <=12; parcela++) {
			
			calendar.add(Calendar.MONTH, 1);
			
			
			
			System.out.println("Parcela de numero " + parcela + " Data Atual " + 
			new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
	
			
			if (dataVencimentoboleto.after(dataHoje)) { // after = depois/superior/maior da data atual
				System.out.println("Boleto nao esta vencido");
				
			}else {
				System.out.println("URGENTE - Boleto vencido");
			
			}
		}

	}
	
}
