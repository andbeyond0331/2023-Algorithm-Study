package study;

import java.util.Scanner;

public class BEAK_p2292 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int checknum = 1;
		int i = 0;

		while (true) {
			checknum = checknum + i * 6;

			if (num <= checknum) {
				System.out.println(i + 1);
				break;
			}

			i++;

		}
	}

}
