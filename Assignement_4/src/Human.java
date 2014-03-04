
public class Human {
	private Dog dog;
	private String name;
	
	//constructor
	public Human(String human){
		this.name=human;
	}
	public String getName(){
		return name;
	}
	public void buyDog(Dog dogs){
		this.dog=dogs;
		
	}
	public String getInfo(){
		String s="";
		if(dog!=null){
			s=getName() + " äger en hund som heter" + dog.getName();
		}else{
			s=getName() + " äger inte en hund";
		}
		
		return s;
		
	}

	
	}


