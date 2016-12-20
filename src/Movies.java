
/**
 * @author Scott Robinson
 * Date: Spring Semester 2016
 * 
 * This is the Movies Class. It is where the Movies being held by our Rental Store are first constructed.
 * In this Class we are able to control how we want our price structured via the PriceOfRental inherited method.
 * The information being used in the constructor is the basic and most sought after information relating to Movies.
 */
public class Movies extends RentalStore implements PriceOfRental
{

	private String rating;
	private int yearOfRelease;
	private String runTime;
	private String genre;
	
	public Movies(String title, String rating, int yearOfRelease, String runTime, String genre) 
	{
		super(title);
		this.rating = rating;
		this.yearOfRelease = yearOfRelease;
		this.runTime = runTime;
		this.genre = genre;
	}//constructor Movies
	
	public String getRating() 
	{
		return rating;
	}//getRating

	public void setRating(String rating) 
	{
		this.rating = rating;
	}//setRating

	public int getYearOfRelease() 
	{
		return yearOfRelease;
	}//getYearOfRelease

	public void setYearOfRelease(int yearOfRelease) 
	{
		this.yearOfRelease = yearOfRelease;
	}//setYearOfRelease

	public String getRunTime() 
	{
		return runTime;
	}//getRunTime

	public void setRunTime(String runTime) 
	{
		this.runTime = runTime;
	}//setRunTime

	public String getGenre() 
	{
		return genre;
	}//getGenre

	public void setGenre(String genre) 
	{
		this.genre = genre;
	}//setGenre

	@Override
	public double rentalPrice() 
	{
		if (yearOfRelease > 2010)
		{
			return 2.99;
		}
		else 
		{
			return 1.49;
		}
	}//getTotalDue

	@Override
	public String toString() 
	{
		return title + " || " + rating + " || " + yearOfRelease + " || " + runTime + " || "
				+ genre + " || " + rentalPrice();
	}//toString

	
}//class Movies
