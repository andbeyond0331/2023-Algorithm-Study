package week1;

import java.util.Scanner;

public class P2071 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int testCase = sc.nextInt();
		
		for (int idx = 1; idx <= testCase; idx++) {
			double total = 0;
			for (int i = 0; i < 10; i++) {
				num = sc.nextInt();
				total += num;
			}
			System.out.println("#" + idx + " " + Math.round(total/10));
		}

	}
}
