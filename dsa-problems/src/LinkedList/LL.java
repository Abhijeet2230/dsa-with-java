package LinkedList;

public class LL {

    private Node head;

    public static class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }


    public int get(int index) {
        if(index < 0) return -1;

        int count = 0;
        Node temp = head;
        while (temp != null){
            if(count==index){
                return temp.val;
            }
            temp = temp.next;
            count++;
        }

        return -1;
    }

    public void addAtHead(int val) {

        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void addAtTail(int val) {
        if (head==null){
            head = new Node(val);
            return;
        }

        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next=new Node(val);
    }

    public void addAtIndex(int index, int val) {
        if(index == 0){
            addAtHead(val);
            return;
        }
        int count = 0;
        Node temp = head;
        while (temp != null){
            if(count==index-1){
                Node newNode = new Node(val);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
            count++;
        }
    }

    public void deleteAtIndex(int index) {

        if (head == null || index < 0) return;

        if (index == 0) {
            head = head.next;
            return;
        }

        int count = 0;
        Node temp = head;
        while (temp != null && temp.next != null){

            if(count==index-1){
                temp.next = temp.next.next ;
                return;
            }
            temp = temp.next;
            count++;
        }
    }

    public void printList() {

        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LL list = new LL();

        list.addAtHead(10);
        list.addAtHead(12);
        list.addAtTail(11);

        System.out.println(list.get(1));
        list.addAtIndex(2,90);
        list.deleteAtIndex(0);
        System.out.println(list.get(1));
        list.printList();

    }

}
