package SWEA.mj.fourth_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1961_숫자배열회전 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int test = 1; test <= T; test++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int N = Integer.parseInt(st.nextToken());

			int[][] board = new int[N][N];

			for (int r = 0; r < N; r++) {
				StringTokenizer line = new StringTokenizer(br.readLine(), " ");
				for (int c = 0; c < N; c++) {
					board[r][c] = Integer.parseInt(line.nextToken());
				}
			}

			int[][] one = new int[N][N];
			int[][] two = new int[N][N];
			int[][] three = new int[N][N];

			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					one[r][c] = board[N - 1 - c][r];

				}
			}

			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					two[r][c] = board[N - 1 - r][N - 1 - c];
				}
			}
		}
	}
}
