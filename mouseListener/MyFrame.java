package mouseListener;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements MouseListener{

	JLabel label;
	JPanel panel, panel2, panel3;
	ImageIcon smile,nerd,kiss,mad;
	
	
	MyFrame(){
		
		this.setSize(600,900);
		this.setVisible(true);
		this.setLayout(null);
		this.setResizable(false);
		this.setBackground(Color.PINK);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		label = new JLabel();
		panel = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		
		label.setBounds(0, 0, 100, 100);
		label.setBackground(Color.blue);
		label.setOpaque(true);
		
		panel.setBounds(0, 0,200, 200);
		panel.setBackground(Color.black);
		panel.add(label);
		
		panel2.setBounds(0, 0,300, 300);
		panel2.setBackground(Color.YELLOW);
		
		label.addMouseListener(this);
		this.add(panel);
		this.add(panel2);
		
		smile = new ImageIcon("smile.png");
		mad = new ImageIcon("mad.png");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// mouse button
		System.out.println("you clicked the button");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("you pressed the button");
		label.setBackground(Color.cyan);
		panel.setBackground(Color.pink);
		panel2.setBackground(Color.blue);
		label.setIcon(mad);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("you released the button");
		label.setBackground(Color.GREEN);
		panel.setBackground(Color.cyan);
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("mouse entered the screen");
		panel.setBackground(Color.blue);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("mouse exited screen");
		
	}

}
