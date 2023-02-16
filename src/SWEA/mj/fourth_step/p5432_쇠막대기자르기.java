package SWEA.mj.fourth_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p5432_쇠막대기자르기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int i = 1; i <= T ; i++) {
			String stick = br.readLine();
			int idx = 0;
			while(idx<stick.length()-1){
				if(stick.charAt(idx)=='(' && stick.charAt(idx+1)==')'){
					stick = stick.replace("()", "0");
//					 System.out.println("stick = " + stick);
				}
				idx++;
			}

//			stick = stick.replaceAll("()", "0");
//			System.out.println(stick);

			int cnt  = 0;
			int sum = 0;
			char tmp = '0';
			for (int j = 0; j < stick.length(); j++) {
				if(tmp == '0'){
					if(stick.charAt(j) == '('){
						sum++;
						tmp = 'l';
					}else if(stick.charAt(j) == ')'){
						cnt+=sum;
						tmp = 'r';
					}else{
						cnt+=sum;
						tmp = '0';
					}
				}else if(tmp == 'l'){
					if(stick.charAt(j) == '('){
						sum++;
					}else if(stick.charAt(j) == '0'){
						cnt+=sum;
						tmp = '0';
					}
				}else if(tmp == 'r'){
					if(stick.charAt(j) == '('){
						cnt -= sum;
						tmp = 'l';
						cnt++;
					}else if(stick.charAt(j) == '0'){
						sum--;
						tmp = '0';
					}else{
						--sum;

					}
				}else{
					System.out.println("");
					System.out.println("이상이상");
				}
			}
			System.out.printf("#%d %d", i, cnt);
		}
	}
}
