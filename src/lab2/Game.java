/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
/**
 * Robert Bath
 * 
 */
public class Game {
    GameBoard gameBoard = new GameBoard();
    public Game(){
    } 
    
   public void startGame(){
       gameBoard.getAndCreatePlayers();
   }
   public void gameOn(){
       while(gameBoard.getCheckWin() == false){
           gameBoard.playerMove();
       }
       System.out.println("Congratulations player" + gameBoard.getPlayer() +
               " you win!");
   }
}
