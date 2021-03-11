public class Cars extends Vehicles {

    int y;
    Cars(){
        super();
     //   this(20);
    }
    Cars(int y){
        this.y = y;
    }

    public String toString(){
        return super.x+" "+ this.y;
    }

    public static void main(String[] args) {
        Vehicles v = new Cars();
        System.out.println(v);
    }

}

class Vehicles{
    int x ;
    Vehicles(){
        this(10);
    }
    Vehicles(int x){
        this.x = x;
    }
}

abstract class A3{
    private static int i;
    public A3(){}
    public void doStuff(){}
}

final class A1{
    public A1(){}
}


class A4{
    protected static final int i = 10;
    private A4(){}
}
