package overloadingandoverridingpolymorbism;

abstract class Movie
{
	abstract public void movieType();
	
}

class RomMovie extends Movie
{
	public void movieType()
	{
		System.out.println("ROMANTIC MOVIE");
	}
}

class ThrillerMovie extends Movie
{
	public void movieType()
	{
	   System.out.println("THRILLER MOVIE");
	}
}

class FantasyMovie extends Movie
{
	public void movieType()
	{
		System.out.println("FANTASY MOVIE");
	}
}
public class MovieHerarchy {

	public static void main(String[] args)
	{
		Movie m=new RomMovie();
		Movie m1=new ThrillerMovie();
		Movie m2=new FantasyMovie();
		
		m.movieType();
		m1.movieType();
		m2.movieType();
	}
}
