import java.util.ArrayList;

/**
 * Created by XLuis on 4/1/2017.
 */
public class Queues {
    ArrayList Queue;
    public Queues(){
        Queue = new ArrayList();
    }
    public void EnQueue(Object element){
        Queue.add(element);
    }
    public void DeQueue(){
        Queue.remove(0);
    }
    public void ShowElements(){
        System.out.println(Queue);
    }


}
