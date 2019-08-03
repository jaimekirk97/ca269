abstract class Price 
{
    public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
    abstract int getPriceCode();

    double getCharge(int daysRented) 
    {
    	double result = 0; 
    	{
    		if(getPriceCode() == Price.REGULAR)
    		{
    			result += 2;
    			if (daysRented > 2)
    				result += (daysRented - 2) * 1.5;
    		}
    		if(getPriceCode() == Price.NEW_RELEASE)
    		{
    			result += daysRented * 3;
    		}
    		if(getPriceCode() == Price.CHILDRENS)
    		{
    			result += 1.5;
    			if(daysRented > 3)
    				result += (daysRented - 3) * 1.5;
    		}  		
    	}
    	return result;
    }
    int getFrequentRenterPoints(int daysRented) 
    {
    	if((getPriceCode() == Price.NEW_RELEASE) && daysRented > 1)
    		return 2;
    	else
    		return 1;
    }
}
