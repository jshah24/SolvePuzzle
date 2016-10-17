public class PuzzleTraverse {
	
	   private long totalMatches;
	   private DataStore2dArray dataStoreObj;
	   public PuzzleTraverse(DataStore2dArray dataStoreObj){
		   totalMatches=0;
		   this.dataStoreObj=dataStoreObj;
		   for(int i=0;i<dataStoreObj.getRow();i++){
			   for(int j=0;j<dataStoreObj.getCol();j++){
				   totalMatches=traverse(i, j);
			   }
		   }
		   
	   }
	   
	   /**
	    * Function to traverse in all 8 different direction 
	    * @param row
	    * @param col
	    */
	   
	   public int traverse(int row,int col) { 
		    int totalCount=0;
	    	char[][] chars = dataStoreObj.getCharArray();  		    	
	    	totalCount=traverseRootElement(chars,row,col);
	    	totalCount=traverseInPositiveYAxis(chars, row, col);
	    	totalCount=traverseInNegativeYAxis(chars, row, col);
	    	totalCount=traverseInPositiveXAxis(chars, row, col);
	    	totalCount=traverseInNegativeXAxis(chars, row, col);
	    	totalCount=traverseInPositiveXAndPositiveY(chars, row, col);
	    	totalCount=traverseInNegativeXAndPositiveY(chars, row, col);
	        totalCount=traverseInNegativeXAndNegativeY(chars, row, col);
	        totalCount=traverseInPositiveXAndNegativeY(chars, row, col);
	        return totalCount;
	    }
	   
	   
	   public int traverseRootElement(char[][] chars,int row, int col){
		   StringBuilder rootBuilder = new StringBuilder();
		   int count=0;
		   rootBuilder.append(chars[row][col]);	    	
	    	if(PuzzleSolver.IsWord(rootBuilder.toString())){
	    		count++;
	    	}
	    	return count;
	   }
	   public int traverseInPositiveYAxis (char[][] chars,int row, int col){
		   StringBuilder builder = new StringBuilder();
		   int count=0;
		   builder = new StringBuilder(); 
	    	for (int i = row; i >= 0; i--) { 
	    		builder.append(chars[i][col]); 
	    		if(i!=row && PuzzleSolver.IsWord(builder.toString())){
	    			count++;
	    		}
	    	}
	    	return count;
	   }
	   
	   public int traverseInNegativeYAxis(char[][] chars,int row, int col){
		   StringBuilder builder = new StringBuilder();
		   int count=0;
		   for (int i = row; i < chars.length; i++) {
	    		builder.append(chars[i][col]); 
	    		if(i!=row && PuzzleSolver.IsWord(builder.toString()) ){
	    			count++;
	    		}
	    	}
		   return count;
	   }
	   
	   public int traverseInPositiveXAxis(char[][] chars,int row, int col){
		   StringBuilder builder = new StringBuilder();
		   int count=0;
		   builder = new StringBuilder(); 
	    	for (int i = col; i < chars[row].length; i++) { 
	    		builder.append(chars[row][i]); 
	    		if(i!=col && PuzzleSolver.IsWord(builder.toString())){
	    			count++;
	    		}
	    	}
	    	return count;
	   }
	   
	   public int traverseInNegativeXAxis(char[][] chars,int row, int col){
		   StringBuilder builder = new StringBuilder();
		   int count=0;
			builder = new StringBuilder(); 
	    	for (int i = col; i >= 0; i--) {
	    		builder.append(chars[row][i]); 
	    		if(i!=col && PuzzleSolver.IsWord(builder.toString())){
	    			count++;
	    		}
	    	} 
	    	return count;
	   }
	   
	   public int traverseInPositiveXAndPositiveY(char[][] chars,int row, int col){
		   StringBuilder builder = new StringBuilder();
		   int count=0;
			builder = new StringBuilder(); 
	    	for (int i = row, j = col; i < chars.length && j < chars[i].length; i++, j++) { 
	    		builder.append(chars[i][j]); 
	    		if(i!=row && j!=row && PuzzleSolver.IsWord(builder.toString())){
	    			count++;
	    		}
	    	} 
	    	return count;
	   }
	   
	   public int traverseInNegativeXAndPositiveY(char[][] chars,int row, int col){
		   StringBuilder builder = new StringBuilder();
		   int count=0;
		   builder = new StringBuilder(); 
	    	for (int i = row, j = col; i >= 0 && j < chars.length; i--, j++) { 
	    		builder.append(chars[i][j]); 
	    		if(i!=row && j!=row && PuzzleSolver.IsWord(builder.toString())){
	    			count++;
	    			}
	    		} 
	    	return count;
	   }
	   
	   public int traverseInNegativeXAndNegativeY(char[][] chars,int row, int col){
		   StringBuilder builder = new StringBuilder();
		   int count=0;
	    	builder = new StringBuilder(); 
	    	for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) { 
	    		builder.append(chars[i][j]); 
	    		if(i!=row && j!=row &&PuzzleSolver.IsWord(builder.toString())){
	    			count++;
	    			}
	    		} 
		   return count;
	   }
	   
	   public int traverseInPositiveXAndNegativeY(char[][] chars,int row, int col){
		   StringBuilder builder = new StringBuilder();
		   int count=0;
		   builder = new StringBuilder(); 
	    	for (int i = row, j = col; i < chars.length && j >= 0; i++, j--) { 
	    		builder.append(chars[i][j]); 
	    		if(i!=row && j!=row &&PuzzleSolver.IsWord(builder.toString())){
	    			count++;
	    		}
	    	}
	    	return count;
	   }
	   
	   
	   
	public long getTotalMatches() {
		return totalMatches;
	}
}

