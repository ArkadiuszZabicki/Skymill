/**
 * GameControll class controls objects - it changes their states throughut the simulation
 */

package controller;

import java.util.ArrayList;
import java.util.Scanner;

import gameEssentials.Agent;
import gameEssentials.GameTable;

public class GameControll {
	
	private Scanner scan;
	private Agent agent;
	private GameTable gameTable;
	
	
	public GameControll(Scanner scan, Agent agent, GameTable gameTable) {
		this.scan = scan;
		this.gameTable = gameTable;
		this.agent = agent;
	}
	
	
	/**
	 * Method takes a string with instructions
	 * and transforms it into array list for a later use
	 * @param stringToTransform
	 * @return array list
	 */
	
	public ArrayList<Integer> stringToArray(String stringToTransform){
		
		ArrayList<Integer> path = new ArrayList<Integer>();
		String[] splitted = stringToTransform.split(",");
		for(String num : splitted) {
			path.add(Integer.parseInt(num));
		}
		
		return path;
		
	}
	
	
	
	
	/**
	 * Method takes a command and through set of conditions
	 * produces an output of a simulation.
	 * Basically it updates the position of an agent on a game board.
	 * Not my best work ;) 
	 * @param command
	 */
	public void moveAgent(int command) {
		String direction = agent.getDirection();
		switch(command) {
		case 1:
			switch(direction) {
			case "N":
				agent.setY_position(agent.getY_position() + 1);
				agent.addCurrentPosition();
				break;
			case "S":
				agent.setY_position(agent.getY_position() - 1);
				agent.addCurrentPosition();
				break;
			case "E":
				agent.setX_position(agent.getX_position() + 1);
				agent.addCurrentPosition();
				break;
			case "W":
				agent.setX_position(agent.getX_position() - 1);
				agent.addCurrentPosition();
				break;
			}
			break;
		case 2:
			switch(direction) {
			case "N":
				agent.setY_position(agent.getY_position() - 1);
				agent.addCurrentPosition();
				break;
			case "S":
				agent.setY_position(agent.getY_position() +  1);
				agent.addCurrentPosition();
				break;
			case "E":
				agent.setX_position(agent.getX_position() - 1);
				agent.addCurrentPosition();
				break;
			case "W":
				agent.setX_position(agent.getX_position() + 1);
				agent.addCurrentPosition();
				break;
			}
			break;
		case 3:
			switch(direction) {
			case "N":
				agent.setDirection("E");
				break;
			case "E":
				agent.setDirection("S");
				break;
			case "S":
				agent.setDirection("W");
				break;
			case "W":
				agent.setDirection("N");
				break;
			}
			break;
		case 4:
			switch(direction) {
			case "N":
				agent.setDirection("W");
				break;
			case "W":
				agent.setDirection("N");
				break;
			case "S":
				agent.setDirection("E");
				break;
			case "E":
				agent.setDirection("S");
				break;
			}
			break;

		
		}
	}

	/**
	 * Method to validate the path.
	 * It takes an array list with instructions and checks
	 * if what is the final position of an agent.
	 * @param path
	 */
	public void validatePath(ArrayList<Integer> path) {
		int table_length = gameTable.showRows();
		int table_height = gameTable.getGameTable().size();
		
		for(int command : path) {
		
			
			switch(command) {
			
			case 1:
				this.moveAgent(command);
				break;
			case 2:
				this.moveAgent(command);
				break;
			case 3:
				this.moveAgent(command);
				break;
			case 4:
				this.moveAgent(command);
				break;
			}
		}
		
		if(agent.getY_position() > table_length || agent.getY_position() < 0) {
			agent.setX_position(-1);
			agent.setY_position(-1);
			agent.addCurrentPosition();
		}
		if(agent.getX_position() > table_height || agent.getX_position() < 0) {
			agent.setX_position(-1);
			agent.setY_position(-1);
			agent.addCurrentPosition();
		}
		
		
		
		
		System.out.println(agent.getCurrentPosition());
		
	}
}
