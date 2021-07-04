package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO -- start your code here

    int num1 = 0, num2 = 0;

    public Divide(int argumentOne, int argumentTwo){
        num1 = argumentOne;
        num2 = argumentTwo;
    }
    public String toString(){
        if(num2 != 0){
            return String.valueOf(num1/num2) + " R: "+ String.valueOf(num1%num2);
        }
        else{
            return "Warning!";
        }
    }
}
