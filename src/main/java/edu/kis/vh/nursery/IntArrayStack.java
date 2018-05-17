package edu.kis.vh.nursery;

public class IntArrayStack {
    private static final int NUMBERS_CAPACITY = 12;
    private static final int DEFAULT_EMPTY_STACK_VALUE = -1;
    private static final int DEFAULT_FULL_STACK_VALUE = 11;
    private int[] numbers = new int[NUMBERS_CAPACITY];

    private int total = DEFAULT_EMPTY_STACK_VALUE;

    public void countIn(final int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    boolean callCheck() {
        return total == DEFAULT_EMPTY_STACK_VALUE;
    }

    boolean isFull() {
        return total == DEFAULT_FULL_STACK_VALUE;
    }

    int peekaboo() {
        if (callCheck())
            return DEFAULT_EMPTY_STACK_VALUE;
        return numbers[total];
    }

    public int countOut() {

        if (callCheck())
            return DEFAULT_EMPTY_STACK_VALUE;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}
