import java.util.ArrayList;


public class Stacks {
    private ArrayList stack;
    int top;
    public Stacks(){
        stack = new ArrayList();
    }
    public boolean StackEmpty(){
        if(top == 0){
            return true;
        }
        else {
            return false;
        }
    }
    public void Push(Object element){
        stack.add(element);
        top +=1;

    }
    public void Pop(){
         stack.remove(stack.size() -1);
        top =-1;
    }
    public int getSize(){
        return top;
    }
    public void printElements(){
        System.out.println(stack);
    }


}
