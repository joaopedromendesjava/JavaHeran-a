package JavaThreadFP;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog{
	
	// painel criado juntamente com o controlador de posioc dos componentes
		private JPanel jPanel = new JPanel(new GridBagLayout()); // painel de componentes
		
	// componentes sempre escritos em cima
		private JLabel descricaoHora = new JLabel("NOME");	
		private JTextField mostraTempo = new JTextField();
		
		private JLabel descricaoHora2 = new JLabel("EMAIL");	
		private JTextField mostraTempo2 = new JTextField();
		
		private JButton jButton = new JButton("Add lista");
		private JButton jButton2 = new JButton("Stop");
		private JButton jButton3 = new JButton("Finalizar Programa");
		
		private implementacaoFilaThread fila = new implementacaoFilaThread();
		
		public TelaTimeThread() { // executa o que estiver dentro no momento da abertura ou execu��o 
			
			setTitle("Minha tela de tempo com thread");
			setSize(new Dimension(300, 290));
			setLocationRelativeTo(null);
			setResizable(true);
			// primeira parte concluida
			
			GridBagConstraints gridbagConstraints = new GridBagConstraints();// controlador de posicionamento de componentes	
			gridbagConstraints.gridx = 0; // linha
			gridbagConstraints.gridy = 0; // coluna
			gridbagConstraints.gridwidth = 2;
			gridbagConstraints.insets = new Insets(5, 10 , 5, 5);
			gridbagConstraints.anchor = GridBagConstraints.WEST;
			
			descricaoHora.setPreferredSize(new Dimension(200, 25));
			jPanel.add(descricaoHora, gridbagConstraints);
			
			mostraTempo.setPreferredSize(new Dimension(200,25));
			gridbagConstraints.gridy ++;
			jPanel.add( mostraTempo,gridbagConstraints);
			
			descricaoHora2.setPreferredSize(new Dimension(200, 25));
			gridbagConstraints.gridy++;
			jPanel.add(descricaoHora2, gridbagConstraints);
			
			mostraTempo2.setPreferredSize(new Dimension(200, 25));
			gridbagConstraints.gridy++;
			jPanel.add(mostraTempo2, gridbagConstraints);
			
			gridbagConstraints.gridwidth = 1;
			
			
			jButton.setPreferredSize(new Dimension(92, 25));
			gridbagConstraints.gridy ++;
			jPanel.add(jButton, gridbagConstraints);
			
			jButton2.setPreferredSize(new Dimension(92, 25));
			gridbagConstraints.gridx ++;
			jPanel.add(jButton2, gridbagConstraints);
				
			jButton3.setPreferredSize(new Dimension(200, 25));
			gridbagConstraints.gridy ++;
			jPanel.add(jButton3, gridbagConstraints);
		
			
			
		
			
			jButton.addActionListener(new ActionListener() { // executa o clique no botao
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					if(fila == null) {
						fila = new implementacaoFilaThread();
						fila.start();
						
						
						
					}
					for (int qtd =0; qtd <100; qtd++) { // simulando 100 envios em massa
					
					ObjetoFilaThread filaThread = new ObjetoFilaThread();
					filaThread.setNome(mostraTempo.getText());
					filaThread.setEmail(mostraTempo2.getText() + " - " + qtd);
					
					fila.add(filaThread);

						}
					
				}	
			});
			
			jButton2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					fila.stop();
					System.out.println("fila em stop");
					fila = null;
					
					
				
				}
			});
			
			jButton3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					
					
					
				}
			});
			
			fila.start();	
			add(jPanel, BorderLayout.WEST);
		
			setVisible(true); // sempre ser� o ultimo comando a ser executado, torna a tela visivel
		}
		
		

}
	

