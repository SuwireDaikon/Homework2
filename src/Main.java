import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        byte[] cargo = new byte[3];
        cargo[0] = 1;
        cargo[1] = 2;
        cargo[2] = 3;
        //
        float[] cloud = {1.57f, 7.654f, 9.986f};
        //
        short[] chips = {32000, 12134, 31521, 23421, 12345};

        for (int i = 0; i < cargo.length; i++) {
            if (i == cargo.length - 1) {
                System.out.println(cargo[i]); // println to new console string
                break;
            }
            System.out.print(cargo[i] + ", ");
        }
        for (int i = 0; i < cloud.length; i++) {
            if (i == cloud.length - 1) {
                System.out.println(cloud[i]);
                break;
            }
            System.out.print(cloud[i] + ", ");
        }
        for (int i = 0; i < chips.length; i++) {
            if (i == chips.length - 1) {
                System.out.println(chips[i]);
                break;
            }
            System.out.print(chips[i] + ", ");
        }
        // reverse:
        for (int i = cargo.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(cargo[i]);
                break;
            }
            System.out.print(cargo[i] + ", ");
        }
        for (int i = cloud.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(cloud[i]);
                break;
            }
            System.out.print(cloud[i] + ", ");
        }
        for (int i = chips.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(chips[i]);
                break;
            }
            System.out.print(chips[i] + ", ");
        }

        for (int i = 0; i < cargo.length; i++) {
            if (cargo[i] % 2 == 1) {
                cargo[i] += 1;
            }
        }
        System.out.println("result of transformation! : " + Arrays.toString(cargo));
    }
}