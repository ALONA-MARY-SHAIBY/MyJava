package java10;
import java.util.Scanner;
public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r,c;
		System.out.println("Enter the no of rows:");
		r=sc.nextInt();
		System.out.println("Enter the no of columns:");
		c=sc.nextInt();
		int[][] matrixA = new int[r][c];
        System.out.println("Enter the elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();

	}
        int[][] Tmatrix=new int[r][c];
        for(int i=0;i<r;i++) {
        	for(int j=0;j<c;j++) {
        		Tmatrix[i][j]=matrixA[j][i];
        		
        	}
        }
        System.out.println("The transposed matrix is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(Tmatrix[i][j] + " ");
            }
            System.out.println();

	}

	}
}
