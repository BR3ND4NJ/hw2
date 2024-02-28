public class RBStack<E> {
    private int capacity;
    private E[] array;
    private int redTop;
    private int blueTop;

    public RBStack(int capacity) {
        this.capacity = capacity;
        this.array = (E[]) new Object[capacity];
        this.redTop = -1;
        this.blueTop = capacity;
    }

    public boolean isRedEmpty() {
        return redTop == -1;
    }

    public boolean isBlueEmpty() {
        return blueTop == capacity;
    }

    public boolean isFull() {
        return redTop + 1 == blueTop;
    }

    public void redPush(E value) {
        if (!isFull()) {
            redTop++;
            array[redTop] = value;
        } else {
            System.out.println("Red stack is full. Cannot push.");
        }
    }

    public void bluePush(E value) {
        if (!isFull()) {
            blueTop--;
            array[blueTop] = value;
        } else {
            System.out.println("Blue stack is full. Cannot push.");
        }
    }

    public E redPop() {
        if (!isRedEmpty()) {
            E value = array[redTop];
            redTop--;
            return value;
        } else {
            System.out.println("Red stack is empty. Cannot pop.");
            return null;
        }
    }

    public E bluePop() {
        if (!isBlueEmpty()) {
            E value = array[blueTop];
            blueTop++;
            return value;
        } else {
            System.out.println("Blue stack is empty. Cannot pop.");
            return null;
        }
    }

    public E redPeek() {
        if (!isRedEmpty()) {
            return array[redTop];
        } else {
            System.out.println("Red stack is empty. Cannot peek.");
            return null;
        }
    }

    public E bluePeek() {
        if (!isBlueEmpty()) {
            return array[blueTop];
        } else {
            System.out.println("Blue stack is empty. Cannot peek.");
            return null;
        }
    }
}
