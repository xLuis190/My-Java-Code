import java.util.ArrayList;

/**
 * Created by XLuis on 4/1/2017.
 */
public class Queues {
    ArrayList Queue;
    private int head;
    private int tail;
    public Queues(ArrayList list){
        Queue = list;
        head = 0;
        tail = Queue.size() -1;
    }
    public void EnQueue(String element){
        Queue.add(tail,element);
    }
    public void DeQueue(){
        Queue.remove(0);
    }
    public void ShowElements(){
        System.out.println(Queue);
    }


}
