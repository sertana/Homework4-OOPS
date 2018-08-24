package hw4;

public class TestsForAll {

	public static void main(String[] args) {
		Movies first = new Movies("Phantom");
		first.title("Phantom");

		Movies second = new Movies("Phantom","tom",1997, 3000000.0);
		second.lilSome("Phantom","tom",1997, 3000000);
		
		StarWar2 starwar2 = new StarWar2();
		starwar2.one();
		starwar2.two();
		
		StarWar3 starwar3 = new StarWar3();
		starwar3.one();
		starwar3.two();
		starwar3.three();
		
		StarWar4 starwar4 = new StarWar4();
		starwar4.one();
		starwar4.four();
		
		MovieSequal part2 = new MovieSequal();
		part2.lilSome("Baagi","Tiger", 2017, 40);
		part2.lilSome("Baagi",2017);
		
		Cinema cinema =  new Pictures();
		cinema.boxOffice();
		cinema.title();
		
		Pictures picture = new Pictures();
		picture.cast();
		picture.director();
		picture.coreopgrapher();
		
		
		SilverScreen silverscreen = new Pictures();
		silverscreen.director();
		
		Theatre theatre1 = new Pictures();
		theatre1.drama();
		theatre1.whoIs();
		
		FiveD fived = new Pictures();
		fived.fiveDMovies();
		
		Songs song1 = new Songs();
		song1.setTrackTitle("Thriller");
		song1.setHighestRank(1);
		song1.setYear(1985);
		song1.setSingerName("Micheal Jackson");
		
		System.out.println(song1.getTrackTitle() +" sang by "+song1.getSingerName()+ " was "+song1.getHighestRank()+" in "+song1.getYear());
		
}
		
}
