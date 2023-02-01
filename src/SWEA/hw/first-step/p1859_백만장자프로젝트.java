package P1859;

import java.util.Scanner;

public class p1859 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int testCase = sc.nextInt(); // testCase 개수 입력 받기
    for (int i = 1; i <= testCase; i++) { // testCase만큼 반복
        int num = sc.nextInt(); // 상품 개수

        int[] price = new int[num];
        long plus = 0;
        for (int j = 0; j < num; j++) {
            price[j] = sc.nextInt();
        }
        int max = price[num - 1];
        
        for (int j = num - 1; j >= 0; j--) {
            if(max > price[j]) {
                plus = (long)(plus + max - price[j]);
            }
            else {
                max = Math.max(max, price[j]);
            }
        }
        System.out.println("#"+i+" "+plus);
    }
}
}