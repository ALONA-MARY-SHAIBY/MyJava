package LAB2024;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class Calculator implements ActionListener {
 int operator=0;
 double a=0,b=0;
 double result;
 JTextField t1;
 JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bclr,beq;
 Calculator(){
  JFrame f = new JFrame("My Calculator");
  JPanel p = new JPanel();
  t1= new JTextField();
  t1.setBounds(100,100,200,30);
  b1= new JButton("1");
  b1.setBounds(100,140,50,30);
  b2= new JButton("2");
  b2.setBounds(150,140,50,30);
  b3= new JButton("3");
  b3.setBounds(200,140,50,30);
  badd= new JButton("+");
  badd.setBounds(250,140,50,30);
  b4= new JButton("4");
  b4.setBounds(100,170,50,30);
  b5= new JButton("5");
  b5.setBounds(150,170,50,30);
  b6= new JButton("6");
  b6.setBounds(200,170,50,30);
  bsub= new JButton("-");
  bsub.setBounds(250,170,50,30);
  b7= new JButton("7");
  b7.setBounds(100,200,50,30);
  b8= new JButton("8");
  b8.setBounds(150,200,50,30);
  b9= new JButton("9");
  b9.setBounds(200,200,50,30);
  bmul= new JButton("*");
  bmul.setBounds(250,200,50,30);
  bclr=new JButton("C");
  bclr.setBounds(100,230,50,30);
  b0=new JButton("0");
  b0.setBounds(150,230,50,30);
  beq=new JButton("=");
  beq.setBounds(200,230,50,30);
  bdiv=new JButton("/");
  bdiv.setBounds(250,230,50,30);
  f.setSize(500,500);
  p.add(t1);
  p.add(b1);p.add(b2);p.add(b3);p.add(badd);
  p.add(b4);p.add(b5);p.add(b6);p.add(bsub);
  p.add(b7);p.add(b8);p.add(b9);p.add(bmul);
  p.add(bclr);p.add(b0);p.add(beq);p.add(bdiv);
  b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);badd.addActionListener(this);
  b4.addActionListener(this);b5.addActionListener(this);b6.addActionListener(this);bsub.addActionListener(this);
  b7.addActionListener(this);b8.addActionListener(this);b9.addActionListener(this);bmul.addActionListener(this);
  bclr.addActionListener(this);b0.addActionListener(this);beq.addActionListener(this);bdiv.addActionListener(this);
  f.add(p);
  p.setLayout(null);
  f.setVisible(true);
  f.setResizable(false);
 }
 public void actionPerformed(ActionEvent e) {
  if(e.getSource()==b1)t1.setText(t1.getText()+"1");
  if(e.getSource()==b2)t1.setText(t1.getText()+"2");
  if(e.getSource()==b3)t1.setText(t1.getText()+"3");
  if(e.getSource()==b4)t1.setText(t1.getText()+"4");
  if(e.getSource()==b5)t1.setText(t1.getText()+"5");
  if(e.getSource()==b6)t1.setText(t1.getText()+"6");
  if(e.getSource()==b7)t1.setText(t1.getText()+"7");
  if(e.getSource()==b8)t1.setText(t1.getText()+"8");
  if(e.getSource()==b9)t1.setText(t1.getText()+"9");
  if(e.getSource()==b0)t1.setText(t1.getText()+"0");
  if(e.getSource()==badd) {
    a= Double.parseDouble(t1.getText());
    operator =1;
   t1.setText(" ");
  }
  if(e.getSource()==bsub) {
    a= Double.parseDouble(t1.getText());
    operator =2;
   t1.setText(" ");
  }
  if(e.getSource()==bmul) {
   a= Double.parseDouble(t1.getText());
   operator =3;
   t1.setText(" ");
  }
  if(e.getSource()==bdiv) {
   a= Double.parseDouble(t1.getText());
    operator =4;
   t1.setText(" ");
  }
  if(e.getSource()==bclr) {
   t1.setText(" ");
  }
  if(e.getSource()==beq) {
   b= Double.parseDouble(t1.getText());
   try {
    switch(operator) {
        case 1:
         result=a+b;break;
     case 2:
      result=a-b;break;
     case 3:
      result=a*b;break;
     case 4:
      if(b==0) {
       t1.setText("Error");
       return;
      }
      result=a/b;
      break;
      default:
       result=0;
    }
   }catch(ArithmeticException e1) {
    System.out.println(e1.getMessage());
   }
   String rs= String.valueOf(result);
   t1.setText(rs);
  }
 }
 public static void main(String[] args) {
  new Calculator();
 }
}