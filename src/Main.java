public class Main {
    public static void main(String[] args) {
        // Example Usage
        RBStack<Integer> rbStack = new RBStack<>(10);

        System.out.println("I'm going to push 1 into the red stack");
        rbStack.redPush(1);
        System.out.println("I'm going to push 2 into the red stack");
        rbStack.redPush(2);

        System.out.println("I'm going to push 10 into the blue stack");
        rbStack.bluePush(10);
        System.out.println("I'm going to push 9 into the blue stack");
        rbStack.bluePush(9);
        System.out.println();

        System.out.println("The top of the red stack is: " + rbStack.redPop());
        System.out.println("The top of the blue stack is: " + rbStack.bluePop());
    }
}