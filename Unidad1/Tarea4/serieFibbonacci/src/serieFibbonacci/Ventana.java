package serieFibbonacci;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Ventana extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPrimer;
	private JTextField txtSegundo;
	private JTextField txtIteracion;
	private JComboBox  cmb_Lista;

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
		setBounds(100, 100, 405, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Primer valor:");
		lblNewLabel.setBounds(28, 38, 126, 14);
		contentPane.add(lblNewLabel);
		
		txtPrimer = new JTextField();
		txtPrimer.setBounds(224, 35, 86, 20);
		contentPane.add(txtPrimer);
		txtPrimer.setColumns(10);
		
		JLabel lblLngreseElSegundo = new JLabel("Segundo valor:");
		lblLngreseElSegundo.setBounds(28, 84, 126, 14);
		contentPane.add(lblLngreseElSegundo);
		
		txtSegundo = new JTextField();
		txtSegundo.setColumns(10);
		txtSegundo.setBounds(224, 81, 86, 20);
		contentPane.add(txtSegundo);
		
		JLabel lblNewLabel_1 = new JLabel("Numero de iteraciones:");
		lblNewLabel_1.setBounds(28, 142, 175, 14);
		contentPane.add(lblNewLabel_1);
		
		txtIteracion = new JTextField();
		txtIteracion.setColumns(10);
		txtIteracion.setBounds(224, 139, 86, 20);
		contentPane.add(txtIteracion);
		
		JComboBox cmb_Lista = new JComboBox();
		cmb_Lista.setBounds(85, 179, 118, 22);
		contentPane.add(cmb_Lista);
		
		
		JButton btnListo = new JButton("Listo");
		btnListo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int _intIterador, _intValor1, _intValor2,intValor3;
				int _intSalida=0;
				 _intValor1=Integer.parseInt(txtPrimer.getText());
	            _intValor2=Integer.parseInt(txtSegundo.getText());
	            _intIterador=Integer.parseInt(txtIteracion.getText());
	           cmb_Lista.removeAllItems();
			
	            do 
	            {
	            	
	            	 intValor3=_intValor1+_intValor2;
	            	 cmb_Lista.addItem(Integer.toString(intValor3));
	            	 _intValor1=_intValor2;
	                 _intValor2=intValor3; 
	                 _intSalida++;
	        
	            }
	            while(_intSalida<_intIterador);
			}		
		});
		btnListo.setBounds(290, 231, 89, 23);
		contentPane.add(btnListo);
		
		
		;
	}
}
