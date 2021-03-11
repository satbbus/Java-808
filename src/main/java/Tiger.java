import java.util.ArrayList;
import java.util.List;

public class Tiger extends Cat{
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        //animalList.add(new Tiger());
        //animalList.add(new Cat());
        animalList.add(new Cat());

        int x = 1;
        switch(x){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
        }


    }
}

abstract class Animal{

}

interface Hunter{

}


class Cat extends Animal implements Hunter{

}
