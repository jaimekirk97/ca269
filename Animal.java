public class Animal
{
    public Animal(String n)
    {
        String name = n;
    }
    public String getName()
    {
    	return name;
    }
    public String greeting()
    {
        return "Hello my name is " + name;
    }
}