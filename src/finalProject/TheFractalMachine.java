package finalProject;

import javax.swing.*;

public class TheFractalMachine {
	private final static int WIDTH = 1025;
	private final static int HEIGHT = 550;
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				createAndShowGUI();
			}
		});
	}
	
	public static void createAndShowGUI(){
		JFrame frame = new FractalMachine(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}