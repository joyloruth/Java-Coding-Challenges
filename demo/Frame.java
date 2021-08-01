package demo;




import javax.swing.JFrame;


public class Frame extends JFrame
{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//JLabel label;
	
	//final int WIDTH = 525, HEIGHT = 500;
	
	int birdHeight = HEIGHT/4;
	
	//int velo = -3;
	//int accel = 0;
	
	//int x = 0;
	//int y = 4;
	
	//Panell panell;
	
	
	Frame(){
		
		this.setSize(300, 500);
		this.setVisible(true);
		//this.add(panell);
		}
		
		
		
}		

		
		
		
		
		//this.addKeyListener(this);
		
		//label = new JLabel("BIRD");
		//label.setBounds(150, birdHeight + velo, 50,50);
		//label.setLocation(x, y);
		
		//this.add(label);
		
		
	
/*
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		
		
		if(code == KeyEvent.VK_UP) {
			y = y - 9;
			label.setLocation(x,y);
		}
		
		if(code == KeyEvent.VK_DOWN) {
			y = y + 9;
			label.setLocation(x,y);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		x = 7;
		y = y + 8;
		label.setLocation(x,y);
		repaint();
	} */

