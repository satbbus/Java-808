import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Defaults {
    Character c;
    boolean b;
    float f;
    int i;
    double d;
    char c1;

    public void printAll(){
        System.out.println(c);
        System.out.println(b);
        System.out.println(f);

    }

    public static void main(String[] args) {
        Defaults defaults = new Defaults();
        defaults.printAll();

        String[] arr = {"Hi","how","are","you"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        arrList.removeIf(s-> {
            System.out.print(s);
            return s.length()<=2;
        });
        System.out.println(" removed");

        ArrayList<Integer> points = new ArrayList<>();
        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);
        //points.add(5);
        points.add(null);
        points.remove(1);
        points.remove(null);
        System.out.println(points);





    }
}
