public class CustomQueue {
    int[] data;
    int size;
    int rear=-1;
    int front=0;
    private static final int DEFAULT_SIZE = 10;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }


    public CustomQueue(int size){
        this.size=size;
        this.data = new int[size];
    }

    public boolean enqueue(int val){
        if(rear==size-1) {
            System.out.println("Queue is full");
            return false;
        }

        data[++rear] = val;
        return true;
    }

    public int dequeue(){
        if(front > rear){
            System.out.println("Queue is empty");
            return -1;
        }
        return data[front++];
    }

    public int peek() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return data[front];
    }







}
