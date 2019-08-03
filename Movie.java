public class Movie 
{
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	private String _title;
	private int _priceCode;
	public Price price;

	public Movie(String title, int priceCode)
	{
		_title = title;
		setPriceCode(priceCode);
	}
	public int getPriceCode() 
	{
		return price.getPriceCode();
	}

	public void setPriceCode(int arg)
	{
		if(arg == REGULAR)
			price = new RegularPrice();
		else if(arg == CHILDRENS)
			price = new ChildrensPrice();
		else if(arg == NEW_RELEASE)
			price = new NewReleasePrice();
	}

	public String getTitle ()
	{
		return _title;
	}

	public double getCharge(int daysRented) 
	{
		return price.getCharge(daysRented);
	}

	public int getFrequentRenterPoints(int daysRented)
	{
		return price.getFrequentRenterPoints(daysRented);
	}
 }