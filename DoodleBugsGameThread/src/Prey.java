import java.awt.Color;

import javax.swing.JPanel;

public class Prey extends Thread {

		int y = 0;
		int x = (int) (Math.random() * 490 + 1);
		// 5 en yavas
		final int hiz = (int) (Math.random() * 5 + 1);
		final Color Color = java.awt.Color.RED;
		final int wdth = 10;
		final int hght = 10;
		JPanel shape = new JPanel();
		Prey dummy = null;
	Predator prdt = null;
	JPanel panel=null;
	int Score;

		public Prey(Predator a, JPanel panel) {
			shape.setBounds(x, y, wdth, hght);
			shape.setBackground(Color);
	prdt =a;
			this.panel = panel;
		
		
			
		}
		Thread	yenme = new Thread(new Runnable() {

			public void run() {
					
				while(true) {
				if (x >= prdt.x && y >= prdt.y && x <= prdt.x + 50 && y <= prdt.y + 50 && x+10 >= prdt.x && y+10 > prdt.y && x+10 <= prdt.x+50 && y+10 <= prdt.y+50) {
						System.out.println("yenmeye gridi");
						prdt.skorarttir();
						shape.setBounds(0, 0, 0, 0);
						dummy = null;
						panel.repaint();
	
						return;
				}	
				}

				
			
		
		
		
		
		
		
			}});	


		public void run() {
			// TODO Auto-generated method stub
			while (true) {
				/*if (x >= prdt.x && y >= prdt.y && x <= prdt.x + 50 && y <= prdt.y + 50 && x+10 >= prdt.x && y+10 > prdt.y && x+10 <= prdt.x+50 && y+10 <= prdt.y+50) {
			
prdt.skorarttir();
					this.shape.setBounds(0, 0, 0, 0);
					dummy = null;
					panel.repaint();
				return;
				}*/
				
				
				
			/*	if (x >= x && y >= y && x <= x + 50 && y <= y + 50 && x + 10 <= x + 50 && y + 10 <= y + 50 && x + 10 >= x
						&& y + 10 >= y) {
					System.out.println("buradan cikti");
					return;
				}*/
				if (hiz == 5) {
					y += 10;
					if (y >= 500) {
						this.shape.setBounds(0, 0, 0, 0);
						prdt.skorazalt();
						return;
					}
					shape.setBounds(x, y, wdth, hght);

					try {
						Thread.sleep(125);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

				if (hiz == 4) {
					y += 10;
					if (y >= 500) {
						this.shape.setBounds(0, 0, 0, 0);
						prdt.skorazalt();
						return;
					}
					shape.setBounds(x, y, wdth, hght);

					try {
						Thread.sleep(250);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

				else if (hiz == 3) {
					y += 10;
					if (y >= 500) {
						this.shape.setBounds(0, 0, 0, 0);
						prdt.skorazalt();
						return;
					}
					shape.setBounds(x, y, wdth, hght);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

				else if (hiz == 2) {
					y += 10;
					if (y >= 500) {
						this.shape.setBounds(0, 0, 0, 0);
						prdt.skorazalt();
						return;
					}
					shape.setBounds(x, y, wdth, hght);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

				else if (hiz == 1) {

					y += 10;
					if (y >= 500) {
						shape.setBounds(0, 0, 0, 0);
						this.shape.setBounds(0, 0, 0, 0);
						prdt.skorazalt();
						return;
					}
					shape.setBounds(x, y, wdth, hght);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();

					}

				}

			}
		}
	}