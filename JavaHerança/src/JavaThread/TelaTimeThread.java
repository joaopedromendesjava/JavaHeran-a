package JavaThread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {
	
// painel criado juntamente com o controlador de posioc dos componentes
	private JPanel jPanel = new JPanel(new GridBagLayout()); // painel de componentes
	
// componentes sempre escritos em cima
	private JLabel descricaoHora = new JLabel("Time thread 1");	
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time thread 2");	
	private JTextField mostraTempo2 = new JTextField();
	
	private JButton jButton = new JButton("Start");
	private JButton jButton2 = new JButton("Stop");
	
	private JButton jButton3 = new JButton("Finalizar Programa");
	
	private Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			
			while(true) { // fica sempre rodando
				mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").
						format(Calendar.getInstance().getTime()));
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}
	};
	private Thread thread1Time;
	
	private Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {

			while(true) {
				mostraTempo2.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	};
	private Thread thread2Time;
	
	public TelaTimeThread() { // executa o que estiver dentro no momento da abertura ou execução 
		
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
		mostraTempo.setEditable(false);
		jPanel.add( mostraTempo,gridbagConstraints);
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridbagConstraints.gridy++;
		jPanel.add(descricaoHora2, gridbagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridbagConstraints.gridy++;
		mostraTempo2.setEditable(false);
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

					thread1Time = new Thread(thread1);
					thread1Time.start();
					
					thread2Time = new Thread(thread2);
					thread2Time.start();
			
					jButton.setEnabled(false);
					jButton2.setEnabled(true);
			
			}
			
		});
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				thread1Time.stop();
				thread2Time.stop();
				
				jButton.setEnabled(true);
				jButton2.setEnabled(false);
				
			}
		});
		
		jButton3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		
		jButton2.setEnabled(false);
		
		add(jPanel, BorderLayout.WEST);
	
		setVisible(true); // sempre será o ultimo comando a ser executado, torna a tela visivel
	}
	

}
