
public class Dogs extends Mammals {
	private String size;
	
	
	public Dogs(String name, int nurseTime, String size) {
		super(name, nurseTime);
		this.size=size;
		
		// TODO Auto-generated constructor stub
	}

	


	public String getSize(){
		return size;
		
	}
	
	public int getNurseTime(){
		return nurseTime;
		
	}
	
	public String getName(){
		return name;
		
	}

	@Override
	public String getInfo() {
		String info = "The dog " + this.name + " nurses for " + this.nurseTime + " months and is a " + this.size + " size";
 		return info;
	}
	
}


