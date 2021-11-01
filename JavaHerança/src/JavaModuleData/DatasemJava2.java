package JavaModuleData;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasemJava2 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoboleto = simpleDateFormat.parse("10/11/2021");
		
		Date dataAtuaHoje = simpleDateFormat.parse("28/11/2021");
		
		if (dataVencimentoboleto.after(dataAtuaHoje)) { // after = depois/superior/maior da data atual
			System.out.println("Boleto nao esta vencido");
			
		}else {
			System.out.println("URGENTE - Boleto vencido");
		
		}
		if (dataVencimentoboleto.before(dataAtuaHoje)) { // before = se a data 1 for menor que a data 2
			System.out.println("URGENTE - Boleto VENCIDO");
			
		}else {
			System.out.println("Boleto nao esta vencido");
		
		}
		
}
	}
		


