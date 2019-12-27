package Exercise8.Task4;

/**
 * @author: Alan
 * @create: 2019-12-13 11:02
 * @function:
 * @version:
 * @important value:
 */
public class Application {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Employee[] employee = new Employee[5];
        for (int i = 0; i < 5; i++) {
            hotel.addEmployee(employee[i]);
        }
        for (int i = 0; i < 20; i++) {
            hotel.addRoom(1);
        }
        for (int i = 0; i < 15; i++) {
            hotel.addRoom(2);
        }
        for (int i = 0; i < 10; i++) {
            hotel.addRoom(4);
        }
        for (int i = 0; i < 5; i++) {
            hotel.addRoom(6);
        }
/*        employee[0].cleanRoom(10);
        employee[1].cleanRoom(10);
        employee[2].cleanRoom(20);
        employee[3].cleanRoom(10+20);
        employee[4].cleanRoom(20+30);*/
        hotel.cleanRooms();
        hotel.printSalaryList();
        System.out.println("Total capacity: " + hotel.getTotalCapacity()+"beds.");



    }
}
