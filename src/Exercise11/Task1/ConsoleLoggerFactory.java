package Exercise11.Task1;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: Alan
 * @create: 2020-01-21 20:54
 * @function:
 * @version:
 * @important value:
 */
public class ConsoleLoggerFactory implements LoggerFactory {
    
    private HashMap<String,Logger> cache = new HashMap<String, Logger>();

    public ConsoleLoggerFactory() {
        
    }

    @Override
    public Logger getLogger(String name) {
        if (cache.containsKey(name)) {
            return cache.get(name);
        } else {
            //cache.put(name,new Logger());
            return new Logger() {
                @Override
                public void error(String message) {
                    System.err.println(message+" "+name);
                }

                @Override
                public void debug(String message) {
                    System.out.println(message+" "+name);
                }
            };
        }
    }
}
