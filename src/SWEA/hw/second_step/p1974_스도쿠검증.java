import java.util.Scanner;
import java.util.Arrays;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
       
        int[][] map = new int[9][9];
        int[] deltaRow = {0, 0, -1, 1, -1, 1, -1, 1};
        int[] deltaCol = {-1, 1, 0, 0, 1, -1, -1, 1};
        int[] checkNum = new int[9];
        int testCase = sc.nextInt(); // 테스트 케이스 입력
        
        for(int i = 1; i <= testCase; i++){
            
            int check = 1; // 정상 스도쿠인지 확인
            
            for(int col = 0; col < 9; col++){
                for(int row =0; row < 9; row++){
                    map[col][row] = sc.nextInt(); // 맵 입력
                }
            }

           
           
           for(int col = 0; col < 9; col++){   // 모든 가로 확인
                for(int c = 0 ; c < 9 ; c++){
                    checkNum[c] = 0;
                }
                for(int row =0; row < 9; row++){ // 스도쿠의 숫자에 해당하는 배열 인덱스의 값을 올려줌
                  checkNum[map[col][row] - 1]++; 
                  }
                for(int j = 0; j < 9; j++){ // 1~9가 존재하는지 확인
                    if(checkNum[j] != 1){
                        check = 0;
                    }
                }
            
            }
            

            for(int row = 0; row < 9; row++){   // 모든 세로 확인
                for(int c = 0 ; c < 9 ; c++){
                    checkNum[c] = 0;
                }
                for(int col =0; col < 9; col++){ // 스도쿠의 숫자에 해당하는 배열 인덱스의 값을 올려줌
                  checkNum[map[col][row] - 1]++; 
                  }
                for(int j = 0; j < 9; j++){ // 1~9가 존재하는지 확인
                    if(checkNum[j] != 1){
                        check = 0;
                    }
                }
            
            }
            
            for(int col = 0; col < 9; col++){ // 8방 확인 
                for(int row =0; row < 9; row++){
                   if((col == 1 && row == 1) || (col == 1 && row == 4) || (col == 1 && row == 7) || (col == 4 && row == 1) || (col == 4 && row == 4) || (col == 4 && row == 7) || (col == 7 && row == 1) || (col == 7 && row == 4) || (col == 7 && row == 7)){
                        for(int c = 0 ; c < 9 ; c++){
                        checkNum[c] = 0;
                        }
                       for(int d = 0; d < 8; d++){
                           int newCol = col + deltaCol[d];
                           int newRow = row + deltaRow[d];
                           
                           checkNum[map[newCol][newRow] - 1]++;
                       }
                       checkNum[map[col][row] - 1 ]++;
                         for(int j = 0; j < 9; j++){ // 1~9가 존재하는지 확인
                            if(checkNum[j] != 1){
                                 check = 0;
                            }
                        }       
                   }
                }
            }
            

            System.out.println("#" + i + " " + check);
        }
    }
}