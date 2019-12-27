package Exercise8.Task4;

/**
 * @author: Alan
 * @create: 2019-12-12 14:32
 * @function:
 * @version:
 * @important value:
 */
public class Employee {
    private int salary;

    public void cleanRoom(int capacity) {
        // salary = 5*capacity;  这里错了，这里应该是叠加
        this.salary += 5*capacity;      //叠加才对。
    }
    public int getSalary() {
        return  salary;
    }


}
