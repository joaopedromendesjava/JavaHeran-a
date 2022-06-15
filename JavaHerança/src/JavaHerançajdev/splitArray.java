package JavaHerançajdev;

import java.util.Arrays;
import java.util.List;


public class splitArray {

		public static void main(String[] args) {
			
			String texto = "joao pedro, curso java, 80, 70, 90, 89, 88 ";
			
			String[] valoresArray = texto.split(",");
			
			System.out.println("nome: " + valoresArray[0]);
			System.out.println("curso: " + valoresArray[1]);
			System.out.println("nota 1: " + valoresArray[2]);
			System.out.println("nota 2: " + valoresArray[3]);
			System.out.println("nota 3: " + valoresArray[4]);
			System.out.println("nota 4: " + valoresArray[5]);
			System.out.println("nota 5: " + valoresArray[6]);
			
			// convertendo um Array em uma lista
			
			List<String> list = Arrays.asList(valoresArray);
			
			for (String valorString : list) {
				System.out.println(valorString);
				
			}
			

			//converter uma lista para Array
			
			String[] conversaoArray = list.toArray(new String[6]);
			
			for (int pos =0; pos < conversaoArray.length; pos++) {
				System.out.println(conversaoArray[pos]);
			}
			
			
			
		}
}
