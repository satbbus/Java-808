import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Person {

    String name;
    int age;

    public Person(String s, int a){
        name = s;
        age = a;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public static void checkAge(List<Person> list, Predicate<Person> predicate){
        for(Person p: list){
            if(predicate.test(p)){
                System.out.println(p.name + " ");
            }
        }
    }

    public static void main(String[] args) {

        List<Person> iList = Arrays.asList(new Person("Hank",45),new Person("Charile", 40), new Person("Smith",38));

        checkAge(iList,p->p.getAge()>40);

    }
}
