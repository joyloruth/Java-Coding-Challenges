package demo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;
import javax.swing.Timer;

public class BallPanel extends JPanel implements ActionListener, KeyListener {
	
	
		
		
		final int WIDTH = 525, HEIGHT = 550; 
		Timer t = new Timer(5, this);
		double x = 0, velx = 0; 
		double y = 0 ,vely = 0; 
		
		public BallPanel() {
			t.start();
			this.setSize(WIDTH, HEIGHT);
			this.addKeyListener(this);
			this.setBackground(Color.blue);
			this.setFocusable(true);
			this.setFocusTraversalKeysEnabled(false);
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			g2.fill(new Ellipse2D.Double(x, y, 40, 70));
		}
		
		@Override
		public void keyTyped(KeyEvent e) {
			
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			
			int code = e.getKeyCode();
			
			if(code == KeyEvent.VK_SPACE) {
				System.out.println(code);
				up();
			}
			
			if(code == KeyEvent.VK_DOWN) {
				down();
			}
			
			if(code == KeyEvent.VK_RIGHT) {
				right();
			}
			
			if(code == KeyEvent.VK_LEFT) {
				left();
			}
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			repaint();
			x += velx;
			y += vely;
			
		}
		
		public void up() {
			vely = -1.5;
			velx = 0;
		}
		
		public void down() {
			vely = 1.5;
			velx = 0;
		}
		
		public void left() {
			vely = 0;
			velx = -1.5; 
			System.out.println("left");
		}
		
		public void right() {
			vely = 0;
			velx = 1.5; 
		}

}
