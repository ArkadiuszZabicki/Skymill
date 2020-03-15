/**
 * This class creates a gameTable object.
 * gameTable object is a matrix filled with rows.
 * It's an array list filled with row objects.
 */

package gameEssentials;

import java.util.ArrayList;

public class GameTable {
	
	private ArrayList<Row> gameTable;
	
	public GameTable() {
		setGameTable(new ArrayList<Row>());
	}
	
	public void setGameTable(ArrayList<Row> gameTable) {
		this.gameTable = gameTable;
	}
	
	
	public ArrayList<Row> getGameTable() {
		return gameTable;
	}

	public void addRow(Row aRow) {
		gameTable.add(aRow);
	}
	
	public int showRows() {
		return gameTable.size();
	}
	
	/**
	 * Method to create gameTable
	 * @param numOfRows specifies how many rows and columns game table will have.
	 */
	
	public void createGameTable(int numOfRows) {
		for(int i = 0; i < numOfRows; i++) {
			Row newRow = new Row();
			newRow.fillRow(numOfRows);
			gameTable.add(newRow);
		}
	}
	
	
}
