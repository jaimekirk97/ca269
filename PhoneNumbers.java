import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class PhoneNumbers
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> phoneBook = new HashMap<>();
        System.out.println("Enter a name and number, or a name and ? to query (!! to exit)");
        String line = in.nextLine();
        while(!line.equals("!!"))
        {
            String [] tokens = line.split(" ");
            if(tokens[1].equals("?"))
            {
            	if(phoneBook.get(tokens[0]) != null)
            		System.out.println(tokens[0] + " has number" + " " + phoneBook.get(tokens[0]));
            	else
            		System.out.println("Sorry, there is no " + tokens[0]);
            }
            else
            	phoneBook.put(tokens[0],Integer.valueOf(tokens[1]));
        line = in.nextLine();
        }
        System.out.print("Bye");
    }
}