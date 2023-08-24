public class StorageIsFullEception extends RuntimeException{
    public StorageIsFullEception() {
    }

    public StorageIsFullEception(String message) {
        super(message);
    }

    public StorageIsFullEception(String message, Throwable cause) {
        super(message, cause);
    }

    public StorageIsFullEception(Throwable cause) {
        super(cause);
    }

    public StorageIsFullEception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
