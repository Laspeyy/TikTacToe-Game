public class Player{
    private int playerCounter;
    
    public Player(){
        this.playerCounter = 0;
    }
    public int getPlayerCounter(){
        return this.playerCounter;
    }
    
    public void increasePlayerCounter(){
        playerCounter++;
    }
}