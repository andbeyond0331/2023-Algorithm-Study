package Baekjoon.mj.third_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2941_크로아티아알파벳 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String[] ch = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String rep = str;
		int cnt = 0;

		for (int i = 0; i < ch.length; i++) {
			if(i!=2){
				if(rep.contains(ch[i])) {
					rep = rep.replaceAll(ch[i], ",");
					cnt+= (str.length()-rep.length());
					str = rep;
				}
			}else{
				if(rep.contains(ch[i])) {
					rep = rep.replaceAll(ch[i], ",");
					cnt+= (str.length()-rep.length())/2;
					str = rep;
				}
			}
		}

		StringTokenizer st = new StringTokenizer(str, ",");
		while(st.hasMoreTokens()){
			cnt+=st.nextToken().length();
		}
		System.out.println(cnt);
	}
}
