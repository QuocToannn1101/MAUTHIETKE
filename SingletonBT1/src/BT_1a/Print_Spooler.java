package BT_1a;

import BT_1a.Print_Spooler;

public class Print_Spooler {
	private static Print_Spooler instance = null;
	private Print_Spooler() {
		init();
	}
	
	
	private void init() {
		System.out.println("XU LY QUA TRINH KHOI TAO PHUC TAP ");
	}
	
	public static Print_Spooler getInstance() {
		if( instance == null) {
			instance = new Print_Spooler();
		}
		return instance;
	}
	
	public void display() {
		System.out.println("XIN CHÀO");
	}
}
