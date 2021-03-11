public class strBuilder {

    public static void main(String[] args) {
        System.out.println("Hello "+ new StringBuilder("Sateesh 8"));
        System.out.println("Hello "+ new MyStr("Sateesh 8").msg);
    }

}

class MyStr{
    String msg;

    public MyStr(String msg){
        this.msg = msg;
    }



}