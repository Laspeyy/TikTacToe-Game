TikTacToe Game

A game has a standered 3x3 board with 9 empty boxes. At the start of a game you are assigned an X or O. X always goes first, O goes second. Player wins if you are able to get 3 X or O in a row from any direction. Tie if no body wins
/**
 * How the game runs
 * Board shows
 * console prints "X turn" or "O turn"
 * loop starts -> while game.gameStatus (game ends if gameStatus returns false)
 * board position and player1/2 passed through the gameStatus method in game class 
 * loop to find position and replace empty string with X or O
 * game status is called after to see if there are any X or O with 3 in a row
 * loop ends if gameStatus returns false
 * print to console who won
 * 
 * playerGuess will increment by 1 at the end of the method and start from 0. before playerGuess will be ran, there will be a if/else statment to see if 
 * the incremented variable % 2 == 0. If == 0 then its x turn, else its o turn. Switch can be used for playerguess when a box number is entered 
 * instead of multiple if statements
 * 
 * Edge cases: player enters same box number, player enters something other than box number/player 1 or 2, player takes multiple turns instead of typing player1,player2,player1, etc
 */