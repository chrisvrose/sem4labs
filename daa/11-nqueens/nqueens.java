
/**
 * nqueens
 */

import java.util.Scanner;
    
public class nqueens {
    protected int board[];
    protected int count;


    nqueens(int n){
        count = 0;
        //col numbers are 1 indexed, so zeroed is fine
        board = new int[n+1];
    }

    

    void queens(int row, int n){
        int col;
        for(col = 1;col<=n;col++){
            //if can place
            if(place(row,col)){
                board[row] = col;
                if(row==n){
                    print(n);
                }else{
                    //proceed to try and place another
                    queens(row+1,n);
                }
            }
        }
    }
    
    boolean place(int row,int col){
        for(int i=1;i<=row;i++){
            if(board[i]==col){
                //there is a piece already, no way can put anything
                return false;
            }
            if(Math.abs(board[i]-col)==Math.abs(i-row)){
                return false;
            }
        }

        return true;

    }

    void print(int n){
        int i,j;
        System.out.println("Solution("+n+"):");
        //col #
        for(i=1;i<=n;i++){
            System.out.format("\t%d",i);
        }
        System.out.println();
        //print the board
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){                
                System.out.print("\t"+(board[i]==j?"Q":"-"));
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Number of queens:");
        int n = in.nextInt();
        //theres no sol till 4x4
        if(n<4){
            System.out.println("no sol");
        }else{
            //start by tryinf to place 1st queen 
            new nqueens(n).queens(1,n);
        }

        in.close();
    }
}