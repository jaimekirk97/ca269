class RegularPrice extends Price 
{
    int getPriceCode() 
    {
    	return Price.REGULAR;
    }
    double getCharge(int daysRented)
    {
    	double result = 2;
    	if(daysRented > 2)
    		result += (daysRented - 2) * 1.5;
    	return result;
    }
    int getFrequentRenterPoints(int daysRented) 
    {
    	return (daysRented > 1) ? 2: 1;
    }
}