package Exercise5.TaskOne;

/**
 * @author: Alan
 * @create: 2019-11-18 21:50
 * @function:
 * @version:
 * @important value:
 */
public class Bicycle {
    private int cadence,gear,speed,id;

    private static int numberOfBicycles = 0;

    Bicycle(int cadence, int gear, int speed) {
        numberOfBicycles++;
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
        id = numberOfBicycles;
    }

    public int getCadence() {
        return cadence;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public int getId() {
        return id;
    }
}
