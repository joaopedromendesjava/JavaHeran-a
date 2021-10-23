package JavaThread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class implementacaoFilaThread extends Thread {
	
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = 
			         new ConcurrentLinkedQueue<ObjetoFilaThread>();
			
	public static void add(ObjetoFilaThread filaThread) {
		pilha_fila.add(filaThread);
	}
	
	
	
	@Override
	public void run() {
		Iterator iteracao = pilha_fila.iterator();
		
		synchronized (iteracao) { // bloquear o acesso a essa lista por outros processos
			
			
			while(iteracao.hasNext()) { // enquanto conter dados na lista ira processar
				
				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next(); // pega o objeto atual
				
				// processar 10 mil notas fiscais
				// gerar uma lista enorme de pdf
				// gerar um envio em massa de email
				
				System.out.println("---------------------------------------");
				
				System.out.println(processar.getEmail());
				System.out.println(processar.getNome());
				
				
				
				iteracao.remove();
				
				try {
					Thread.sleep(100); // dar um tempo pra descarga de memoria
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}
		
		try {
			Thread.sleep(1000); // processou toda a lista da um tempo pra descarga de memoria
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
