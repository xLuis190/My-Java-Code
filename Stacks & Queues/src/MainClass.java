import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by XLuis on 4/1/2017.
 */
public class MainClass {
    public static void main(String[] args){
        Stacks myStack = new Stacks();
        System.out.println(myStack.StackEmpty());
        myStack.Push("Hello");
        myStack.Push("Booo");
        myStack.Pop();
        myStack.printElements();
        System.out.println(myStack.StackEmpty());

    }
}
