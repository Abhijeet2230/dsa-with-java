package LinkedList;


public class ReverseLinkedList {

    public static void main(String[] args) {

        LL list = new LL();

        list.addAtTail(1);
        list.addAtTail(2);
        list.addAtTail(3);
        list.addAtTail(4);
        list.addAtTail(5);
        list.printList();

        LL.Node newHead = reverseList(list.getHead());
        list.setHead(newHead);
        System.out.println();
        System.out.println("Reverse");
        list.printList();


    }

    public static LL.Node reverseList(LL.Node head){

        LL.Node currNode = head;
        LL.Node prevNode = null;

        while (currNode!=null){
            LL.Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }

        return prevNode;
    }


}
