import java.util.ArrayList;



/**
 * @author Scott Robinson
 * Date: Spring Semester 2016
 * 
 * This is our Driver class which for the purposes of this assignment isn't doing a whole lot other than displaying what 
 * movies and games are available and how much they cost to rent.
 *
 */
public class Driver 
{
	public static void main(String[] args) 
	{
		ArrayList<Movies> moviesList = new ArrayList<Movies>();
		ArrayList<Games> gamesList = new ArrayList<Games>();
		
		Movies theDarkKnight = new Movies("The Dark Knight", "PG-13", 2008, "152 Minutes", "Action");
		Movies theMatrix = new Movies("The Matrix", "R", 1999, "136 Minutes", "Action");
		Movies deadpool = new Movies("Deadpool", "R", 2016, "108 Minutes", "Action");
		Movies savingPrivateRyan = new Movies("Saving Private Ryan", "R", 1998, "169 Minutes", "Action");
		Movies terminator2JudgmentDay = new Movies("Terminator 2: Judgement Day", "R", 1991, "137 Minutes", "Action");
		
		moviesList.add(theDarkKnight);
		moviesList.add(theMatrix);
		moviesList.add(deadpool);
		moviesList.add(savingPrivateRyan);
		moviesList.add(terminator2JudgmentDay);
		
		Games falloutFour = new Games("Fallout 4", "RPG", false, 2015);
		Games farCryPrimal = new Games("Far Cry: Primal", "Shooter", false, 2016);
		Games rocketLeague = new Games("Rocket League", "Sports", true, 2015);
		Games fifa2016 = new Games("FIFA 2016", "Sports", true, 2015);
		Games bloodborne = new Games("Bloodborne", "RPG/Adventure", true, 2015);
		
		gamesList.add(falloutFour);
		gamesList.add(bloodborne);
		gamesList.add(farCryPrimal);
		gamesList.add(fifa2016);
		gamesList.add(rocketLeague);
		
		System.out.println("Below is a list of available movies for rental and their rental price:\n");
		
		for(Movies movieListPrint : moviesList)
			System.out.println(movieListPrint);
		
		System.out.println();
		System.out.println();
		
		System.out.println("Below is a list of available games for rental and their rental price:\n");
		
		for(Games gamesListPrint: gamesList)
			System.out.println(gamesListPrint);
		
		

	}//Class main

}//Class Driver
