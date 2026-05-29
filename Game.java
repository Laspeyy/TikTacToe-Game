public class Game {
    Player player = new Player();

    public char[][] PlayerGuess(char[][] board, int row, int col) {
        if (player.getPlayerCounter() % 2 == 0) {
            board[row - 1][col - 1] = 'x';
            player.increasePlayerCounter();
        } else {
            board[row - 1][col - 1] = 'o';
            player.increasePlayerCounter();
        }

        return board;
    }

    public boolean gameStatus(char[][] board) {
        boolean gameNotOver = true;
        int xCounter = 0;
        int oCounter = 0;
        //Row checker
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 'x') {
                    xCounter++;
                } 
                else if (board[i][j] == 'o') {
                    oCounter++;
                }
            }
            if (xCounter == 3 || oCounter == 3) {
                gameNotOver = false;
            }
            else{
                xCounter = 0;
                oCounter = 0;
            }
        }
        // Col checker
        xCounter = 0;
        oCounter = 0;
        for (int col = 0; col < 3; col++) {
            for (int row = 0; row < 3; row++) {
                if (board[row][col] == 'x') {
                    xCounter++;
                } 
                else if (board[row][col] == 'o') {
                    oCounter++;
                }
            }
            if (xCounter == 3 || oCounter == 3) {
                gameNotOver = false;
            }
            else{
                xCounter = 0;
                oCounter = 0;
            }
        }
        /** 
        int tieCounter = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 'e') {
                    tieCounter++;
                    //gameNotOver = false;
                }
            }
        }
        if (tieCounter >)
        **/
        // checks rows for 3 x or o
        // checks col for 3 x or o
        // check diaganaly for 3 x or o
        // check if there are any remaining e -> return tie if no more e left
        return gameNotOver;
    }

}
