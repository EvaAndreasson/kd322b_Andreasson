import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextPane;
import javax.swing.JTextField;


public class CalculatorGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private Calculator calcObject;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
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
	public CalculatorGUI() {
		calcObject = new Calculator();
		setBackground(Color.GRAY);
		setTitle("Kalkylator");
		setResizable(false);
		setForeground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 280, 324);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcObject.numberButtonPressed(7);
				int i =calcObject.getOperand();
				textField.setText(String.valueOf(i));
				
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBounds(25, 105, 45, 30);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcObject.numberButtonPressed(4);
				int i =calcObject.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBackground(Color.ORANGE);
		button.setForeground(Color.DARK_GRAY);
		button.setBounds(25, 146, 45, 30);
		contentPane.add(button);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcObject.numberButtonPressed(1);
				int i =calcObject.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_1.setBackground(Color.ORANGE);
		button_1.setForeground(Color.DARK_GRAY);
		button_1.setBounds(25, 187, 45, 30);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("8");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcObject.numberButtonPressed(8);
				int i =calcObject.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_2.setEnabled(true);
		button_2.setBackground(Color.ORANGE);
		button_2.setFont(new Font("Dialog", Font.BOLD, 15));
		button_2.setForeground(Color.DARK_GRAY);
		button_2.setBounds(82, 105, 45, 30);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcObject.numberButtonPressed(5);
				int i =calcObject.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_3.setBackground(Color.ORANGE);
		button_3.setForeground(Color.DARK_GRAY);
		button_3.setBounds(82, 146, 45, 30);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("2");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcObject.numberButtonPressed(2);
				int i =calcObject.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_4.setBackground(Color.ORANGE);
		button_4.setForeground(Color.DARK_GRAY);
		button_4.setBounds(82, 187, 45, 30);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("9");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcObject.numberButtonPressed(9);
				int i =calcObject.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_5.setBackground(Color.ORANGE);
		button_5.setForeground(Color.DARK_GRAY);
		button_5.setBounds(139, 105, 45, 30);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcObject.numberButtonPressed(6);
				int i =calcObject.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_6.setBackground(Color.ORANGE);
		button_6.setForeground(Color.DARK_GRAY);
		button_6.setBounds(139, 146, 45, 30);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("3");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcObject.numberButtonPressed(3);
				int i =calcObject.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_7.setBackground(Color.ORANGE);
		button_7.setForeground(Color.DARK_GRAY);
		button_7.setBounds(139, 187, 45, 30);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("0");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcObject.numberButtonPressed(0);
				int i =calcObject.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_8.setBackground(Color.ORANGE);
		button_8.setForeground(Color.DARK_GRAY);
		button_8.setBounds(25, 228, 45, 30);
		contentPane.add(button_8);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcObject.mult();
				textField.setText("X");
			}
		});
		btnX.setBackground(Color.GRAY);
		btnX.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnX.setBounds(207, 105, 45, 30);
		contentPane.add(btnX);
		
		JButton button_9 = new JButton("-");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcObject.minus();
				textField.setText("-");
			}
		});
		button_9.setBackground(Color.GRAY);
		button_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_9.setBounds(207, 146, 45, 30);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("+");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				calcObject.plus();
				textField.setText("+");
			}
		});
		button_10.setBackground(Color.GRAY);
		button_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_10.setBounds(207, 187, 45, 30);
		contentPane.add(button_10);
		
		JButton btnNewButton_1 = new JButton("=");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcObject.equals();
				int i =calcObject.getResult();
				textField.setText(String.valueOf(i));
			}
			
		});
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setBounds(184, 228, 68, 31);
		contentPane.add(btnNewButton_1);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcObject.clear();	
			
				textField.setText("C");
				
			}
		});
		btnC.setForeground(Color.DARK_GRAY);
		btnC.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnC.setBackground(Color.ORANGE);
		btnC.setBounds(82, 228, 45, 30);
		contentPane.add(btnC);
		
		textField = new JTextField();
		textField.setBounds(10, 29, 242, 57);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
