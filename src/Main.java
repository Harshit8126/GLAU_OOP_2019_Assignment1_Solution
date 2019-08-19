import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the time=");
        float t = scan.nextFloat();
        scan.close();
        float g = 9.8F;
        float speed = g * t;
        float distance = (1F / 2F) * (g * t * t);
        System.out.println("the speed of object at" + t + "second after its release is" + speed + "and the distance travelled by the object in the" + t + "seconds after the release is" + distance);
    }

}
