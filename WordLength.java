import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class WordLength
{
    public static void main(String [] args)
    {
    	Scanner in = new Scanner(System.in);
    	String line = in.nextLine();
    	String [] tokens = line.split(" ");
    	Map<String, Integer> wordCount = new HashMap<>();
    	while(in.hasNextLine())
    	{
    		for(String word:tokens)
    		{
    			if(wordCount.containsKey(String.valueOf(word.length())))
    			{
    				int newCount = wordCount.get(String.valueOf(word.length())) + 1;
    				wordCount.put(String.valueOf(word.length()),newCount);
    			}
    			else
    				wordCount.put(String.valueOf(word.length()),1);
    		}
    		String line = in.nextLine();
    		String [] tokens = line.split(" ");
    	}
    	for(Map.Entry<String,Integer> entry : wordCount.entrySet())
    	{
    		System.out.println(entry.getKey() + ":" + " " + entry.getValue());  
    	}
    }
}