public class Board{
    private char[][] board;
    
    public Board(){
        this.board = new char[3][3];
    }
    public char[][] getBoard(){
        return board;
    }
    public char[][] boardInitialization(char[][] board){
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                board[i][j] = 'e';
            }
        }
        return board;
    }
}