class Casting1 {
}

class Casting2 extends Casting1{

}

public class Casting3 extends Casting2{

    public static void main(String[] args) {
        Casting1 obj1 = (Casting1) new Casting2();
        Casting2  obj2 = (Casting2) new Casting3();
        Casting2 obj3 = (Casting2) new Casting1();
        Casting3 obj4 = (Casting3) obj2;
    }

}



