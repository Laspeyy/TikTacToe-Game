import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int row = 0;
        int col = 0;
        Board board = new Board();
        Game game = new Game(); 
        char[][] arr = board.getBoard();
        board.boardInitialization(arr);
        
        while(!game.gameStatus(arr))
            
            {
            for(char [] boardRow : arr){
            System.out.println(Arrays.toString(boardRow) + " ");
            }
            System.out.println("Which Row?");
            row = input.nextInt();
            System.out.println("Which Col?");
            col = input.nextInt();
            //board = game.playerGuess(board,row,col);
            // Infiite Loop if this is removed
            break;
        }
        System.out.println();
        //System.out.printf("Player %s wins",game.winner);
    }
}
//TODO: Finish playerGuess so that it takes in a board, row, col that replaces the given row/col with the appropriate
// X or O
//TODO: Finish gameStatus so that when called, it can return true or false if there is a victory or tie
