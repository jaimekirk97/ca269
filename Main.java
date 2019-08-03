public class Main
{
    public static void main(String [] args)
    {
        Movie [] movies = { new Movie("James Bond does Java", Price.NEW_RELEASE), new Movie("Mickey Mouse", Price.CHILDRENS), new Movie("The Pointer Sisters", Price.REGULAR)};
        
        boolean ok = true;
        
        int next = 0;
        Movie m;
        m = movies[next++];
        if(m.price.getPriceCode() != Price.NEW_RELEASE)
        {
            System.out.println("1. Price code is not correct");
            ok = false;
        }
        m = movies[next++];
        if(m.price.getPriceCode() != Price.CHILDRENS)
        {
            System.out.println("2. Price code is not correct");
            ok = false;
        }
        m = movies[next++];
        if(m.price.getPriceCode() != Price.REGULAR)
        {
            System.out.println("3. Price code is not correct");
            ok = false;
        }
        // Now, see if the setPriceCode works
        m.setPriceCode(Price.CHILDRENS);
        if(m.price.getPriceCode() != Price.CHILDRENS)
        {
            System.out.println("4. Price code is not correct");
            ok = false;
        }
        m.setPriceCode(Price.NEW_RELEASE);
        if(m.price.getPriceCode() != Price.NEW_RELEASE)
        {
            System.out.println("5. Price code is not correct");
            ok = false;
        }
        m.setPriceCode(Price.REGULAR);
        if(m.price.getPriceCode() != Price.REGULAR)
        {
            System.out.println("6. Price code is not correct");
            ok = false;
        }
        if(ok)
            System.out.println("All Korrect.");
    }
}