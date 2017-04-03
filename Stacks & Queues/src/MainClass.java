import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by XLuis on 4/1/2017.
 */
public class MainClass {
    public static void main(String[] args){
        //Stacks
        Stacks myStack = new Stacks();
        System.out.println(myStack.StackEmpty());
        myStack.Push("Hello");
        myStack.Push("Booo");
        myStack.Pop();
        myStack.printElements();
        System.out.println(myStack.StackEmpty());



        //Queues
        Queues myQueue = new Queues();
        myQueue.EnQueue("Hello World");
        myQueue.EnQueue("Hello World1");
        myQueue.EnQueue("Hello World2");
        myQueue.EnQueue("Hello World3");
        myQueue.DeQueue();
        myQueue.DeQueue();
        myQueue.DeQueue();
        myQueue.ShowElements();

    }
}
