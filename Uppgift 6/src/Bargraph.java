import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;


public class Bargraph extends JComponent {
	
	private int women;
	private int men;
	private float total;
	private float percentage;
	
	private int updateValues;
	
	int x = 0;
	int y = 50;
	int width = getWidth();
	int height = getHeight();


	public Bargraph(int women, int men) {
		this.women=women;
		this.men=men;
		
	}

	public void updateValues(int women, int men){
		this.women=women;
		this.men=men;
		this.total=this.men + this.women;
		this.repaint();
		width = getWidth();
		height = getHeight();

	}
	
	@Override
	public void paintComponent(Graphics graph){
		
		if(women>=0){
			float percentage = (women/total);
			System.out.println("percentage" + percentage);
			float pixelValue = (int)(height*percentage);
			int bar = (int) (height - pixelValue); 
			
			graph.setColor(Color.red);
			graph.fillRect(0, bar+20, 50, (int)pixelValue); 	
				
		}
	
		if(men>=0){
			float percentage = (men/total);
			System.out.println("percentage" + percentage);
			float pixelValue = (int)(height*percentage);
			int bar = (int) (height - pixelValue); 
			
			graph.setColor(Color.blue);
			graph.fillRect(100, bar+20, 50, (int)pixelValue); 
			
		}
		
		if(total>=0){
			graph.setColor(Color.black);
			graph.drawString("Antal sökande: " + total, 50,10);
			
			
		}
		
		super.paintComponent(graph);	
		System.out.println(total);
		}
		

		
	}

	
	
