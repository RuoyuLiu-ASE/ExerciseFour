package Exercise11.Task1;

import sun.rmi.runtime.Log;

/**
 * @author: Alan
 * @create: 2020-01-21 20:08
 * @function:
 * @version:
 * @important value:
 */
public interface LoggerFactory { // This is the Creator which has a factory method
    //For Task 2
//    public Logger getLogger(String type) throws IllegalArgumentException;

    //For Task 3
    public Logger getLogger(String name);
}
