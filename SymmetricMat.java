package java10;
import java.util.Scanner;
public class SymmetricMat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,flag=0;
		System.out.println("Enter the size:");
		n=sc.nextInt();
		int[][] matrix=new int[n][n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j] = sc.nextInt();
            }
        }
		System.out.println("The matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		if(matrix[i][j]!=matrix[j][i]) {
        			flag=1;
        			break;
        		}
        	}
        }
        if(flag==0) {
        	System.out.println("Matrix is symmetric");
        }
        else {
        	System.out.println("Matrix is not symmetric");
        }
	}

}
