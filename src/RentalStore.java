
/**
 * @author Scott Robinson
 * Date: Spring Semester 2016
 * 
 * The purpose of this program is for a Movie Rental Store to keep track of its media and pertinent information tied to each media.
 * 
 */
public abstract class RentalStore
{
	public String title;

	public RentalStore(String title) 
	{
		super();
		this.title = title;
	}//Constructor RentalStore

	public String getTitle() 
	{
		return title;
	}//getTitle

	public void setTitle(String title) 
	{
		this.title = title;
	}//setTitle
	
	
	
}//class RentalStore
