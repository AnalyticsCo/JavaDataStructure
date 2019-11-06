import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Predator extends Thread {

	
	
	
	public static final int Height = 50;
	public static final int Weight = 50;
	public int x = 225;
	public int y = 225;
KeyEvent dummy = null;
JPanel panel=null;
int Score=0;
	static final  Color Color = java.awt.Color.BLUE;
	final int wdth=50;final int hght=50;
	JPanel shape=new JPanel();
	

	public Predator( ) {
shape.setBounds(225,225,wdth, hght);
		shape.setBackground(Color);
	}
	
	public synchronized void skorarttir() {
		Score+=2;
		System.out.println("Score ="+Score);
	if(Score==100) {
		System.out.println();

		JOptionPane.showInputDialog(null,"Avci Kazandi");
		System.exit(0);}
	
	}
	public synchronized void skorazalt() {
		Score-=1;
	
		System.out.println("Score ="+Score);
		if(Score==-100) {
		JOptionPane.showInputDialog(null,"Avci Kazandi");
		System.exit(0);
		}}
	
	public void move(KeyEvent e) {
		// TODO Auto-generated method stub
	dummy=e;
		
		
		if ( (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_LEFT
				|| e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN)) {
			
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				
				if (x + 10 > 450) {
					shape.setBounds(450, y, Weight, Height);
					x = 450;
					return;
				}

				shape.setBounds(x + 10, y, Weight, Height);

				x += 10;
				return;
			} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				if (x - 10 < 0) {
					shape.setBounds(0, y, Weight, Height);
					x = 0;
					return;
				}
				shape.setBounds(x - 10, y, Weight, Height);

				x -= 10;
				return;
			} else if (e.getKeyCode() == KeyEvent.VK_UP) {
				if (y - 10 < 0) {
					shape.setBounds(x, 0, Weight, Height);
					y = 0;
					return;
					

				}
				shape.setBounds(x, y - 10, Weight, Height);

				y -= 10;
				return;
				
			} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				System.out.println(y);
				if (y + 10 > 450) {
					shape.setBounds(x, 450, Weight, Height);
					y = 450;
					return;

				}
				shape.setBounds(x, y + 10, Weight, Height);

				y += 10;
				return;
			}
			System.out.println("return yapti");
			return;
//repaint();	
		}}
	
	//return;




	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
		move(dummy);
		}
	}}
