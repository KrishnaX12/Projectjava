import java.util.*;
public class Tic_Tac_Toe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];
        char player = 'X';
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                board[row][col] = ' ';
            }
        }
        boolean won = false;
        while(!won){
            pboard(board,player);
            if(!cords(player,sc,board)){
            System.out.println("Invalid location....");
            return;
            }
            won = !iswon(board,player);
            player = (player == 'X')?'O':(player == 'O')?'X':'N';
            if(player=='N'){
                System.out.println("Invalid input");
                return;
            }
        }
    }
    public static void pboard(char[][] board,char player) {
        System.out.println("-------------");
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
    public static boolean cords(char player,Scanner sc,char[][] board){
        System.out.println("Enter ur row & col player : "+player);
        int row = sc.nextInt();
        int col = sc.nextInt();
        boolean input = (row<3 && row>=0 && col>=0 && col<3)?true:false;
        if(board[row][col] != ' '){
            return false;
        }
        if(input) {
            board[row][col] = player;
            return input;
        }
        return input;
    }
    public static boolean iswon(char[][] board,char player){
        for(int row=0;row<3;row++){
            if(board[row][0]==player && board[row][1]==player && board[row][2]==player ){
                System.out.println("Player "+player+" won !!!");
                return false;
            }
        }
        for(int col=0;col<3;col++){
            if(board[0][col]==player && board[1][col]==player && board[2][col]==player ){
                System.out.println("Player "+player+" won !!!");
                return false;
            }
        }
        if(board[0][0]==player && board[1][1]==player && board[2][2]==player ){
            System.out.println("Player "+player+" won !!!");
            return false;
        }
        if(board[0][2]==player && board[1][1]==player && board[2][0]==player ){
            System.out.println("Player "+player+" won !!!");
            return false;
        }
        return true;
    }
}
