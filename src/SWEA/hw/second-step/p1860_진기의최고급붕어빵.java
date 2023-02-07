package study;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_p1860 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

		    int testCase = sc.nextInt();

		    for (int idx = 1; idx <= testCase; idx++) {
		        int N = sc.nextInt(); // 자격을 얻은 사람
		        int M = sc.nextInt(); // M초마다
		        int K = sc.nextInt(); // K개를 만든다.
		        boolean pos = false;

		        double canMake = (double) K / M; // 1초에 만드는 붕어빵

		        int[] time = new int[N]; // 손님이 도착하는 시간을 저장
		        double maked = 0; // 붕어빵 재고

		        for (int i = 0; i < N; i++) { // 손님이 도착하는 시간 입력
		            time[i] = sc.nextInt();
		        }

		        Arrays.sort(time);
		        int j = 0;
		        for (int i = 1; i <= 11111; i++) {
		            if( i % M == 0){
		                maked = maked + K;
		            }
		            if( time[j] == i) {
		                maked--;
		                if(maked < 0) {
		                    pos = false;
		                    break;
		                }
		                else {
		                    pos = true;
		                }
		                j++;
		                if( j >= N) {
		                    break;
		                }
		            }
		        }

		        if (pos) {
		            System.out.println("#" + idx + " " + "Possible");
		        } else {
		            System.out.println("#" + idx + " " + "Impossible");
		        }

		    }
	}
}
