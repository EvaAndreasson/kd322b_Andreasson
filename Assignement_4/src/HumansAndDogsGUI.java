import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class HumansAndDogsGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private Human human;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	//private JButton newHuman;
	//private JButton printInfo;
	Human human1;
	Dog dog1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HumansAndDogsGUI frame = new HumansAndDogsGUI();
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
	public HumansAndDogsGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 436, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//btnNewButton.setBounds(159, 45, 89, 23);
		//contentPane.add(btnNewButton);
		
		JButton btnBuyDog = new JButton("Buy Dog");
		btnBuyDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dog = textField_1.getText();
				if(human1 !=null){
					dog1=new Dog(dog);
					human1.buyDog(dog1);
				}else{
					
					textField_3.setText("Error 2");
				}
				
			
			}
		});
		btnBuyDog.setBounds(159, 79, 89, 23);
		contentPane.add(btnBuyDog);
		
		JButton btnPrintInfo = new JButton("Print Info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setText(human1.getInfo());
				
				
			}
		});
		btnPrintInfo.setBounds(159, 113, 89, 23);
		contentPane.add(btnPrintInfo);
		
		textField = new JTextField();
		textField.setBounds(53, 48, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(53, 82, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblHumansAndDogs = new JLabel("Humans and Dogs");
		lblHumansAndDogs.setBounds(138, 11, 143, 23);
		contentPane.add(lblHumansAndDogs);
		
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setBounds(55, 153, 46, 14);
		contentPane.add(lblInfo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(53, 170, 324, 44);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblErrorMessage = new JLabel("Error Message");
		lblErrorMessage.setBounds(53, 225, 86, 14);
		contentPane.add(lblErrorMessage);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(53, 246, 324, 44);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewHuman = new JButton("New Human");
		btnNewHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String human = textField.getText();
				if(human.length()<3){
					textField_3.setText("Error 1");
				}else{
					human1=new Human(human);
				}
				}	
		});
		btnNewHuman.setBounds(159, 47, 89, 23);
		contentPane.add(btnNewHuman);
		
		
	}
	
	
}

