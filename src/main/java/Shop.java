import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.ArrayList;
import java.util.List;

class Product{
    int id;
    String name;
    Product(int id, String name){
        this.id = id;
        this.name = name;
    }
}

public class Shop {


    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(10,"Icecream"));
        list.add(new Product(11,"chocolate"));
        Product p1 = new Product(10,"Icecream");
        System.out.println(list.indexOf(p1));


        int token = 1;
        switch(token){
            case 1:
                System.out.println("1");
                //continue;
            case 2:
                System.out.println("2");
                break;
            default :
                System.out.println("default");
        }


    }


}
