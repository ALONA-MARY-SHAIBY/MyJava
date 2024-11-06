package LAB2024;
import java.awt.event.*;

import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
public class TrafficLight  extends JFrame implements ActionListener  {
	JRadioButton r1,r2,r3;
	TrafficLight(){
		 new JFrame("My Traffic Light");
		r1 = new JRadioButton("Red");
		r1.setBounds(100,50,100,50);
		r2= new JRadioButton("Yellow");
		r2.setBounds(200,50,100,50);
		r3= new JRadioButton("Green");
		r3.setBounds(300,50,100,50);
		ButtonGroup gb = new ButtonGroup();
		gb.add(r1);
		gb.add(r2);
		gb.add(r3);
		add(r1);
		add(r2);
		add(r3);
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		r=getBackground();
		y=getBackground();
		gr=getBackground();
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		setResizable(false);
	}
	Color r,y,gr;
	public void actionPerformed(ActionEvent e) {
			if (r1.isSelected()){
				r=Color.red;
				y=getBackground();
				gr=getBackground();
			}
			else if(r2.isSelected()) {
				y=Color.yellow;
				r=getBackground();
				gr=getBackground();
			}
			else if(r3.isSelected()) {
				gr=Color.green;
				y=getBackground();
				r=getBackground();
			}
			repaint();
	} 
	public void paint(Graphics g) {
		super.paint(g);/*This line calls the super class implementation of panit 
		method which clears the previous drawings and prepares the components for fresh drawings.*/
		g.drawOval(50,100,50,50);
		g.drawOval(50,160,50,50);
		g.drawOval(50,220,50,50);
		g.setColor(r);
		g.fillOval(50,100,50,50);
		g.setColor(y);
		g.fillOval(50,160,50,50);
		g.setColor(gr);
		g.fillOval(50,220,50,50);
	}
	public static void main(String[] args) {
		new TrafficLight();
	}
}
