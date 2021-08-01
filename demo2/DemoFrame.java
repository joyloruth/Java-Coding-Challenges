package demo2;



import javax.swing.JFrame;

public class DemoFrame  extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	DemoPanel panel;
	
	DemoFrame(){
		
		this.add(panel);
		this.setSize(500, 500);
		this.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

}
