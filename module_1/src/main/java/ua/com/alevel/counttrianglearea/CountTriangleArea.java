package ua.com.alevel.counttrianglearea;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountTriangleArea {
    private CountTriangleArea() {}

    public static void getCountTriangleArea() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {

                int ax, ay, bx, by, cx, cy;

                try
                {
                    System.out.print("Enter point A x coordinate >> ");
                    ax = Integer.parseInt(reader.readLine());
                    System.out.print("Enter point A y coordinate >> ");
                    ay = Integer.parseInt(reader.readLine());
                    System.out.print("Enter point B x coordinate >> ");
                    bx = Integer.parseInt(reader.readLine());
                    System.out.print("Enter point B y coordinate >> ");
                    by = Integer.parseInt(reader.readLine());
                    System.out.print("Enter point C x coordinate >> ");
                    cx = Integer.parseInt(reader.readLine());
                    System.out.print("Enter point C y coordinate >> ");
                    cy = Integer.parseInt(reader.readLine());
                }
                catch (Exception e)
                {
                    System.out.println("Incorrect input");
                    continue;
                }

                double a = Math.sqrt((ax - bx) * (ax - bx) + (ay - by) * (ay - by));
                double b = Math.sqrt((bx - cx) * (bx - cx) + (by - cy) * (by - cy));
                double c = Math.sqrt((ax - cx) * (ax - cx) + (ay - cy) * (ay - cy));

                if (a + b < c || b + c < a || a + c < b) {
                    System.out.println("This triangle cannot exist!!!");
                } else {
                    double p = (a + b + c) / 2;
                    double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                    System.out.println("Answer: " + s);
                }
                System.out.print("If you want to repeat calculation print 'yes' or another char to end -> ");
                String s = reader.readLine();
                if (!s.equals("yes")) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
