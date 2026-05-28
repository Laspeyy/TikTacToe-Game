public class Game{
    Player player = new Player();

    public char[][] PlayerGuess(char[][] board, int row, int col){
        if(player.getPlayerCounter() % 2 == 0){
            board[row - 1][col - 1] = 'x';
            player.increasePlayerCounter();
        }
        else{
            board[row - 1][col - 1] = 'o';
            player.increasePlayerCounter();
        }
   
        return board;
    }
    public boolean gameStatus(char[][] board){
        return false;
    }
  
}