package com.del.assignment;

public class WholeNumbers {
public static void main(String[] args) {
	int j=6;
	for(int i=8;i<14;i++) {
		System.out.print(i+" ");
		for(;j>0;j--) {
			System.out.print(j+" ");
			j=j-1;
			break;
		}
	}
}
}
