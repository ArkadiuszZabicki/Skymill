package controller;

import java.util.Scanner;

public class GameInit {
	
	private Scanner scan;
	private GameLoop loop;
	
	public GameInit(Scanner scan, GameLoop loop) {
		this.loop = loop;
		this.scan = scan;
	}
	
	public void printWelcome() {
		System.out.println("Welcome to Skymill test assignement.");
		System.out.println("Press 1 to start simulation");
		System.out.println("Press 2 to quit");
	}
	
	public void play() {
		boolean finished = false;
		while(!finished) {
			printWelcome();
			int choice = scan.nextInt();
			loop.menuLoop(choice);
			finished = loop.getStatus();
		}
	}

}
