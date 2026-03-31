package Queue;

public class QueueDemo {

    public static void main(String[] args) {

        CustomQueue queue = new CustomQueue(5);
        MyCircularQueue circularQueue = new MyCircularQueue(5);
//        queue.enQueue(10);
//        queue.enQueue(20);
//        queue.enQueue(30);
//        queue.enQueue(40);
//        queue.enQueue(50);
        circularQueue.enQueue(50);
        circularQueue.enQueue(40);
        circularQueue.enQueue(30);
        circularQueue.enQueue(20);
        circularQueue.enQueue(10);

        System.out.println(circularQueue.deQueue());
        circularQueue.enQueue(120);
        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue.deQueue());



//        System.out.println(queue.deQueue());
//        System.out.println(queue.deQueue());
//        System.out.println(queue.deQueue());
//        System.out.println(queue.deQueue());
//        System.out.println(queue.deQueue());

    }
}
