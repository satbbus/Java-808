import java.io.IOException;

public class Peacock extends Bird{
    public void Dance(){
        System.out.println("Dance");
    }

    public static void main(String[] args) {
        Bird b = new Peacock();
        Peacock p = (Peacock) b;


        p.Fly();
        p.Dance();

        String cc = "1234-1234-4567-5678";
        String x = "xxxx-xxxx-xxxx-";
        StringBuilder sb = new StringBuilder(cc);
        sb.subSequence(15, 19);
        System.out.println(x + sb);

        StringBuilder sb1 = new StringBuilder(x);
        sb1.append(cc, 15, 19);
        System.out.println(sb1);

        String[][] shirts = new String[2][2];

        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";

        for(String []c :shirts)
            for(String s:c)
                System.out.println(s+", ");
    }

}

class Bird {
    public void Fly(){
        System.out.println("Fly.");
    }

}