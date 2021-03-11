class Base {
    public void test(){
        System.out.println("Base ");;
    }
}

class DerivedA extends Base{
    public void test(){
        System.out.print("DerivedA ");;
    }

}

public class DerivedB extends  DerivedA{
    public void test(){
        System.out.print("DerviedB ");;
    }

    public static void main(String[] args) {
        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();
        Base b4 = b3;
        b1 = (Base) b2;
        b1.test();
        b4.test();

        boolean bool1 = new Boolean(Boolean.valueOf("1"));
        boolean bool2 = new Boolean(Boolean.valueOf(null));

        System.out.println(bool1);
        System.out.println(bool2);


    }
}


