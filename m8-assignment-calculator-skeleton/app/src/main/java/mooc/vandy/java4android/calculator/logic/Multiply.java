package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    // TODO -- start your code here

    int num1 = 0;
    int num2 = 0;
    public Multiply(int argumentOne, int argumentTwo){
        num1 = argumentOne;
        num2 = argumentTwo;
    }
    public String toString(){
        return String.valueOf(num1*num2);
    }
}
