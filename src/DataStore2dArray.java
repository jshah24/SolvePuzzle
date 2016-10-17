public class DataStore2dArray {
	private char[][] charArray;
	private int row;
	private int col;
	
	public DataStore2dArray(int row, int col, String []strArray) {
		// TODO Auto-generated constructor stub
		this.row=row;
		this.col=col;
		this.charArray=ConvertStrArrayToCharArray(strArray);
	}
	
	/**
	 * FUnction to convert 1-D string array to 2-D character array 
	 * @param strArray
	 * @return
	 */
	public char[][] ConvertStrArrayToCharArray(String[] strArray){
		char[][] temp = new char[strArray.length][];
		for(int i =0;i<strArray.length;i++){
			temp[i]=strArray[i].toCharArray();
		}
		return temp;
	}

	public char[][] getCharArray() {
		return charArray;
	}

	public void setCharArray(char[][] charArray) {
		this.charArray = charArray;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}
}