public class PuzzleClient {
	private DataStore2dArray dataStoreObj;
	private PuzzleTraverse puzzleTraverseObj;
	
	public PuzzleClient(int row, int col, String[] strArray) {
		// TODO Auto-generated constructor stub
		 dataStoreObj = new DataStore2dArray(row, col, strArray);
		 puzzleTraverseObj= new PuzzleTraverse(dataStoreObj);
	}
	
	/**
	 * 
	 * @return number of matches found in the dictionary 
	 */
	
	public long getNumberOfMatches(){
		return puzzleTraverseObj.getTotalMatches();
	}
}

