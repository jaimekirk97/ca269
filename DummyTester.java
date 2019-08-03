class DummyTester extends Customer
{
    public DummyTester(String name, List<Rental> rentals)
    {
        super(name, rentals);
    }
    
    // Note that we can only do this if getTotalCharge exists in the parent class (Customer)
    public double getTotalCharge()
    {
        return super.getTotalCharge(rental) * 2;  // Just double the charge!
    }

    public int getTotalFrequentRenterPoints()
    {
        return super.getTotalFrequentRenterPoints() * 2;  // Just double the points!
    }
}