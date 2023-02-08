package Baekjoon.mj.third_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2798_블랙잭 {
	static int sum;
	static int N;
	static int M;
	static int[] cards;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		cards = new int[N];
		StringTokenizer nums = new StringTokenizer(br.readLine(), " ");

		sum = 0;

		for (int i = 0; i < N; i++) {
			cards[i] = Integer.parseInt(nums.nextToken());
		}

		dfs(0, 0, 0);

		System.out.println(sum);




	}

	static void dfs(int depth, int idx, int tempSum){
		if(depth==3) {
			sum = Math.max(tempSum, sum);
			return;
		}
		if(idx<cards.length && tempSum+cards[idx]<=M) {
			dfs(depth+1, idx+1, tempSum+cards[idx]);
		}
		if(idx<cards.length && tempSum<=M){
			dfs(depth, idx+1, tempSum);
		}
	}
}
