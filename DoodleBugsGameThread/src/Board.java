
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board extends JFrame implements KeyListener {

	
	
	
	final int p_width = 50;
	final int p_height = 50;
	JPanel panel = new JPanel();
	JPanel button = new JPanel();
	KeyEvent e = null;
	int score = 0;
	ArrayList<Prey> preylist = new ArrayList<Prey>();
	ArrayList<Thread> thrd = new ArrayList<Thread>();
	//boolean keyPressed = false;
	Predator prdt = new Predator();
	JPanel predator = prdt.shape;

					
			
	
		Thread control = new Thread(new Runnable() {

			public void run() {
				while(true) {
				System.out.println("Prey "+(preylist.get(0).x+5)+"  "+(preylist.get(0).y+5));
				System.out.println("Predator"+(prdt.x+25)+"  "+(prdt.y+25));
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			}
		});
		Thread create = new Thread(new Runnable() {

			public void run() {
				while (true) {

try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Prey dummy = (new Prey(prdt,panel));
					preylist.add(dummy);
					panel.add(dummy.shape);
					dummy.start();
					dummy.yenme.start();
					repaint();

				}

			}
		});

	


	public void init() {
		thrd.add(create);
		for (int i = 0; i < 10; i++) {
			Prey dummy=(new Prey(prdt,panel));
			panel.add(dummy.shape);
		dummy.start();
		dummy.yenme.start();

		//dummy.yenme.start();
			panel.repaint();
		}

	}

	

	public Board() {

		setResizable(false);

		this.addKeyListener(this);
		this.setVisible(true);
		this.setSize(510, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setBackground(Color.WHITE);

		panel.setLayout(null);
		getContentPane().add(panel);
		panel.add(predator);
		init();
		create.start();
		//control.start();
	}

	public void deneme(Prey f) {
		panel.add(f.shape);
		this.repaint();

	}

	@Override
	public void keyPressed(KeyEvent a) {
	
		this.e=a;
		prdt.move(a);
		
		/*double time = System.currentTimeMillis();
	if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_LEFT
			|| e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN) {
	keyPressed=true;

	prdt.dummy=e;
prdt.move(e);
	System.out.println(keyPressed);*/
	}
	
	/*System.out.println(System.currentTimeMillis()-time);
		keyPressed=false;
		System.out.println(keyPressed);}*/
		// TODO Auto-generated method stub
	/*	if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_LEFT
				|| e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				System.out.println("sagda");
				if (p_x + 10 > 450) {
					predator.setBounds(450, p_y, p_width, p_height);
					p_x = 450;
					return;
				}

				predator.setBounds(p_x + 10, p_y, p_width, p_height);

				p_x += 10;
			} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				if (p_x - 10 < 0) {
					predator.setBounds(0, p_y, p_width, p_height);
					p_x = 0;
					return;
				}
				predator.setBounds(p_x - 10, p_y, p_width, p_height);

				p_x -= 10;
			} else if (e.getKeyCode() == KeyEvent.VK_UP) {
				if (p_y - 10 < 0) {
					predator.setBounds(p_x, 0, p_width, p_height);
					p_y = 0;
					return;
					

				}
				predator.setBounds(p_x, p_y - 10, p_width, p_height);

				p_y -= 10;

			} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				System.out.println(p_y);
				if (p_y + 10 > 450) {
					predator.setBounds(p_x, 450, p_width, p_height);
					p_y = 450;
					return;

				}
				predator.setBounds(p_x, p_y + 10, p_width, p_height);

				p_y += 10;
			}
			return;
//repaint();		
		}*/
	

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

		
	}

	public void calistir() {

	}


	}
