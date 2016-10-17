import java.util.Scanner;
public class TestPuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("--------dimensions of the puzzle .... ");
		System.out.println("ENter the number of rows");
		int row = in.nextInt();
		System.out.println("Enter the number of columns");
		int col = in.nextInt();
		String[] strArray = new String[row];
		for(int i=0;i<row;i++){
			System.out.println("Enter a string of length of " + col);
			strArray[i]=in.next();
						if(strArray[i].length()!=col){
							System.out.println("Warning please !!!!!");
							i--;
						}
		}
		
		PuzzleClient puzzleClientObj = new PuzzleClient(row, col, strArray);
		System.out.println("Total Number of matches  = " + puzzleClientObj.getNumberOfMatches());

	}

}