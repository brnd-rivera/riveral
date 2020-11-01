package threadScheduler;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	int seg;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 287, 145);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JProgressBar BarraProgreso1 = new JProgressBar();
		BarraProgreso1.setBounds(25, 11, 182, 23);
		contentPane.add(BarraProgreso1);
		
		JButton btnIniciar = new JButton("Correr");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Thread tiempo = new Thread() {
					public void run() {
						try {
							for(seg=1;seg<=100;seg++) {
								BarraProgreso1.setValue(seg);
								
							}
						}catch(Exception e) {e.printStackTrace();}
					}
				};
				
				tiempo.start();
			}
		});
		btnIniciar.setBounds(74, 45, 89, 23);
		contentPane.add(btnIniciar);
	}
}
