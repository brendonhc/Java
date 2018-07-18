package tk.brendonhuds.ds;

public class EmptyStackException extends StackException {
    EmptyStackException() {};

    EmptyStackException(String msg) {
        super(msg);
    }
}
