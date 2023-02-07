package study;

import java.util.Scanner;

public class BEAK_p1592 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int N = sc.nextInt(); // 배열 수
	        int M = sc.nextInt(); // 공 받은 횟수
	        int L = sc.nextInt(); // 던지기
	        int[] person = new int[N];
	        int ballCount = 0; // 공 던진 횟수

	        person[0] = 1;

	        int idx = 0;
	        while(true) {
	            if(person[idx] == M) {
	                break;
	            }

	            if(person[idx] % 2 == 1) {
	                idx = idx + L;
	            }

	            else {
	                idx = idx - L;
	            }

	            if(idx >= N) {
	                idx -= N;
	            }

	            else if(idx < 0) {
	                idx += N;
	            }

	            person[idx]++;
	            ballCount++;
	        }
	        System.out.println(ballCount);
	}
}
