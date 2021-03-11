public class MyString {

    String msg;
    MyString(String msg){
        this.msg = msg;
    }

    public static void main(String[] args) {
        System.out.println(new StringBuilder("Java SE 8"));
        System.out.println(new MyString("Java SE 8"));
    }
}
