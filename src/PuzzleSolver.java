import java.util.Arrays;
	
	public class PuzzleSolver
	
	{
	    public static String[] DICTIONARY = {"OX","CAT","TOY","AT","DOG","CATAPULT","T"};
	    public static boolean IsWord(String testWord)
	    {
	
	        if (Arrays.asList(DICTIONARY).contains(testWord))
	            				return true;
	
	        return false;
	
	   }
	
	
}
