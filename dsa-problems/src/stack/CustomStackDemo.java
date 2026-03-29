package stack;

public class CustomStackDemo {

    public static void main(String[] args) {

        CustomStack stack = new CustomStack(10);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.increament(5,100);
        stack.increament(2,100);
        stack.printStack(stack);
    }
}
