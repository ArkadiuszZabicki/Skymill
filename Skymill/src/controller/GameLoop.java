/**
 * GameLoop class contains main loops used throughout the simulation
 * 
 */

package controller;

import java.util.ArrayList;
import java.util.Scanner;

import creators.Creator;
import gameEssentials.Agent;
import gameEssentials.GameTable;

public class GameLoop {
	
	private boolean status = false;
	private Scanner scan;
	private Agent agent;
	private GameControll controller;
	private ArrayList<Integer> path;
	private GameTable gameTable;
	
	public GameLoop(Scanner scan, Agent agent, GameControll controller, GameTable gameTable) {
		this.scan = scan;
		this.agent = agent;
		this.controller = controller;
		this.gameTable = gameTable;
		
	}
	
	public boolean getStatus() {
		return status;
	}
	
	public void menuLoop(int choice) {
		
		boolean status = false;
		
		switch(choice) {
		
		case 1:
			this.buildGameTable();
			status = true;
			break;
			
		case 2:
			System.out.println("Tank you for playing. See you next time");
			status = true;
			break;
		}
		
		this.status = status;
			
		
	}
	
	public void commandLine() {
		System.out.println("Command lines: ");
		System.out.println("1 - move forward one step");
		System.out.println("2 - move backwards one step");
		System.out.println("3 - rotate clockwise 90 degrees");
		System.out.println("4 - rotate counterclockwise 90 degrees");
	}
	
	
	
	public void buildGameTable() {
		System.out.println("Let's build our game table");
		System.out.println("How many rows do you want?");
		int numOfRows = scan.nextInt();
		gameTable.createGameTable(numOfRows);
		System.out.println("A game table " + Integer.toString(numOfRows) + "x" + Integer.toString(numOfRows) + " was created!");
		System.out.println("Place our agent on a table. Pass x_position");
		int xPosition = scan.nextInt();
		System.out.println("Pass y_position");
		int yPosition = scan.nextInt();
		agent.placeAgent(xPosition, yPosition);
		agent.addCurrentPosition();
		System.out.println("Agent placed on " + agent.getCurrentPosition() + " directed " + agent.getDirection());
		this.commandLine();
		System.out.println("Add move pattern for an agent:");
		path = controller.stringToArray(scan.next());
		controller.validatePath(path);
		
	}

}
