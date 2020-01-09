package MerryTask;

import java.util.Scanner;

import static MerryTask.Application.*;
/**
 * @author: Alan
 * @create: 2019-12-27 21:46
 * @function:
 * @version:
 * @important value:
 */
public class HumanPlayer {
    private int x,y; // x represents row, y represents column

    public String playOrNot() {
        Scanner ans = new Scanner(System.in);
        String play = ans.next();
        return play;
    }

    public String levelChoose() {
        Scanner level = new Scanner(System.in);
        return level.next();
    }
    // Input move
    public void startGame() {
        Scanner move = new Scanner(System.in);
        String m =  move.next();
        x = m.charAt(1) - '1'; //Transfer from char to number corresponding char
        y = m.charAt(0) - 'A';
        chessBoard[x][y] = 'X';
        size++;
    }

    //Get the move of x
    public int getRow() {
        return x;
    }

    //Get the move of y
    public int getColumn() {
        return y;
    }
}

