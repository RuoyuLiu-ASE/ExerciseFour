package MerryTask;

/**
 * @author: Alan
 * @create: 2019-12-27 21:03
 * @function:
 * @version:
 * @important value:
 */
public class Application {
    public static char[][] chessBoard =  new char[3][3];
    public static int size = 0;   // 已经下的棋数 Already done
    public static final int CAPACITY = 9;     //总共可以下的棋数  the number of chess

    public static void main(String[] args) {
        Table table = new Table();
        ComputerPlayer game = new ComputerPlayer();
        HumanPlayer player = new HumanPlayer();
        game.startGame();
        table.printBorad();

        while (true) {
            player.startGame();
            table.printBoardPlaying();
        }
/*
            player.startGame();
            table.printBoardPlaying();
*/
    }
}
