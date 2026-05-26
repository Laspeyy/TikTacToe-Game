import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        boolean temp = true;
        int position = 0;
        String player = " ";
        Board board = new Board();
        char[][] arr = board.getBoard();
        board.boardInitialization(arr);
        
        while(temp)
            //game.gameStatus
            {
            for(char [] row : arr){
            System.out.println(Arrays.toString(row) + " ");
            }
            /** 
            System.out.println("Which Player");
            player = input.nextLine();
            System.out.println("Box number 1-9");
            position = input.nextInt();
            board = game.playerGuess(player,position,board);
            */
            temp = false;
        }
        //System.out.printf("Player %s wins",game.winner);
    }
}
/**
 * How the game runs
 * Players are assigned an X or O 
 * Board shows
 * loop starts -> while game.gameStatus (game ends if gameStatus returns false)
 * board position and player1/2 passed through the gameStatus method in game class 
 * loop to find position and replace empty string with X or O
 * game status is called after to see if there are any X or O with 3 in a row
 * loop ends if gameStatus returns false
 * print to console who won
 * 
 * playerGuess will increment by 1 at the end of the method and start from 0. before playerGuess will be ran, there will be a if/else statment to see if 
 * the incremented variable % 2 == 0. If == 0 then its x turn, else its o turn
 * 
 * Edge cases: player enters same box number, player enters something other than box number/player 1 or 2, player takes multiple turns instead of typing player1,player2,player1, etc
 */