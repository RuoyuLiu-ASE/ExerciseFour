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
    public void startGame() {
        Scanner move = new Scanner(System.in);
        String m =  move.next();
        int x,y; // x represents row, y represents column
        x = m.charAt(1) - '1';  //Transfer from char to number corresponding char
        y = m.charAt(0) - 'A';

        while (true) {
            if (x < 0 || x > 2 || y < 0 || y > 2 || chessBoard[x][y] != '_') {
                System.out.println("Move is not available, please make another move!");
                break;
            } else {
                chessBoard[x][y] = 'X';
                size++;
                break;
            }
        }
    }
}
