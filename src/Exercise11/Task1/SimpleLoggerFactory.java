package Exercise11.Task1;

/**
 * @author: Alan
 * @create: 2020-01-21 20:14
 * @function:
 * @version:
 * @important value:
 */
public class SimpleLoggerFactory implements LoggerFactory { // This is the Concrete Creator which return Concrete products
    // with new operator

    @Override
    public Logger getLogger(String type) throws IllegalArgumentException {
        if (!type.equals("CONSOLE")) {
            throw new IllegalArgumentException(type);
        } else {
            return new ConsoleLogger();
        }
    }
}
