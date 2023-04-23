package cust_exc;

@SuppressWarnings("serial")
public class BookHandlingException extends Exception {
    public BookHandlingException(String errMsg) {
        super(errMsg);
    }
}
