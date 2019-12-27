package Exercise6.TaskFour;

/**
 * @author: Alan
 * @create: 2019-11-26 20:56
 * @function:
 * @version:
 * @important value:
 */
public class Building extends Construction {
    protected int numberOfRooms;
    protected int numberOfFloors;

    @Override
    public int getYearOfConstruction() {
        return 0;
    }
    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public double getFloorArea() {
        return numberOfFloors*length*width;
    }
}
