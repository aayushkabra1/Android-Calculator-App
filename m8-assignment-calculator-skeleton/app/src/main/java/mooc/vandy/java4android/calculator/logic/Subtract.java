package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {
    // TODO -- start your code here
    int num1= 0;
    int num2 = 0;

    public Subtract(int argumentOne, int argumentTwo){
        num1 = argumentOne;
        num2 = argumentTwo;
    }
    public String toString(){
        return String.valueOf(num1-num2);
    }
}
