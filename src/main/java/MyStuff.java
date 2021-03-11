public class MyStuff {

    int x;
    int y;

    public void doStuff(int x, int y){
        x= x;
        y = this.y;
    }

    public void display(){
        System.out.println(x+" "+y+" ");
    }

    public static void main(String[] args) {
        MyStuff m1 = new MyStuff();
        m1.x = 100;
        m1.y = 200;

        MyStuff m2 = new MyStuff();
        m2.doStuff(m1.x,m1.y);
        m1.display();
        m2.display();

        System.out.println("5 + 2 = " + 3 + 4);
        System.out.println("5 + 2 = " + (3 + 4));


    }
}
