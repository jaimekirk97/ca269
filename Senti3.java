import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Senti3
{
    public static String score(String fileName, String word) throws FileNotFoundException{
        Scanner reviewScanner = new Scanner(new File(fileName));
        double totalScore = 0.00;
        int countLines = 0;
        
        while(reviewScanner.hasNextLine()){
            String line = reviewScanner.nextLine();
            int score = Integer.parseInt(line.substring(0,1));
            String [] review = line.substring(2,line.length()).split(" ");
            
            if(contains(review, word)){
                countLines ++;
                totalScore = totalScore + score;
            }
        }
        reviewScanner.close();
        return String.format("%.2f", (totalScore/countLines));
    }
    
    public static boolean contains(String [] review, String word){
        for(int i = 0; i < sa.length; i++){
            if(review[i].equals(word)){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String [] args) throws FileNotFoundException
    {
        Scanner wordScanner = new Scanner(new File(args[0]));
        while(wordScanner.hasNext()){
            String word = wordScanner.next();
            String score = score(args[1], word);
            System.out.println("The score of " + word + " is " + score + ".");
        }
    }
}