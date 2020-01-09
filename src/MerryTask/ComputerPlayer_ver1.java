package MerryTask;

import java.util.Arrays;
//import java.util.Scanner;

import static MerryTask.Application.*;

/**
 * @author: Alan
 * @create: 2019-12-27 21:16
 * @function:
 * @version:
 * @important value:
 */
public class ComputerPlayer_ver1 {
    private String level;
    //private HumanPlayer humanPlayer = new HumanPlayer();

    public void initTable() {
        // Initialize the chess table with _'
        for (char[] line : chessBoard) {
            Arrays.fill(line, '_');
        }
    }
    public void startGame() {
        System.out.println("Shall we play a game?");
    }

    public void chooseLevel() {
        System.out.println("Choose difficulty:");
    }
    //Draw the table at the beginning
    public void  printTable() {
            System.out.println("  A   B   C");
            System.out.println("1 _ | _ | _");
            System.out.println("2 _ | _ | _");
            System.out.println("3   |   |  ");
           // System.out.println("Player, make your move:");
    }

    public void makeMoveMessage() {
        System.out.println("Player, make your move:");
    }
    // print the table during the process of playing
    public void printBoardPlaying() {
        System.out.println();
        System.out.println("  A   B   C");
        System.out.println("1 " + chessBoard[0][0] + " | " + chessBoard[0][1] + " | " + chessBoard[0][2] );
        System.out.println("2 " + chessBoard[1][0] + " | " + chessBoard[1][1] + " | " + chessBoard[1][2] );
        System.out.println("3 " + chessBoard[2][0] + " | " + chessBoard[2][1] + " | " + chessBoard[2][2] );
        System.out.println();
    }

    public boolean validMove(char piece) {
        int x = player.getRow();
        int y = player.getColumn();
        if (x < 0 || x > 2 || y < 0 || y > 2 || piece == 'X' || piece == 'O') {
            System.out.println("Move is not valid!");
           // System.out.println(chessBoard[x][y] - 'X');
           // System.out.println(chessBoard[x][y] - 'Y');
           // System.out.println('_'+0);
            return false;
        }
       // System.out.println(chessBoard[x][y] - 'X');
       // System.out.println(chessBoard[x][y] - 'Y');
        //System.out.println('-'+0);
        return true;
    }
    public void easyMode() {
        int rowC, columnC;
        while (true) {
            rowC = (int)(Math.random() * 3);
            columnC = (int)(Math.random() * 3);

            if (chessBoard[rowC][columnC] == '_') {
                chessBoard[rowC][columnC] = 'O';
                size++;
                break;
            }
        }
    }
    public void hardMode() {
        System.out.println("Hahahaha!");
    }
//  Check whether the human is win or not
    public boolean judge(HumanPlayer player) {
        int row = 0;
        int col = 0;
        int line_main = 0;
        int line_sub = 0;

        //check the main line and sub line
        for (int i = 0; i < 3; i++) {
            if (chessBoard[i][i] == 'X') {
                line_main++;
            }

            if (chessBoard[i][2 - i] == 'X') {
                line_sub++;
            }
        }
        // check the row and col
        for (int i = 0; i < 3; i++) {
            for (int m = 0; m < 3; m++) {
                if (chessBoard[i][m] == 'X') {
                    col++;
                }else{
                    col = 0;
                }
                if (3 == col) {
                    return true;
                }
            }
        }
        // check the row and col
        for (int i = 0; i < 3; i++) {
            for (int m = 0; m < 3; m++) {
                if (chessBoard[m][i] == 'X') {
                    row++;
                }else {
                    row = 0; //为了防止直角的情况下的误判
                }
                if (3 == row) {
                    return true;
                }
            }
        }

        if (line_main == 3 || line_sub == 3) {
            return true;
        }
        else{
            return false;
        }
    }

    //  Check whether the human is win or not
    public boolean judge(ComputerPlayer_ver1 computerPlayer_ver1){
        int row = 0;
        int col = 0;
        int line_main = 0;
        int line_sub = 0;

        //check the main line and sub line
        for (int i = 0; i < 3; i++) {
            if (chessBoard[i][i] == 'O') {
                line_main++;
            }

            if (chessBoard[i][2 - i] == 'O') {
                line_sub++;
            }
        }
        // check the row and col
        for (int i = 0; i < 3; i++) {
            for (int m = 0; m < 3; m++) {
                if (chessBoard[i][m] == 'O') {
                    col++;
                }else {
                    col = 0;
                }
                if (3 == col) {
                    return true;
                }
            }
        }
        // check the row and col
        for (int i = 0; i < 3; i++) {
            for (int m = 0; m < 3; m++) {
                if (chessBoard[m][i] == 'O') {
                    row++;
                }else {
                    row = 0;
                }
                if (3 == row) {
                    return true;
                }
            }
        }

        if (line_main == 3 || line_sub == 3) {
            return true;
        }
        else{
            return false;
        }
    }

    public boolean overOrNot() {
        if (size == CAPACITY || true == humanwin || true == computerwin) {
            return true;
        } else {
            return false;
        }
    }

    public void result() {
        if (size == CAPACITY) {
            System.out.println("A STRANGE GAME.");
            System.out.println("THE ONLY WINNING MOVE IS NOT TO PLAY.");
        } else if (true == humanwin) {
            System.out.println("Congratulations, you win!");
        } else if (true == computerwin) {
            System.out.println("Sorry, you lose!");
        }
    }


}
