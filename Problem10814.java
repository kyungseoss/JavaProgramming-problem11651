package problem10814;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
 * 백준 10814번 문제
 */

public class Problem10814 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		String[][] arr = new String[number][2];
		
		for(int i=0; i<number; i++) {
			arr[i][0] = scan.next();
			arr[i][1] = scan.next();
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				// TODO Auto-generated method stub
				return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}
		});
		
		for(int i=0; i<number; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}
