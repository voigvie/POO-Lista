import java.util.ArrayList;
import java.util.Scanner;

public class Questao4 {

    static Scanner s = new Scanner(System.in);

    static Color getColor() {
        System.out.print("Color (BLACK/BLUE/RED): ");
        return Color.valueOf(s.nextLine());
    }

    public static void main(String[] args) {

        ArrayList<Shape> shape = new ArrayList<Shape>();

        Rectangle r;
        Circle c;

        System.out.println("Enter the number of shapes: ");
        int i = s.nextInt();

        for (int z = 0; z < i; z++) {
            System.out.println("Rectangle or Circle (r/c)? ");
            String res = s.next();

            if (res.equals("c")) {
                c = new Circle();
                System.out.println("radius: ");
                c.setRadius(s.nextDouble());
                c.Area();
                shape.add(c);
            }
            if (res.equals("r")) {
                r = new Rectangle();
                System.out.println("width: ");
                r.setWidth(s.nextDouble());
                System.out.println("height: ");
                r.setHeight(s.nextDouble());
                r.Area();
                shape.add(r);

            }

        }

        for (Shape shape2 : shape) {

            System.out.println(shape2);

        }

    }
}
