package LAB2024;
import java.util.*;
class SquareThread extends Thread{
 int randomno;
 SquareThread(int randomno){
  this.randomno=randomno;
 }
 public void run() {
   System.out.println("Square of "+randomno+" = "+(randomno*randomno));
 }
}
class CubeThread extends Thread{
 int randomno;
 CubeThread(int randomno){
  this.randomno=randomno;
 }
 public void run() {
   System.out.println("Cube of "+randomno+" = "+(randomno*randomno*randomno));
  
 }
}
class RandThread1 extends Thread{
 public void run() {
 Random robj= new Random();
 for(int i=1;i<=10;i++) {
 int randomno=robj.nextInt(100);
  if(i%2==0) {
   SquareThread s = new SquareThread(randomno);
   s.start();
  }
  else {
   CubeThread c = new CubeThread(randomno);
   c.start();
  }
 }
	
}}

public class MultiThreadingDemo {

 public static void main(String[] args) {
  RandThread1 obj=new RandThread1();
  obj.start();
 }

}