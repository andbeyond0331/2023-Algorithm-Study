package week1;

import java.util.Scanner;

public class P2072 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test_case = sc.nextInt(); // testcase 개수를 입력 받음.
		int num = 0;
		for (int i = 1; i <= test_case; i++) {
			int total = 0;
			for (int j = 0; j < 10; j++) {
				num = sc.nextInt();
				if (num % 2 != 0) {
					total += num;
				}
			}
			System.out.println("#"+ i + " "+ total);
		}

	}
}