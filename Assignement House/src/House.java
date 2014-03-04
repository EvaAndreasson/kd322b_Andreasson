
public class House {  //klassmetod
	private int year; //instansvariable
	private int size; // instansvariable
	private static int nbrOfHouses; // instansvariable
	public static final int MIN_SIZE =10; //den innehåller en statisk variable
	public House(int _year,int _size){ //Konstruktor
		this.year = _year; 
		this.size = _size;
		nbrOfHouses +=1;
	}
	public static int getNbrHouses(){ //instansmetod
	return nbrOfHouses;
	}
	public int getYear(){ //instansmetod
	return year;
	}
	public int getSize(){ // instansmetod
	return size;
	}
}


	