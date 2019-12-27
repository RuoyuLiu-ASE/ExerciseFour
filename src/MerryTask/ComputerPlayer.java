package MerryTask;

import java.util.Arrays;
import java.util.Scanner;

import static MerryTask.Application.*;
/**
 * @author: Alan
 * @create: 2019-12-27 21:16
 * @function:
 * @version:
 * @important value:
 */
public class ComputerPlayer {
    private String level;
    public ComputerPlayer() {
        // Initialize the chess table with _'
        for (char[] line : chessBoard) {
            Arrays.fill(line, '_');
        }
    }
    public void startGame() {
        System.out.println("Shall we play a game?");
        Scanner inputs = new Scanner(System.in);
        String answer = inputs.next();
        if (answer.equals("yes")) {
            System.out.println("Choose difficulty");
            Scanner mode = new Scanner(System.in);
            level = mode.next();
            if ( level.equals("easy")) {
                easyMode();
            } else if (level.equals("hard")) {
                hardMode();
            } else {
                System.exit(1);
            }
        }
        else if (answer.equals("no")) {
            System.exit(0);
        } else {
            System.exit(1);
        }
    }

    private void easyMode() {
        int rowC, columnC;
        while (true) {
            rowC = (int)(Math.random() * 3);
            columnC = (int)(Math.random() * 3);

            if (chessBoard[rowC][columnC] == '_') {
                chessBoard[rowC][columnC] = 'O';
                break;
            }
            size++;
        }
    }
    private void hardMode() {
        System.out.println("Hahahaha!");
    }

}
