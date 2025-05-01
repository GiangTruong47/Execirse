package B9.ObjectPool;

public class TaxiNotFoundException extends  RuntimeException {
    public TaxiNotFoundException(String message) {
        System.out.println(message);
    }
}
