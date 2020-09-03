package problem11651;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
 * 백준 11651번 문제
 */

public class Problem11651 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		int[][] arr = new int[number][2];
		for(int i=0; i<number; i++) {
			arr[i][0] = scan.nextInt();
			arr[i][1] = scan.nextInt();
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] x, int[] y) {
				if(x[1] == y[1]) {
					return Integer.compare(x[0], y[0]);
				}
				return Integer.compare(x[1], y[1]);
			}
		});
		
		for(int i=0; i<number; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}
