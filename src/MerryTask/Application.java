package MerryTask;

/**
 * @author: Alan
 * @create: 2019-12-27 21:03
 * @function:
 * @version:
 * @important value:
 */
public class Application {
    public static char[][] chessBoard = new char[3][3];
    public static int size = 0;   // 已经下的棋数 Already done
    public static final int CAPACITY = 9;     //总共可以下的棋数  the number of chess
    public static boolean humanwin = false;
    public static boolean computerwin = false;

    public static ComputerPlayer_ver1 game = new ComputerPlayer_ver1();
    public static HumanPlayer player = new HumanPlayer();

    public static void main(String[] args) {
        String flag = ""; //represent the level
        int anotherRound = 0;
        String playOrNot;
        char piece;

        game.startGame();
        playOrNot = player.playOrNot();

        while ("yes".equals(playOrNot)) {
            if (0 == anotherRound) {
                game.initTable();
                game.chooseLevel();
                flag = player.levelChoose();
                game.printTable();
                anotherRound = 1;
            }
            game.makeMoveMessage();
            player.startGame();
            piece = player.getPiece();
            player.placePiece();
            if(game.validMove(piece)) {
                if ("easy".equals(flag)) {
                    game.easyMode();
                } else if ("hard".equals(flag)) {
                    game.hardMode();
                }
                humanwin = game.judge(player);
                computerwin = game.judge(game);
                if (true == game.overOrNot()) {
                    game.printBoardPlaying();
                    game.result();
                    game.startGame();
                    playOrNot = player.playOrNot();
                    anotherRound = 0;
                } else {
                    game.printBoardPlaying();
                }
            }
/*
            player.startGame();
            table.printBoardPlaying();
*/
        }
    }
}
