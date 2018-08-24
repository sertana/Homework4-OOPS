package hw4;

public class MovieSequal extends Movies {
	@Override
	public void lilSome(String name, String actor, int releaseYear, double boEarn) {
		System.out.println(actor + " "+"in"+" "+name+" "+"earned"+ boEarn+" " + "in "+releaseYear);
	}

}
