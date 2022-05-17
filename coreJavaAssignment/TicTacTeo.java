package com.java;

import java.util.Scanner;

public class TicTacTeo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char board[][]=new char[3][3];
        initializeBoard(board);
        System.out.println("Player1: o \nplayer2: X");
        int chance=0;
        int player;
        while(true){
            player=((chance%2)+1);
            System.out.println("player"+player+" enter the position where you want to place your choice.\n please enter row:");
            int row=sc.nextInt();
            System.out.println("Enter the column : ");
            int col=sc.nextInt();
            if(isEmpty(board,row,col)) {
                if (player == 1)
                    board[row][col] = 'O';
                else
                    board[row][col] = 'X';
                chance+=1;
            }else{
                continue;
            }
            display(board);

            if(isWinner(board)) {
                System.out.println("player " + player + " is winner");
                break;
            }


        }


    }
    public static void initializeBoard(char[][] board){
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                board[row][col]='-';
            }
        }
    }

    public static void addUserChoice(char[][] board,int row,int col){
        board[row][col]='o';
    }
    public static boolean isEmpty(char[][] board,int row,int col){
        if(board[row][col]=='-')
            return true;
        else
            return false;
    }
    public static boolean isWinner(char[][] board){
        for(int i=0;i<3;i++){
                if((board[i][0]==board[i][1] && board[i][1]==board[i][2])&&(board[i][0]=='O' || board[i][0]=='X') )
                    return true;
                if((board[1][i]==board[0][i] && board[1][i]==board[2][i])&&(board[1][i]=='O' || board[1][i]=='X'))
                    return true;
        }
        if((board[0][0]==board[1][1] && board[1][1]==board[2][2] &&(board[0][0]=='O' || board[0][0]=='X')))
            return true;
        if(board[0][2]==board[1][1] && board[1][1]==board[2][0] &&(board[0][2]=='O' || board[0][2]=='X'))
            return true;
        return false;
    }
    public static void display(char[][] board){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
