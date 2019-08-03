public class WordScore
{
	String word;
	int score;

	public WordScore(String w)
	{
		word = w;
	}

	public int score(String review)
	{
		String [] tokens = review.split(" ");
		score = Integer.valueOf(tokens[1]);
		int newscore = 0;
		for(int i = 2;i < tokens.length;i++)
		{
			if(tokens[i] == word)
				newscore += 1;
		}
		if(score > 0 && newscore > 0)
			return newscore;
		else
		    return -1;
	}
}