/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.Scanner;
/**
 *
 * @author rbath1
 */
public class Game {
    
    public Game(){
    } 
    
   public void startGame(){
       GameBoard gameBoard = new GameBoard();
       gameBoard.getAndCreatePlayers();
       gameBoard.playersMove();
   }
}
