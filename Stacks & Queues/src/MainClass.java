import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by XLuis on 4/1/2017.
 */
public class MainClass {

    public static void main(String[] args){
        MainClass mainclass = new MainClass();
        mainclass.checkForMyStack();
        mainclass.checkForRegularStack();
    }
    public void checkForRegularStack(){
        long startTime = System.currentTimeMillis();
        //Stacks
        Stack myStack = new Stack();
        for(int x = 0;x<=100000000;x++){
            myStack.push("Hello World");
        }
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("This is the regular Stack "+totalTime);
    }
    public void checkForMyStack(){
        long startTime = System.currentTimeMillis();
        //Stacks
        Stacks myStack = new Stacks();
        for(int x = 0;x<=100000000;x++){
            myStack.Push("Hello World"+x);
        }
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("This is my awesome stack "+totalTime);
    }
}
