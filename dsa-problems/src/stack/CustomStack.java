package stack;

public class CustomStack {

    int[] data;
    int top = -1;
    private static final int DEFAULT_SIZE = 10;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        data = new int[size];
    }

    public boolean push(int val){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        top++;
        data[top]=val;
        return true;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return data[top--];
    }

    public void increament(int k, int val){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i<=top;i++){
            if(i<k){
                data[i]+=val;
            }
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return data[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == data.length - 1;
    }

    public void printStack(CustomStack stack){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        for(int i = top; i>=0 ;i--){
            System.out.println(data[i]);
        }
    }
}
