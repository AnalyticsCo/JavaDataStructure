import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame extends JFrame implements ActionListener {
	
	calculator calculate =new calculator();
	String c_area = "";// Hesaplama alani
	JFrame a = new JFrame();
	JButton ac = new JButton("AC");
	JButton left_p = new JButton("(");
	JButton right_p = new JButton(")");
	JButton bolme = new JButton("/");
	JButton carpma = new JButton("*");
	JButton seven = new JButton("7");
	JButton eight = new JButton("8");
	JButton nine = new JButton("9");
	JButton four = new JButton("4");
	JButton five = new JButton("5");
	JButton six = new JButton("6");
	JButton eksi = new JButton("-");
	JButton one = new JButton("1");
	JButton two = new JButton("2");
	JButton three = new JButton("3");
	JButton topla = new JButton("+");
	JButton zero = new JButton("0");
	JButton point = new JButton(".");
	JButton equal = new JButton("=");
	JPanel textFieldl = null;
	JPanel row1 = null;
	JPanel row2 = null;
	JPanel row3 = null;
	JPanel row4 = null;
	JPanel row5 = null;
	JPanel rowzero = null;
	private  JTextField textField = new JTextField();

	public Frame() {
		a.setFont(new Font("Dubai Medium", Font.PLAIN, 26));
		a.setType(Type.UTILITY);
		a.setTitle("CALCULATOR");
		a.setResizable(false);
a.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
a.addWindowListener(new WindowAdapter() {
	
	public void windowClosing(WindowEvent e)
	{
		int u =JOptionPane.showConfirmDialog(null, "Cikmak istedigine emin misin?","",JOptionPane.OK_OPTION);
		if(u==JOptionPane.YES_OPTION)
			e.getWindow().dispose();
	}
});
		textField.setForeground(Color.WHITE);
		
		textField.setBackground(Color.GRAY);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setColumns(10);
		a.getContentPane().setLayout(new GridLayout(6, 1));

		row1 = new JPanel(new GridLayout(1, 4));
		row2 = new JPanel(new GridLayout(1, 4));
		row3 = new JPanel(new GridLayout(1, 4));
		row4 = new JPanel(new GridLayout(1, 4));
		row5 = new JPanel(new GridLayout(1, 2));
		rowzero = new JPanel(new GridLayout(1, 2));
		
		a.getContentPane().add(textField);

		a.getContentPane().add(row1);
		/*
		 * ac.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { c_area=""; textField.setText(c_area); } });
		 */
		ac.setFont(new Font("Times New Roman", Font.BOLD, 30));
		ac.setBackground(Color.LIGHT_GRAY);

		row1.add(ac);
		left_p.setFont(new Font("Times New Roman", Font.BOLD, 30));
		left_p.setBackground(Color.LIGHT_GRAY);
		row1.add(left_p);
		right_p.setFont(new Font("Times New Roman", Font.BOLD, 30));
		right_p.setForeground(Color.BLACK);
		right_p.setBackground(Color.LIGHT_GRAY);
		row1.add(right_p);
		right_p.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c_area = c_area + ")";
				textField.setText(c_area);
			}
		});
		bolme.setForeground(Color.WHITE);
		bolme.setFont(new Font("Times New Roman", Font.BOLD, 30));
		bolme.setBackground(new Color(255, 140, 0));
		

		row1.add(bolme);
		bolme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c_area += "/";
				textField.setText(c_area);
			}
		});
		;
		a.getContentPane().add(row2);
		seven.setFont(new Font("Times New Roman", Font.BOLD, 30));
		seven.setBackground(Color.LIGHT_GRAY);
		row2.add(seven);
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c_area += "7";
				textField.setText(c_area);
			}
		});
		;
		eight.setFont(new Font("Times New Roman", Font.BOLD, 30));
		eight.setBackground(Color.LIGHT_GRAY);
		row2.add(eight);
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c_area += "8";
				textField.setText(c_area);
			}
		});
		;
		nine.setFont(new Font("Times New Roman", Font.BOLD, 30));
		nine.setBackground(Color.LIGHT_GRAY);
		row2.add(nine);
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c_area += "9";
				textField.setText(c_area);
			}
		});
		;
		carpma.setFont(new Font("Times New Roman", Font.BOLD, 30));
		carpma.setForeground(Color.WHITE);
		carpma.setBackground(new Color(255, 140, 0));
		row2.add(carpma);
		carpma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c_area += "*";
				textField.setText(c_area);
			}
		});
		;
		a.getContentPane().add(row3);
		four.setFont(new Font("Times New Roman", Font.BOLD, 30));
		four.setBackground(Color.LIGHT_GRAY);
		row3.add(four);
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c_area += "4";
				textField.setText(c_area);
			}
		});
		;
		five.setFont(new Font("Times New Roman", Font.BOLD, 30));
		five.setBackground(Color.LIGHT_GRAY);
		row3.add(five);
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c_area += "5";
				textField.setText(c_area);
			}
		});
		;
		six.setFont(new Font("Times New Roman", Font.BOLD, 30));
		six.setBackground(Color.LIGHT_GRAY);
		row3.add(six);
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c_area += "6";
				textField.setText(c_area);
			}
		});
		;
		eksi.setFont(new Font("Times New Roman", Font.BOLD, 30));
		eksi.setForeground(Color.WHITE);
		eksi.setBackground(new Color(255, 140, 0));
		row3.add(eksi);
		eksi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c_area += "-";
				textField.setText(c_area);
			}
		});
		;

		a.getContentPane().add(row4);
		one.setFont(new Font("Times New Roman", Font.BOLD, 30));
		one.setBackground(Color.LIGHT_GRAY);
		row4.add(one);
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c_area += "1";
				textField.setText(c_area);
			}
		});
		;
		two.setFont(new Font("Times New Roman", Font.BOLD, 30));
		two.setBackground(Color.LIGHT_GRAY);

		row4.add(two);
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c_area += "2";
				textField.setText(c_area);
			}
		});
		;
		three.setFont(new Font("Times New Roman", Font.BOLD, 30));
		three.setBackground(Color.LIGHT_GRAY);
		row4.add(three);
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c_area += "3";
				textField.setText(c_area);
			}
		});
		;
		topla.setForeground(Color.WHITE);
		topla.setFont(new Font("Times New Roman", Font.BOLD, 30));
		topla.setBackground(new Color(255, 140, 0));

		row4.add(topla);
		topla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c_area += "+";
				textField.setText(c_area);
			}
		});
		;
		a.getContentPane().add(rowzero);
		zero.setFont(new Font("Times New Roman", Font.BOLD, 30));
		zero.setBackground(Color.LIGHT_GRAY);
		rowzero.add(zero);
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c_area += "0";
				textField.setText(c_area);
			}
		});
		;
		rowzero.add(row5);
		point.setFont(new Font("Times New Roman", Font.BOLD, 30));
		point.setBackground(Color.LIGHT_GRAY);
		row5.add(point);
		point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c_area += ".";
				textField.setText(c_area);
			}
		});
		;
		equal.setForeground(Color.WHITE);
		equal.setFont(new Font("Times New Roman", Font.BOLD, 30));
		equal.setBackground(new Color(255, 140, 0));

		row5.add(equal);
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			c_area =textField.getText();
				
					
					
					if(calculate.faildetection(c_area)) {
					
					 JOptionPane A = new JOptionPane();
					  A.setForeground(Color.red);
					  A.showMessageDialog(null,"Syntax Error ");
					c_area="";
					textField.setText("");
				}
				else {
					
				String a = calculate.calculation(c_area);
		c_area =a;
		textField.setText(a);
				}
				
					
				
			
			}
		});
		

		ac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c_area = "";
				textField.setText(c_area);
			}
		});
		;
		left_p.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c_area = c_area + "(";
				textField.setText(c_area);
			}
		});
		;
		;

	}

	public void initial() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ac) {
			c_area = "";
			textField.setText(c_area);
		}
		if (e.getSource() == left_p) {
			c_area = c_area + "(";
			textField.setText(c_area);
		}

	}

}