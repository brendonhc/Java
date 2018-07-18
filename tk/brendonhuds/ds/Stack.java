public class Stack {

    private static final int MAX_SIZE = 5;
    private int elem[];
    private int top;

    Stack() {
        elem = new int[MAX_SIZE];
        top = -1;
    }

    public void push(int e) throws FullStackException {
        if (top < MAX_SIZE-1) {
            elem[++top] = e;
        }
        else {
            throw new FullStackException("Pilha cheia!");
        }
    }

    public void pop() throws EmptyStackException {
        if (top >= 0) {
            top--;
        }
        else {
            throw new EmptyStackException("Remocao Invalida!");
        }

    }

    public int top() throws EmptyStackException {
        if (top < 0) {
            throw new EmptyStackException("Operacao Invalida!");
        }
        return elem[top];
    }
}
