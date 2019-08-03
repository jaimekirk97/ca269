import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Customer
{
	private String _name;
	private List<Rental> _rentals = new ArrayList<Rental>();
	public Customer(String name, List rentals)
	{
		_name = name;
		_rentals = rentals;
	}
	public List<Rental> getRentals()
 	{
 		return _rentals;
 	}
	public void addRental(Rental arg)
	{
		_rentals.add(arg);
	}
	public String toString()
	{
		return _name + ": " + getRentals();
	} 
	public String getName ()
	{
		return _name;
	}
	
	public double getTotalCharge()
	{
	    double total = 0;
	    for(Rental rental: getRentals())
	    {
	        total += getTotal(rental);
	    }
	    return total;
	}
	
	public int getTotalFrequentRenterPoints()
	{
	    int ftotal = 0;
	    for (Rental rental : getRentals())
	    {
	        ftotal += rental.getFrequentRenterPoints();
	    }
	    return ftotal;
	}
	
	
	public double getTotal(Rental rental)
	{
		return rental.getCharge();
	}
	
	
	public String statement()
    {
        String output = "";

        for(Rental rental : getRentals())
        {
            output += "  " + rental.getMovie().getTitle() + "  " + rental.getCharge() + "\n";
            
        }
        output += "Amount owed is " + getTotalCharge() + "\n";
        output += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points\n";
        return output;
    }

}