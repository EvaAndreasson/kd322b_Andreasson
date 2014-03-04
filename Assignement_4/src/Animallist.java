import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;


public class Animallist extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ArrayList <Animals> myAnimals;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Animallist frame = new Animallist();
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
	public Animallist() {
		myAnimals= new ArrayList<Animals>();
		myAnimals.add(new Dogs ("Scott", 2,"medium"));
		myAnimals.add(new Cats ("Wiskas", 1, 5));
		myAnimals.add(new Snakes ("Glasögonorm", 8));
		myAnimals.add(new Dogs ("Happy", 4, "small"));
		myAnimals.add(new Cats ("Toppy", 2, 10));
		myAnimals.add(new Snakes ("Pyton", 10));
		myAnimals.add(new Dogs ("Theo", 4,"large"));
		myAnimals.add(new Cats ("Miss decibel", 2, 2));
		myAnimals.add(new Snakes ("Cobra", 20));
		myAnimals.add(new Dogs ("Delila", 1,"small"));
		
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.CENTER);
		
		for(int i=0; i<myAnimals.size(); i++){
		Animals currentAnimal = myAnimals.get(i);
		textArea.append(currentAnimal.getInfo() + "\n");
		
	}
	
		
	}
}

