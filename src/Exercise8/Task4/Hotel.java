package Exercise8.Task4;

import java.util.ArrayList;

/**
 * @author: Alan
 * @create: 2019-12-12 14:53
 * @function:
 * @version:
 * @important value:
 */
public class Hotel {
    private ArrayList<Employee> employees = new ArrayList<>();   //这里要记得初始化 new 啊!
    private ArrayList<Room> room = new ArrayList<>();       //这里的名字要根据图中的来，图中的 -rooms ,所以这里应该就是 rooms


    public int getTotalCapacity() {
        int result = 0;
        for (int m = 0; m < room.size(); m++) {
            result += room.get(m).getCapacity();
        }
        return result;
    }

    public void addEmployee(Employee employee) {
        for (int n = 0; n < employees.size(); n++) {   //这里好像有问题！
            employees.add(employee);
        }
    }

    public void addRoom(int capacity) {
        for (int m = 0; m < room.size(); m++) {     //这里好像问题！
            room.add(new Room(capacity));
        }
    }

    public void cleanRooms() {
        for (int n = 0; n < employees.size(); n++) {
//            employees.get(n).cleanRoom(1);  //这里错了，每个打扫10个房间
            for (int j = 10 * n; j < (n * 10) + 10; j++) {  // j是每个的员工要打扫的房间号
                employees.get(n).cleanRoom(room.get(j).getCapacity());
            }
        }
    }

    public void printSalaryList() {
        for (int n = 0; n < employees.size(); n++) {
            System.out.println(employees.get(n).getSalary());
        }
    }
}
