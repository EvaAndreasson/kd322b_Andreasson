
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.swing.JTextArea;


public class elements extends JFrame {
	
	private Bargraph bargraph;
	
			
	public elements() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5, 5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		doc = openXmlFile("ht2013_antagning.xml");
		
		Node n = doc.getDocumentElement();
		
		String root = n.getNodeName();
		
		programsList=loadAllPrograms();
		getContentPane().setLayout(null);
		
		JLabel lblFrstaElementetrooten = new JLabel("F\u00F6rsta elementet (rooten):" + root);
		lblFrstaElementetrooten.setBounds(30, 11, 234, 14);
		getContentPane().add(lblFrstaElementetrooten);
		
		JLabel lblAntalProgram = new JLabel("Antal program:" + programsList.size());
		lblAntalProgram.setBounds(30, 36, 206, 14);
		getContentPane().add(lblAntalProgram);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setBounds(30, 61, 369, 20);
		getContentPane().add(comboBox);
		comboBox.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent graph){
				
				int index = comboBox.getSelectedIndex();
				Programs prog = programsList.get(index);
				bargraph.updateValues(prog.getWomen(),prog.getMen());
										
				System.out.println("vi valde : " + prog.getName());
				System.out.println("Plats:" + index);
				System.out.println(index);
			}
		});
		
		comboBox.setModel(new DefaultComboBoxModel(programsList.toArray()));
		
		bargraph = new Bargraph(0, 0);
		bargraph.setBounds(30, 108, 356, 248);
		getContentPane().add(bargraph);
		
		
				
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Document doc;

	private ArrayList<Programs> programsList = new ArrayList<Programs>();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					elements frame = new elements();
					frame.setVisible(true);
					}catch (Exception e) {
					e.printStackTrace();
				}
				}	
				});
			}		
			private ArrayList<Programs> loadAllPrograms(){
				ArrayList<Programs> output = new ArrayList<Programs>();
							
				//hämta alla program
				NodeList programs = doc.getElementsByTagName("Program");
				for (int i=0; i<programs.getLength(); i++){
					
					//gör om varje nod i listan till ett element
					Node node=programs.item(i);
					Element elm = (Element) node;
					
					//hämta data från elementet
					String name = elm.getElementsByTagName("name").item(0).getTextContent();
					String code = elm.getElementsByTagName("code").item(0).getTextContent();
					int women = Integer.parseInt(elm.getElementsByTagName("women").item(0).getTextContent());
					int men = Integer.parseInt(elm.getElementsByTagName("men").item(0).getTextContent());
					
					Programs program = new Programs(name, code, women, men);
					output.add(program);
				}
				return output;
				
				
			
	}
	
	private Document openXmlFile(String fileName) {
		Document doc=null;
		try{
			File fXmlFile = new File(fileName);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();
		}	catch (Exception e) {
			e.printStackTrace();
		}
		return doc;
}
}
		
	
