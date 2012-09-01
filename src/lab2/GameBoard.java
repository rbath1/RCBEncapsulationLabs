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
public class GameBoard {
    public final int totalSpaces = 25;
    public final int trapSpaceInterval = 4;
    private int numOfPlayers;
    private int playerTurn = 1;
    public GameBoard(){
    }
    //THIS FIRST
     private void setNumOfPlayers(){
        //needs validation
        System.out.print("Enter number of players(2-4): ");
        Scanner scanner = new Scanner(System.in);
        numOfPlayers = scanner.nextInt();
    }
    public int getNumOfPlayers(){
        return numOfPlayers;
    }
    //THIS SECOND
    private void createPlayers(){
        //needs validation and more
        if (numOfPlayers <= 2){
            GameCharacter player1 = new GameCharacter();
            GameCharacter player2 = new GameCharacter();
        } else if (numOfPlayers == 3){
            GameCharacter player1 = new GameCharacter();
            GameCharacter player2 = new GameCharacter();
            GameCharacter player3 = new GameCharacter(); 
        }else if (numOfPlayers >= 4){
            GameCharacter player1 = new GameCharacter();
            GameCharacter player2 = new GameCharacter();
            GameCharacter player3 = new GameCharacter();
            GameCharacter player4 = new GameCharacter();
        }   
    }
     //CALLS FIRST AND SECOND and third
    public void getAndCreatePlayers(){
        this.setNumOfPlayers();
        this.createPlayers();
        this.playersMove();
    }
    public void playersMove(){
        //validation needed and much, much, more
       while(player1.getCurrentSquare != 25 || player2.getCurrentSquare != 25 ||
             player3.getCurrentSquare != 25 || player4.getCurrentSquare !=25){
        
        System.out.print("Player" + playerTurn + " Press [Enter] to roll the dice");
        switch(playerTurn){
         case 1:
             player1.move();
             playerTurn++;
             break;
        case 2:
             player2.move();
             playerTurn++;
            break;
            
        case 3:
            player3.move();
            playerTurn++;
            break;
        case 4:
            player4.move();
            playerTurn = 1;
            break;
        }
        System.out.println("YOU WIN!!!");
    }
    
    }   
}
