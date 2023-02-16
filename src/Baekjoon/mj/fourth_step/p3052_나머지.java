package Baekjoon.mj.fourth_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class p3052_나머지 {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));

		int[] arr = new int[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = Integer.parseInt(bufferedReader.readLine());
		}

		List remainders = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			if(!remainders.contains(arr[i]%42)){
				remainders.add(arr[i]%42);
			}
		}

		System.out.println(remainders.size());

		bufferedReader.close();
	}
}
