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
        
        while(game.gameStatus(arr)){
            for(char [] boardRow : arr){
            System.out.println(Arrays.toString(boardRow) + " ");
            }
            System.out.println("Which Row? (1-3)");
            row = input.nextInt();
            System.out.println("Which Col? (1-3)");
            col = input.nextInt();
            arr = game.PlayerGuess(arr,row,col);
        }
        System.out.println();
        for(char [] boardRow : arr){
            System.out.println(Arrays.toString(boardRow) + " ");
            }
    }
}

