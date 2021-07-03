package demo2;

import java.awt.Color;

import javax.swing.JFrame;

public class DemoFrame  extends JFrame {
	DemoPanel panel;
	
	DemoFrame(){
		
		this.add(panel);
		this.setSize(500, 500);
		this.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
	}

}
