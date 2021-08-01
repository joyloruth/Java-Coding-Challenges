package demo2;

import java.awt.Color;



import javax.swing.JPanel;

public class DemoPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	DemoPanel(){
		
		this.setBackground(Color.black);
		this.setSize(200, 200);
		this.setVisible(true);
		
		
	}

	/*@Override
	public void keyTyped(KeyEvent e) {
	System.out.println("key typed: " + e);
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("key pressed: " + e);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("key released: " + e);
		
	}*/

}
