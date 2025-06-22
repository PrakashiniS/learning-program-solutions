class Logger{
    private static Logger instance;
    private Logger() {
        System.out.println("Logger instance created.");
    }
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}
public class SingletonPatternExample {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        if (logger1 != null) {
            System.out.println("Logger instance created successfully.");
        } else {
            System.out.println("Failed to create Logger instance.");
        }
        Logger logger2 = Logger.getInstance();
        if (logger2 != null) {
            System.out.println("Logger instance created successfully.");
        } else {
            System.out.println("Failed to create Logger instance.");
        }
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("logger1 and logger2 are different instances.");
        }
    }
}