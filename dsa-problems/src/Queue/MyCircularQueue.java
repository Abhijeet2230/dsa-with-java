package Queue;

class MyCircularQueue {

        int[] data;
        int size;
        int rear=-1;
        int front=-1;

    public MyCircularQueue(int k) {
        this.size = k;
        this.data = new int[size];
        
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }

        if(front==-1){
            front=0;
        }

        rear = (rear+1)%size;
        data[rear]=value;
        return true; 
    }


    public int deQueue(){
        if(front==-1){
            System.out.println("Queue is empty");
        }

        int result = data[front];

        if(front==rear){
            front=rear=-1;
        }else {
            front = (front+1)%size;
        }
        return result;
    }
    
    public int Front() {
        if(isEmpty()) return -1;
        return data[front];
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        return data[rear];
    }
    
    public boolean isEmpty() {
        return front == -1;


    }
    
    public boolean isFull() {
        return (rear+1)%size==front;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */