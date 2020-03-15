/**
 * Initializer class initialize creates all objects needed for the simulation to run.
 */

package creators;

import java.util.Scanner;

import controller.GameControll;
import controller.GameInit;
import controller.GameLoop;
import gameEssentials.Agent;
import gameEssentials.GameTable;

public class Initializer {
	
	public void init() {
		GameTable gameTable = new GameTable();
		
		Scanner scan = new Scanner(System.in);
		Agent agent = new Agent();
		GameControll controller = new GameControll(scan, agent, gameTable);
		GameLoop loop = new GameLoop(scan, agent, controller, gameTable);
		GameInit newGame = new GameInit(scan, loop);
		
		newGame.play();
		
	}

}
