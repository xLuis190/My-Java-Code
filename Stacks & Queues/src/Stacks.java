import java.util.ArrayList;


public class Stacks {
    private ArrayList stack;

    public Stacks(){
        stack = new ArrayList();
    }
    public boolean StackEmpty(){
        if(stack.size() == 0)return true;
        else return false;
    }
    public void Push(Object element){
        stack.add(element);

    }
    public void Pull(){
         stack.remove(stack.size() -1);
    }
    public int getSize(){
        return stack.size();
    }
    public void printElements(){
        System.out.println(stack);
    }


}
