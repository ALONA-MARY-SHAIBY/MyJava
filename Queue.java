package java10;
import java.util.Scanner;
class QueueOperations{
    int[] Q;
    int front,rear,n,size;
    QueueOperations(int size){
        this.Q=new int[size];
        this.size=size;
        front=0;
        rear=-1;     
    }
    void enqueue(int item){
        if(rear==size-1){
            System.out.println("Queue Overflow");
        }
        else{
            rear++;
            Q[rear]=item;
            System.out.println("Element pushed");
        } 
    }
    void dequeue(){
        if(rear<front){
            System.out.println("Queue Underflow");  }
        else{
            System.out.println("The deleted element is: "+Q[front]);
            front++;
        }     
    }
    void display(){
        if(rear<front){
            System.out.println("The Queue is empty");      
        }
        else{
            System.out.println("The Queue is:");
            for(int i=front;i<=rear;i++){
                System.out.print(Q[i]+" ");        
            }     
        }
    }
}
public class Queue {
	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the Queue: ");
        int size=sc.nextInt();
        QueueOperations obj=new QueueOperations(size);
        char c;
        int choice;
        do{
            System.out.print("Queue operations");
            System.out.println("\n1.enqueue\n2.dequeue\n3.Display");
            System.out.print("Enter the choice");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter the element to be inserted:");
                    int item=sc.nextInt();
                    obj.enqueue(item);
                    break;
                case 2:
                    obj.dequeue();
                    break;
                case 3:
                    obj.display();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;  }
            System.out.print("\nDo you want to continue or not(Y/N): ");
            c=sc.next().charAt(0);
        }while(c=='y'||c=='Y');
        System.out.println("Exiting...");
	}
}