import java.util.Stack;

public class RBStack {
    public class ArrayStack<E> implements Stack<E> {
        public static int CAPACITY = 1000;
        private E[] data;
        private int t = -1;
        public ArrayStack(int capacity) {
            data = (E[]) new Object[capacity];
        }
        public ArrayStack() {
            this(CAPACITY);
        }

        //test 3

    }
}
