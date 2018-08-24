package hw4;

public class Movies {
	String name="";
	String actor="";
	int releaseYear;
	double boEarn;
	
	public Movies() {
		
	}
	public Movies(String name) {
		this.name= name;
		System.out.println("I have watched "+ name);
	}
	
	public Movies(String name, int releaseYear) {
		this.name=name;
		this.releaseYear=releaseYear;
		
	}
	public Movies(String name,  String actor, int releaseYear, double boEarn) {
		this.name=name;
		this.actor=actor;
		this.releaseYear= releaseYear;
		this.boEarn=boEarn;
		
	}

	public void title(String name) {
		System.out.println(name);
	}
	public void lilSome(String name, String actor, int releaseYear, double boEarn) {
		System.out.println(name + " "+"with"+" "+actor+" "+"earned"+ boEarn+" " + "in "+releaseYear);
	}
	public void lilSome(String name, int releaseYear) {
		System.out.println(name+" was released in "+releaseYear);
	}
}