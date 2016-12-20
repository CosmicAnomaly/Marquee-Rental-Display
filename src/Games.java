
/**
 * @author Scott Robinson
 * Date: Spring Semester 2016
 * 
 * This is our Games Class. It is where the Games being held by our Rental Store are first constructed.
 * In this Class we are able to control how we want our game rentals priced based on the inherited PriceOfRental method.
 * We also control what information is visible here. This information is the most sought after when games are being rented.
 */
public class Games extends RentalStore implements PriceOfRental
{

	private String genre;
	private boolean multiplayer;
	private int yearOfRelease;
	
	public Games(String title, String genre, boolean multiplayer, int yearOfRelease) 
	{
		super(title);
		this.genre = genre;
		this.multiplayer = multiplayer;
		this.yearOfRelease = yearOfRelease;
	}//constructor Games

	public String getGenre() 
	{
		return genre;
	}//getGenre
	
	public void setGenre(String genre) 
	{
		this.genre = genre;
	}//setGenre

	public boolean isMultiplayer() 
	{
		return multiplayer;
	}//isMultiplayer

	public void setMultiplayer(boolean multiplayer) 
	{
		this.multiplayer = multiplayer;
	}//setMutiplayer

	public int getYearOfRelease() 
	{
		return yearOfRelease;
	}//getYearOfRelease

	public void setYearOfRelease(int yearOfRelease) 
	{
		this.yearOfRelease = yearOfRelease;
	}//setYearOfRelease

	@Override
	public double rentalPrice() 
	{
		if (yearOfRelease > 2012)
		{
			return 4.99;
		}
		else
		{
			return 2.99;
		}
	}//getTotalDue

	@Override
	public String toString() {
		return title + " || " + genre + " || " + "Mutiplayer: " + multiplayer + " || " + yearOfRelease + " || "
				+  rentalPrice();
	}
	
	

	
}//class Games
