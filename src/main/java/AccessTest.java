import java.util.ArrayList;
import java.util.List;

public class AccessTest {

    public static void main(String[] args) {

    List<String> list = new ArrayList<>();
    list.add("Tech");
    list.add("Expert");
    list.set(0,"Java");
        System.out.println(list);
    list.forEach(s->s.concat("Forum"));
    System.out.println(list);
    list.replaceAll(s->s.concat("Group"));
        System.out.println(list);



    int iVar = 10;
    float fVar = 100/.100f;
    double dVar = 20;

    fVar = iVar;
    iVar = (int) fVar;
    fVar = (float)dVar;
    dVar = fVar;
    iVar = (int)dVar;
    dVar= iVar;

    doSum(10,20);
    doSum(10.0,20.0);

    Boolean value = true;


    int x = 100;
    int a = x++;
    int b = ++x;
    int c = x++;
    int d = a<b ? a<c ? a : b<c ?b : c: x;

        System.out.println(d);

    long l = 0;
    int counter = 0;



    }

    public static void doSum(Integer x, Integer y){
        System.out.println("Integer Sum: " + (x+y));
    }

    public static void doSum(double x, double y){
        System.out.println("Double Sum: " + (x+y));
    }

    public static void doSum(float x, float y){
        System.out.println("Float Sum: " + (x+y));
    }



}
