public class App {

    String greet = "Welcome";

    public App(){
        String greet = "Hello";

    }

    public static void main(String[] args) {
        App app1 = new App();
        System.out.println(app1.greet);
    }

}
