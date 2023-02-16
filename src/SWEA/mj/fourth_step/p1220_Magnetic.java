package SWEA.mj.fourth_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1220_Magnetic {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;

		for (int i = 1; i <= 10; i++) {
			br.readLine();
			int[][] table = new int[100][100];

			for (int j = 0; j < 100; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				for (int k = 0; k < 100; k++) {
					table[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			int cnt = 0;
			for (int j = 0; j < table.length; j++) {
				int tmpCnt = 0;
				int tmp = 0;
				for (int k = 0; k < table.length; k++) {
					if(tmp == 0 ){
						if(table[k][j] == 1){

							tmp = 1;
						}
					}else if(tmp == 1){
						if(table[k][j] == 2){
							tmp = 0;
							tmpCnt ++;
						}
					}
				}
				cnt+= tmpCnt;
			}
			System.out.printf("#%d %d\n", i, cnt);
		}
	}
}
//#1 471
//#2 446
//#3 469
//#4 481
//#5 481
//#6 501
//#7 488
//#8 476
//#9 464
//#10 490