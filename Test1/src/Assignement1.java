import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;


public class Assignement1 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtAnders;
	private JTextField txtAndersson;
	private JTextField textField_3;
	private JTextField txtBjrkallen;
	private JTextField textField_5;
	private JTextField txtMalm;
	private JTextField textField_7;
	private JTextField txtAaanderssongmailcom;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Assignement1 frame = new Assignement1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
			//gui.setTitle("Fitnesscenter");
	}

	/**
	 * Create the frame.
	 */
	public Assignement1() {
		setBackground(new Color(204, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 573, 800);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
		
		JCheckBoxMenuItem chckbxmntmSkrivUt = new JCheckBoxMenuItem("Skriv ut");
		mnArkiv.add(chckbxmntmSkrivUt);
		
		JCheckBoxMenuItem chckbxmntmAvsluta = new JCheckBoxMenuItem("Avsluta");
		mnArkiv.add(chckbxmntmAvsluta);
		
		JMenu mnMedlem = new JMenu("Medlem");
		menuBar.add(mnMedlem);
		
		JCheckBoxMenuItem chckbxmntmNyMedlem = new JCheckBoxMenuItem("Ny medlem");
		mnMedlem.add(chckbxmntmNyMedlem);
		
		JCheckBoxMenuItem chckbxmntmHittaMedlem = new JCheckBoxMenuItem("Hitta medlem");
		mnMedlem.add(chckbxmntmHittaMedlem);
		
		JMenu mnHjlp = new JMenu("Hj\u00E4lp");
		menuBar.add(mnHjlp);
		
		JCheckBoxMenuItem chckbxmntmHjlp = new JCheckBoxMenuItem("Hj\u00E4lp");
		mnHjlp.add(chckbxmntmHjlp);
		
		JCheckBoxMenuItem chckbxmntmOm = new JCheckBoxMenuItem("Om");
		mnHjlp.add(chckbxmntmOm);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 153, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 204, 255));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
			
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(32, 31, 359, 102);
		panel.add(scrollPane);
		
		scrollPane.setViewportView(table);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Hans", "Nilsson", "550505-5555"},
				{"Olof ", "Nilsson", "450606-6666"},
				{"Peter", "Nilsson", "700404-4444"},
				{"Olivia ", "Olsson", "850909-9999"},
				{"Rut", "Persson", "450707-7777"},
				{"Stefan", "Svensson", null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"F\u00F6rnamn", "Efternamn", "Personnummer"
			}
		));
		scrollPane.setViewportView(table_1);
		
		txtAnders = new JTextField();
		txtAnders.setText("Anders");
		txtAnders.setBounds(134, 194, 257, 20);
		panel.add(txtAnders);
		txtAnders.setColumns(10);
		
		JLabel lblNamn = new JLabel("F\u00F6rnamn");
		lblNamn.setBounds(32, 203, 78, 14);
		panel.add(lblNamn);
		
		JLabel lblEfternamn = new JLabel("Efternamn");
		lblEfternamn.setBounds(32, 228, 60, 14);
		panel.add(lblEfternamn);
		
		txtAndersson = new JTextField();
		txtAndersson.setText("Andersson");
		txtAndersson.setBounds(134, 219, 257, 20);
		panel.add(txtAndersson);
		txtAndersson.setColumns(10);
		
		JLabel lblPersonnummer = new JLabel("Personnummer");
		lblPersonnummer.setBounds(32, 253, 99, 14);
		panel.add(lblPersonnummer);
		
		textField_3 = new JTextField();
		textField_3.setText("550505-5555");
		textField_3.setBounds(134, 244, 84, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblGatuadress = new JLabel("Gatuadress");
		lblGatuadress.setBounds(32, 278, 84, 14);
		panel.add(lblGatuadress);
		
		txtBjrkallen = new JTextField();
		txtBjrkallen.setText("Bj\u00F6rkallen 23");
		txtBjrkallen.setBounds(134, 269, 257, 20);
		panel.add(txtBjrkallen);
		txtBjrkallen.setColumns(10);
		
		JLabel lblOrt = new JLabel("Postnummer");
		lblOrt.setBounds(32, 303, 78, 14);
		panel.add(lblOrt);
		
		textField_5 = new JTextField();
		textField_5.setText("25500");
		textField_5.setBounds(134, 294, 40, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblOrt_1 = new JLabel("Ort");
		lblOrt_1.setBounds(134, 300, 46, 14);
		panel.add(lblOrt_1);
		
		txtMalm = new JTextField();
		txtMalm.setText("Malm\u00F6");
		txtMalm.setBounds(218, 294, 173, 20);
		panel.add(txtMalm);
		txtMalm.setColumns(10);
		
		JLabel lblTelefonnummer = new JLabel("Telefonnummer");
		lblTelefonnummer.setBounds(32, 327, 99, 14);
		panel.add(lblTelefonnummer);
		
		textField_7 = new JTextField();
		textField_7.setText("040-151515");
		textField_7.setBounds(134, 318, 84, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblEmail = new JLabel("e-mail");
		lblEmail.setBounds(32, 349, 46, 14);
		panel.add(lblEmail);
		
		txtAaanderssongmailcom = new JTextField();
		txtAaanderssongmailcom.setText("aa.andersson@gmail.com");
		txtAaanderssongmailcom.setBounds(134, 343, 257, 20);
		panel.add(txtAaanderssongmailcom);
		txtAaanderssongmailcom.setColumns(10);
		
		JButton btnSpara = new JButton("Spara");
		btnSpara.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSpara.setForeground(Color.BLUE);
		btnSpara.setToolTipText("Klicka f\u00F6r att spara \u00E4ndring");
		btnSpara.setBounds(300, 374, 89, 23);
		panel.add(btnSpara);
		
		JButton btnNyMedlem = new JButton("Ny medlem");
		btnNyMedlem.setForeground(Color.BLUE);
		btnNyMedlem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNyMedlem.setToolTipText("Registrering av ny medlem");
		btnNyMedlem.setBounds(32, 160, 118, 23);
		panel.add(btnNyMedlem);
		
		JLabel lblOrt_2 = new JLabel("Ort");
		lblOrt_2.setBounds(184, 300, 46, 14);
		panel.add(lblOrt_2);
		
		JLabel lblMedlemsversikt = new JLabel("Medlems\u00F6versikt");
		lblMedlemsversikt.setBounds(32, 11, 547, 14);
		panel.add(lblMedlemsversikt);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Assignement1.class.getResource("/Image/aa1.jpg")));
		lblNewLabel.setBounds(419, 197, 70, 100);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Assignement1.class.getResource("/Image/fitness_image_2.jpg")));
		lblNewLabel_1.setBounds(32, 352, 400, 400);
		panel.add(lblNewLabel_1);
	}
}
