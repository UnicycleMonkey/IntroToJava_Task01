import java.io.IOException;

public class Main {
    public static void main(String args[]) {
        double rez1 = Linear.Calculate1(1,2,3);
        System.out.println(rez1);
        try {
            double rez2 = Linear.Calculate2(0, 2, 3);
            System.out.println(rez2);
        }
        catch (Exception e) {
            System.out.println("Wrong input! "+e.getMessage());
        }
        double rez4 = Linear.Calculate4(123.456);
        System.out.println(rez4);
        System.out.println("10000 sec = "+ Linear.Calculate5(10000));
    }
}
