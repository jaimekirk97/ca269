import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Senti32
{
    public static void main(String [] args) throws FileNotFoundException
    {
        File movieWordFile = new File(args[0]);
        File movieReviewFile = new File(args[1]);
        Scanner moveWordScanner = new Scanner(movieWordFile);
        while(moveWordScanner.hasNext())
        {
          Scanner moveReviewScanner = new Scanner(movieReviewFile);
          int count = 0;
          double total = 0.00;
          String word = moveWordScanner.next();
        while(moveReviewScanner.hasNextLine())
        {
          String line = moveReviewScanner.nextLine();
          String [] review = line.substring(2,line.length()).split(" ");
          int score = Integer.parseInt(line.substring(0,1));
          for(int i = 0;i < review.length;i++)
          {
              if(review[i].equals(word))
                {
                    count++;
                    total = total + score;
                }
          }
            
        }
        System.out.println("The score of " + word + " is " + String.format("%.2f", (total/count)) + ".");
      }
    }
}