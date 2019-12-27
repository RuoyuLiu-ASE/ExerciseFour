package Exercise6.TaskFour;

/**
 * @author: Alan
 * @create: 2019-11-26 20:54
 * @function:
 * @version:
 * @important value:
 */
public abstract class Construction {
    protected int yearOfConstruction;
    protected double length;
    protected double width;
    protected double height;

    public abstract int getYearOfConstruction();   //这不是抽象方法！！！两点：
    //一：应该要明显指出来这是abstract; 二，在下面的building里应该要实现这个方法，如果是abstract;
}
