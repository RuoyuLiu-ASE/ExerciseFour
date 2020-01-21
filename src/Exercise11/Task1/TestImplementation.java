package Exercise11.Task1;

/**
 * @author: Alan
 * @create: 2020-01-21 20:44
 * @function:
 * @version:
 * @important value:
 */
public class TestImplementation {   //This is a test
    public static void main(String[] args) {
/* This is the test for task 2
        SimpleLoggerFactory console = new SimpleLoggerFactory();
        Logger logger = console.getLogger("CONSOLE");

        logger.debug("This is the test! Debug Message!");
        logger.error("This is the test! Error Message!");
*/

//This is the test for task 3
        ConsoleLoggerFactory consoleLoggerFactory = new ConsoleLoggerFactory();
        Logger MAINLOGGER = consoleLoggerFactory.getLogger("MAINLOGGER");
        Logger FACTORYLOGGER = consoleLoggerFactory.getLogger("FACTORYLOGGER");

        MAINLOGGER.debug("Debug Message!");
        MAINLOGGER.error("Error Message!");

        FACTORYLOGGER.debug("Debug Message!");
        FACTORYLOGGER.error("Error Message!");
    }
}
