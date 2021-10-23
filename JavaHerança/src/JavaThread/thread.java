package JavaThread;

import javax.swing.JOptionPane;

public class thread {

	public static void main(String[] args) throws InterruptedException {
		
		// thread processando em pararelo do envio de email
		Thread threademail = new Thread(thread1);
		threademail.start();
		
		// thread processando em pararelo em envio de nota fiscal
		Thread threadNFCE = new Thread(thread2);
		threadNFCE.start();
		
		
		// codigo do sistema do usuario continua o fluxo de trabalho
		System.out.println("Chegou ao fim do teste de codigo thread");
		
		// fluxo do sistema, cadastro de venda ou emissao de nota fiscal algo do tipo
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuario");
	
	}
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			// codigo da rotina que eu quero executar em pararelo
			
			for (int pos =0; pos < 10; pos ++) {
					// Quero executar esse envio com um tempo de parada ou com um tempo determinado
				System.out.println("Executando alguma rotina, por exemplo envio de nota fiscal");
			
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}// da um tempo para exct o codigo
				
			
			}// fim do codigo em paralelo

			
			
		}
	};
	
	
	private static  Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
	

			// codigo da rotina que eu quero executar em pararelo
			
			for (int pos =0; pos < 10; pos ++) {
					// Quero executar esse envio com um tempo de parada ou com um tempo determinado
				System.out.println("Executando alguma rotina, por exemplo envio de email");
			
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}// da um tempo para exct o codigo
				
			
			}// fim do codigo em paralelo
		
			
			
		}
	};
	
}
