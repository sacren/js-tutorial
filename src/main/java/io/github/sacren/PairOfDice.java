/**
 * PairOfDice class with dice rolling for a pair of numbers between 1 and 6.
 *
 * <p>Private data:
 * -die1:int
 * -die2:int
 *
 * <p>Constructor:
 * +PairOfDice()
 * +PairOfDice(die1:int, die2:int)
 *
 * <p>Public methods:
 * +pair():int[]
 * +getTotal():int
 * +roll():void
 * +toString():String
 */
import java.util.Arrays;

public class PairOfDice {
    /* private instance data */
    private int die1; /* number on the first die */
    private int die2; /* number on the second die */

    /** PairOfDice default constructor. */
    public PairOfDice() {
        roll();
    }

    /** PairOfDice custom constructor with dice rolled. */
    public PairOfDice(int die1, int die2) {
        this.die1 = die1;
        this.die2 = die2;
    }

    /** PairOfDice getter for each number on the dice rolled. */
    public int[] pair() {
        int[] pair = new int[2];
        pair[0] = die1;
        pair[1] = die2;
        return pair;
    }

    /** PairOfDice setter for die1. */
    public void setDie1(int number) {
        if (number > 6 || number < 1) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", number));
        }
        die1 = number;
    }

    /** PairOfDice setter for die2. */
    public void setDie2(int number) {
        if (number > 6 || number < 1) {
            throw new IllegalArgumentException(
                    String.format("%d is invalid!", number));
        }
        die2 = number;
    }

    /** PairOfDice setter for the pair of dice. */
    public void setDice(int n, int m) {
        setDie1(n);
        setDie2(m);
    }

    /** PairOfDice getter for the total after each roll. */
    public int getTotal() {
        return die1 + die2;
    }

    /**
     * PairOfDice roll method that resets the numbers between 1 and 6 after
     * each roll.
     */
    public void roll() {
        die1 = (int)(Math.random() * 6) + 1;
        die2 = (int)(Math.random() * 6) + 1;
    }

    /** PairOfDice instance description. */
    public String toString() {
        return String.format(
                "Pair of dice %s",
                Arrays.toString(pair()));
    }
}
