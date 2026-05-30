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
            xCounter = 0;
            oCounter = 0;
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 'x') {
                    xCounter++;
                } 
                else if (board[i][j] == 'o') {
                    oCounter++;
                }
            }
            if (xCounter == 3 || oCounter == 3) {
                if(xCounter == 3){
                    System.out.println("X is the winner");
                    gameNotOver = false;
                    break;
                }
                else if(oCounter == 3){
                    System.out.println("O is the winner");
                    gameNotOver = false;
                    break;
                }
                //gameNotOver = false;
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
                 if(xCounter == 3){
                    gameNotOver = false;
                    System.out.println("X is the winner");
                    break;
                }
                else if(oCounter == 3){
                    gameNotOver = false;
                    System.out.println("O is the winner");
                    break;
                }
            }
            else{
                xCounter = 0;
                oCounter = 0;
            }
        }
        //diaganol checker
        if(board[0][0] == 'x' && board[1][1] == 'x' && board[2][2] == 'x' || 
        (board[0][2] == 'x' && board[1][1] == 'x' && board[2][0] == 'x')){
            System.out.println("X is the winner");
            gameNotOver = false;
        }
        else if(board[0][0] == 'o' && board[1][1] == 'o' && board[2][2] == 'o' ||
        (board[0][2] == 'o' && board[1][1] == 'o' && board[2][0] == 'o')){
            System.out.println("o is the winner");
            gameNotOver = false;
        }
        // tie checker
        int tieCounter = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 'e') {
                    tieCounter++;
                }
            }
        }
        if (tieCounter == 0){
            System.out.println("It's a tie, try again next time");
            gameNotOver = false;
        }
        return gameNotOver;
    }
}
