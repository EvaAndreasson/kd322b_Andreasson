

public class Snakes extends Animals{
	private int length;
	private String name;
	
	// constructor
	public Snakes(String name, int length) {
		super(name);
		this.length=length;
		
	}
	
	public int getLength(){
		return length;
		
	}
	public String getName(){
		return name;
	}
	@Override
	public String getInfo() {
		String info= "The snake " + this.name + " is " + this.length + " long";
		return info;
	}		
}


	