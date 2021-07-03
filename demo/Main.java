package demo;

import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		BallPanel panel = new BallPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		

	}

}
