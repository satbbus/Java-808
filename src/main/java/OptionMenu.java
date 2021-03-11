import java.util.Scanner;

public class OptionMenu {
    public static void menu(){
        System.out.println("1. Left 2. Right 0. Stop");
    }

    public static void main(String[] args) {
        int option;
        Scanner scanner = new Scanner(System.in);
        do{
            menu();
            option = scanner.nextInt();
            System.out.println(option);
        }while(option!=0);


    }

}
