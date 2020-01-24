package Exercise11.Task1;

/**
 * @author: Alan
 * @create: 2020-01-22 20:47
 * @function:
 * @version:
 * @important value:
 */
public class LoggerManager {
    private static ConsoleLoggerFactory loggerFactory;

    private LoggerManager(){}

    public static Logger getLogger(String name) {
      /*  return new Logger() {
            @Override
            public void error(String message) {
                System.err.println(message+" "+name);
            }

            @Override
            public void debug(String message) {
                System.out.println(message+" "+name);
            }
        };*/
      loggerFactory = new ConsoleLoggerFactory();
      return loggerFactory.getLogger(name);
    }

    private LoggerManager getManager() {
        return new LoggerManager();
    }

}
