package Exercise7.Task1;

/**
 * @author: Alan
 * @create: 2019-12-04 20:53
 * @function:
 * @version:
 * @important value:
 */
public class Control {
    public static void main(String[] args) {
        ComponentMachine componentMachine = new ComponentMachine();
        componentMachine.input();   //input Component
/*        while (!componentMachine.measure()) {         //
            componentMachine.edit();
        }*/
        while (componentMachine.getRotationAngle() < 180) {
            componentMachine.rotate();
        }
        do {
            if (componentMachine.classifySurface() == 1) {  // 需要循环结构！
                componentMachine.edit();
            } else if (componentMachine.classifySurface() == 2) {
                componentMachine.sand();
            } else if (componentMachine.classifySurface() == 3) {
                componentMachine.polish();
            }
        }while (componentMachine.classifySurface() != 1);
    }
}
