package GqtCodes;

import java .util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the value:");
		int n = sc.nextInt();
		for(int i=0; i<=n-1; i++) {
			for(int j=0; j<=n-1; j++) {
				if(i==0 && j<n/2 || i==n-1 && j<n/2 || j==n/4) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j=0; j<=n-1; j++) {
				if(j==0 || i==n-1) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j=0; j<=n-1; j++) {
				if(j==0 && i!=0 && i!=n-1 || i==n-1 && j<n/2 && j!=0 || j==n/2 && i!=0 && i!=n-1 || i==0 && j!=0 && j<n/2) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j=0; j<=n-1; j++) {
				if(i-j==n/2 || i+j==(n-1)+n/2 ) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j=0; j<=n-1; j++) {
				if(j==0 || i==0 && j<n/2 || i==n-1 && j<n/2 || i==n/2 && j<n/2) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j=0; j<=n-1; j++) {
				if(j==0 || i==j && j<=n/2 || i+j==n-1 && j>=n/2 || j==n-1) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j=0; j<=n-1; j++) {
				if(i==j && j<n/2 || i+j==n-1) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j=0; j<=n-1; j++) {
				if(i==0 && j!=0 && j<n/2 || j==0 && i<n/2 && i!=0 || i==n/2 && j<n/2 || j==n/2 && i>n/2 && i!=n-1 || i==n-1 && j<n/2) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j=0; j<=n-1; j++) {
				if(j==0 || j==n/2 || i==n/2 && j<=n/2 || i==0 && j<=n/2) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j=0; j<=n-1; j++) {
				if(i==0 && j<n/2 || i==n-1 && j<n/2 || j==n/4) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			}
			}
	}

	

	

