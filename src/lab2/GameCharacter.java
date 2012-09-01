/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.Random;

/**
 *
 * @author Bob
 */
public class GameCharacter {
    Random random = new Random();
    private int currentSquare = 0;
    private int yourRoll;
    boolean winner = false;
    public GameCharacter(){
    }
    //This method performs second
    public void move(){
        this.RollDice();
        this.checkTraps();
        this.checkWin();
    }
    private void RollDice(){
        yourRoll = random.nextInt(6) + 1;
        currentSquare += yourRoll; 
        System.out.println("You rolled: " + yourRoll + "\nCurrent Square: " +
                currentSquare);
    }
    public int getCurrentSquare(){
        return currentSquare;
    }
    public int getRoll(){
        return yourRoll;
    }
    private void checkTraps(){
        if (currentSquare % 4 == 0){
            System.out.println("You landed on a trap, go back 3 spaces!");
            currentSquare -= 3;
        } else if (currentSquare > 25) {
            System.out.println("Need to end on 25");
            currentSquare -= yourRoll;
            
        }
    }
    private void checkWin(){
        if (currentSquare == 25){
            System.out.println("You Win!!");
            winner = true;
        }
    }
    
}

