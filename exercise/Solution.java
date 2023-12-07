package exercise;

import java.util.Scanner;

import static javax.security.auth.callback.ConfirmationCallback.YES;

public class Solution {
    public static boolean canWinGame (int leap, int []game){
    return canWinFromPosition(0, leap, game);
    }
    private static boolean canWinFromPosition(int position, int leap, int []game){
        if(position<0||game[position]==1){
            return false;
        }else if (position+1>=game.length||position+leap>=game.length){
            return true;
        }
        game[position]=1;
        return canWinFromPosition(position+1, leap, game)||
                canWinFromPosition(position+leap, leap, game)||
                canWinFromPosition(position+1, leap, game);

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int q= scanner.nextInt();
        while(q-->0){
            int n= scanner.nextInt();
            int leap= scanner.nextInt();

            int[]game=new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scanner.nextInt();
            }
            System.out.println((canWinGame(leap, game))?YES:"NO");
        }
        scanner.close();
    }

}
