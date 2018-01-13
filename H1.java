import com.sun.javafx.logging.PulseLogger;

public class H1 implements ILinkedList<int>{
    private H1 nextList;
    private int valueOfElement;

    public H1 next(){
        return nextList;
    }
    public H1 last(){
        H1 temp = this;
        while(temp.nextList != null){
            temp = temp.nextList;
        }
        return temp;
    }
    public H1 after(int n){
        H1 temp = this;
        for(int i = 0; i < n; i++){    
            temp = temp.nextList;

        }
        return temp;

    }
    public H1 detach(){
        H1 temp = nextList;
        if(nextList != null){
            nextList = nextList.nextList;
        }
        return temp;
    }
    public int get(){
        return valueOfElement;
    }
    public void set(int value){
        valueOfElement = value;
    } 
    public void setNext(H1 next){
        H1 temp = nextList;
        nextList = next;
        nextList.nextList = temp;
    }
    public void append(H1 next){
        nextList = next;
    }
    public void insert(H1 newFirst){
        nextList.nextList = nextList;
        nextList.valueOfElement = valueOfElement;
        valueOfElement = newFirst.valueOfElement;        
    }
}