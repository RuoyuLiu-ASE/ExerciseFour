package Exercise11.Task1;

/**
 * @author: Alan
 * @create: 2020-01-21 20:01
 * @function:
 * @version:
 * @important value:
 */
public class ConsoleLogger implements Logger {// This is the Concrete Products which implements the interface of Product
    private int nxtMessageld;

    @Override
    public void error(String message) {
        System.err.println(message);
    }

    @Override
    public void debug(String message) {
        System.out.println(message);
    }
}

