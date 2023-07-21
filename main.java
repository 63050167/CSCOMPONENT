import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("What to draw? 1. Ellipse, 2. Rectangle ");
        int type = inp.nextInt();
        Foot foot = new Foot();
        foot.draw(type);
        inp.close();
    }
}
