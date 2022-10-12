package com.matrix;

public class Transpose_Matrix {
public static void main(String[] args) {
	int ori[][]= {{1,2,3},{1,2,3},{1,2,3}};
	int tran[][]= new int[3][3];
	for(int i=0;i<ori.length;i++) {
		for(int j=0;j<tran.length;j++) {
			tran[i][j]=ori[j][i];
		}
	}
	System.out.println("The original matrix");
	for(int i=0;i<ori.length;i++) {
		for(int j=0;j<tran.length;j++) {
			System.out.print(ori[i][j]);
		}
		System.out.println();
	}
	System.out.println("The Transpose matrix");
	for(int i=0;i<ori.length;i++) {
		for(int j=0;j<tran.length;j++) {
			System.out.print(tran[i][j]);
		}
		System.out.println();
	}
}
}
