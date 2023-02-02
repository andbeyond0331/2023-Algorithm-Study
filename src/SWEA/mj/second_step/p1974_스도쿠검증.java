package SWEA.mj.second_step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p1974_스도쿠검증 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuffer sb = new StringBuffer();

		for(int testCase = 0; testCase < T; testCase++) {
			int sum = 0;
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int cnt = 0; cnt < 10; cnt++) {
				int num = Integer.parseInt(st.nextToken());
				if(num%2!=0) {
					sum+=num;
				}
			}
			sb.append("#"+(testCase+1)+" " + sum+"\n");

		}

		bw.append(sb.toString());
		bw.flush();
		br.close();
		bw.close();

	}

}
