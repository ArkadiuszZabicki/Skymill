/**
 * Row class represents single row of a gameTable
 * Row is an array list with integers inside.
 * 
 */

package gameEssentials;

import java.util.*;

public class Row {
	
	private ArrayList<Integer> singleRow;
	
	public Row() {
		setRow(new ArrayList<Integer>());
	}
	
	public void setRow(ArrayList<Integer> singleRow) {
		this.singleRow = singleRow;	
	}
	
	public void fillRow(int size) {
		for(int i = 0; i < size; i++) {
			singleRow.add(i);
		}
	}
	
	public void addToVector(int value) {
		singleRow.add(value);
	}
	
	public int getLength() {
		return singleRow.size();
	}
	
	public ArrayList<Integer> showRow(){
		return singleRow;
	}
	
	

}