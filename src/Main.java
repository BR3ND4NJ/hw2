public class Main {
    public static void main(String[] args) {
        // Example Usage
        RBStack<Integer> rbStack = new RBStack<>(10);

        rbStack.redPush(1);
        rbStack.redPush(2);

        rbStack.bluePush(10);
        rbStack.bluePush(9);

        System.out.println(rbStack.redPop());
        System.out.println(rbStack.bluePop());
    }
}