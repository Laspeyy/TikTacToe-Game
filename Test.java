public class Test {
    public static void main(String[] args) {
        Game game = new Game();
        int passed = 0;
        int failed = 0;

        passed += assertGameOver(game, boardWithRowWin('x', 0), "X wins row 0");
        passed += assertGameOver(game, boardWithRowWin('x', 1), "X wins row 1");
        passed += assertGameOver(game, boardWithRowWin('x', 2), "X wins row 2");
        passed += assertGameOver(game, boardWithRowWin('o', 0), "O wins row 0");
        passed += assertGameOver(game, boardWithRowWin('o', 1), "O wins row 1");
        passed += assertGameOver(game, boardWithRowWin('o', 2), "O wins row 2");
        passed += assertGameContinues(game, boardNoWin(), "No row win");

        failed = 7 - passed;
        System.out.println();
        System.out.println("Passed: " + passed + "/7");
        System.out.println("Failed: " + failed + "/7");
        if (failed > 0) {
            System.exit(1);
        }
    }

    private static char[][] emptyBoard() {
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = 'e';
            }
        }
        return board;
    }

    private static char[][] boardWithRowWin(char mark, int row) {
        char[][] board = emptyBoard();
        for (int j = 0; j < 3; j++) {
            board[row][j] = mark;
        }
        return board;
    }

    private static char[][] boardNoWin() {
        char[][] board = emptyBoard();
        board[0][0] = 'x';
        board[1][1] = 'o';
        board[2][2] = 'x';
        return board;
    }

    private static int assertGameOver(Game game, char[][] board, String name) {
        boolean continues = game.gameStatus(board);
        if (!continues) {
            System.out.println("PASS: " + name + " -> game over (false)");
            return 1;
        }
        System.out.println("FAIL: " + name + " -> expected game over (false), got continues (true)");
        return 0;
    }

    private static int assertGameContinues(Game game, char[][] board, String name) {
        boolean continues = game.gameStatus(board);
        if (continues) {
            System.out.println("PASS: " + name + " -> game continues (true)");
            return 1;
        }
        System.out.println("FAIL: " + name + " -> expected game continues (true), got game over (false)");
        return 0;
    }
}
