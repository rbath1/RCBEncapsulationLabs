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
    private boolean winner = false;
    public GameBoard(){
    }
     private void setNumOfPlayers(){
        //needs validation
        System.out.print("Enter number of players(2-4): ");
        Scanner scanner = new Scanner(System.in);
        numOfPlayers = scanner.nextInt();
    }
    public int getNumOfPlayers(){
        return numOfPlayers;
    }
    private void createPlayers(){
       /* needs validation and more.....
        * this would require reworking. Thinking I could 
        * make seperate classes for the different # of player 
        * games and call that class in main depending on their 
        * selection, but may violate the DRY principle
        */
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
     
    public void playerMove(){
        //validation needed and much, much more
        System.out.print("Player" + playerTurn + " Press [Enter] to roll the dice");
        player(playerTurn).move();
        player(playerTurn).check();
        playerTurn++;
    }
    private void checkTraps(){
        // violates single responsibility?
        //not proper code
        if (player(playerTurn).getCurrentSquare % 4 == 0){
            System.out.println("You landed on a trap, go back 3 spaces!");
            player(playerTurn).setCurrentSquare = player(playerTurn).getCurrentSquare - 3;
        } else if (player(playerTurn).getCurrentSquare > 25) {
            System.out.println("Need to end on 25");
            player(playerTurn).setCurrentSquare = player(playerTurn).getCurrentSquare - 
                    player(playerTurn).getRoll;
        }
    }
    private void checkWin(){
        //violates single responsibility???
        if (player(playerTurn).getCurrentSquare == 25){
            System.out.println("You Win!!");
            winner = true;
        }
    }
    public boolean getCheckWin(){
        return winner;
    }
    //calls checkTraps and checkWin
    
    public void check(){
        this.checkTraps();
        this.checkWin();
    }

//CALLS set players and create players
    public void getAndCreatePlayers(){
        this.setNumOfPlayers();
        this.createPlayers();
    }
    public int getPlayer(){
        return playerTurn;
    }
    
}