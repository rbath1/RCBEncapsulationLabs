/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.Random;

/**
 *
 * Robert Bath
 */
public class GameCharacter {
    Random random = new Random();
    private int currentSquare = 0;
    private int yourRoll;
    boolean winner = false;
    public GameCharacter(){
    }
   
    public void move(){
        this.RollDice();
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
}

