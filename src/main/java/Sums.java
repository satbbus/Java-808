import sun.security.rsa.RSAUtil;

public class Sums {

    public static void doSum(Integer x){
        System.out.println("Integer");
    }
    public static void doSum(float f){
        System.out.println("floet");
    }
    public static void doSum(double d){
        System.out.println("double");
    }
    public static void doSum(int i){
        System.out.println("int");
    }

    public static void main(String[] args) {
        doSum(10);
        doSum(10.0f);
    }

}
