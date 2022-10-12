package com.matrix;

public class Muliple_two {
public static void main(String[] args) {
	int a[][]= {{1,2},{2,3}};
	int b[][]= {{1,2},{2,3}};
	int c[][]=new int[2][2];
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<b.length;j++) {
			for(int k=0;k<c.length;k++) {
				c[i][j]+=a[i][k]*b[k][j];
			}
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
}
}
