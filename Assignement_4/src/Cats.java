
public class Cats extends Mammals {
	private int lifes;
	public Cats(String name, int nurseTime, int lifes) {
		super(name, nurseTime);
		this.lifes=lifes;
		// TODO Auto-generated constructor stub
	}

	
	public int getLife(){
		return lifes;
	}
	
	public int getNurseTime(){
		return nurseTime;
		
	}
	
	public String getName(){
		return name;
		
	}

	@Override
	public String getInfo() {
		String info= "The cat " + this.name + " nurses for " + this.nurseTime + " months and has " + this.lifes + " lifes";
		return info;
	}
	

}
