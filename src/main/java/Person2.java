public class Person2 {
    String name;
    int age = 25;

    Person2(String name){
        setName(name);
    }

    public Person2(String name, int age){
      // Person2(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String show(){
        return name+" "+age;
    }

    public static void main(String[] args) {
        Person2 p1 = new Person2("Jesse");
        Person2 p2 = new Person2("Walter",52);

        System.out.println(p1.show());
        System.out.println(p2.show());
    }
}
