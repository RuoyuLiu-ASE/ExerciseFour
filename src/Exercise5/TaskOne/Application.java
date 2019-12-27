package Exercise5.TaskOne;

/**
 * @author: Alan
 * @create: 2019-11-18 22:02
 * @function:
 * @version:
 * @important value:
 */
public class Application {
    public static void main(String[] args) {
        Bicycle bicycleOne = new Bicycle(100,2,60);
        Bicycle bicycleTwo = new Bicycle(110,3,66);
        Bicycle bicycleThree = new Bicycle(120,4,68);

        System.out.println("This is the first bicycle's id: " + bicycleOne.getId());
        System.out.println("This is the second bicycle's id: " + bicycleTwo.getId());
        System.out.println("This is the third bicycle's id: " + bicycleThree.getId());
    }
}
