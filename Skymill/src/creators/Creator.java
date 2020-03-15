/**
 * Creator class handles all cases when new object is created.
 * Methods within it create game table and game agent
 * 
 * 
 */

package creators;

import gameEssentials.GameTable;
import gameEssentials.Row;

import java.util.ArrayList;
import java.util.Scanner;

public class Creator {
	
	private GameTable gameTable;
	
	public Creator(GameTable gameTable) {
		this.gameTable = gameTable;
	}
	
	public GameTable createGameTable(int numOfRows) {
		gameTable = new GameTable();
		for(int i = 0; i < numOfRows; i++) {
			Row newRow = new Row();
			newRow.fillRow(numOfRows);
			gameTable.addRow(newRow);
		}
		
		return gameTable;
	}
	

}
