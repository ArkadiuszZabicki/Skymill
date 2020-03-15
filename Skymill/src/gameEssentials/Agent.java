/**
 * Agent class creates an agent.
 * Agent is represented by two integers, that indicates position on a game table
 * Also, agent has a string variable direction
 */

package gameEssentials;

import java.util.ArrayList;

public class Agent {
	
	private int x_position;
	private int y_position;
	private ArrayList<Integer> movementHistory;
	private ArrayList<Integer> currentPosition;
	private String direction = "N";
	
	public Agent() {
		setMovementHistory(new ArrayList<Integer>());
		setCurrentPosition(new ArrayList<Integer>());
	}
	
	public String getDirection() {
		return direction;
	}
	
	public void setDirection(String newDirection) {
		this.direction = newDirection;
	}

	public int getX_position() {
		return x_position;
	}

	public void setX_position(int x_position) {
		this.x_position = x_position;
	}

	public int getY_position() {
		return y_position;
	}

	public void setY_position(int y_position) {
		this.y_position = y_position;
	}
	
	public ArrayList<Integer> getMovementHistory() {
		return movementHistory;
	}

	public void setMovementHistory(ArrayList<Integer> movementHistory) {
		this.movementHistory = movementHistory;
	}

	public void placeAgent(int x_position, int y_position) {
		this.setX_position(x_position);
		this.setY_position(y_position);
		
	}

	public ArrayList<Integer> getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(ArrayList<Integer> currentPosition) {
		this.currentPosition = currentPosition;
	}
	
	public void addCurrentPosition() {
		getCurrentPosition().clear();
		getCurrentPosition().add(this.getX_position());
		getCurrentPosition().add(this.getY_position());
	}

	

}
