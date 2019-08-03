class Rental 
{
	private Movie _movie;
	private int _daysRented;

	public Rental(Movie movie, int daysRented) 
	{
		_movie = movie;
		_daysRented = daysRented;
	}

	public int getDaysRented() 
	{
		return _daysRented;
	}

	public Movie getMovie() 
	{
		return _movie;
	}

	public String toString()
	{
		return getMovie() + " " + "[" + _daysRented + "]";
	}
	
	public double getCharge() 
	{
		double result = 0;
		if(getMovie().getPriceCode() == Movie.REGULAR)
		{
			result += 2;
			if(getDaysRented() > 2)
				result += (getDaysRented() - 2) * 1.5;
		}
		if(getMovie().getPriceCode() == Movie.NEW_RELEASE)
		{
			result += getDaysRented() * 3;
		}
		if(getMovie().getPriceCode() == Movie.CHILDRENS)
		{
			result += 1.5;
			if(getDaysRented() > 3)
				result += (getDaysRented() - 3) * 1.5;
		}
		return result;
	}
	
	public int getFrequentRenterPoints()
	{
		int result = 0;
		if((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1)
			result += 2;
		else
			result += 1;
		return result;
	}
}