public class Triangle {

    static double area;
            int b = 2, h = 3;

    public static void main(String[] args) {
        {
            double p,b,h;
            if(area == 0){
                b = 3;
                h = 4;
                p = 0.5;
                area = p*b*h;

            }
            System.out.println(area);


            String opt = "true";
            switch (opt){
                case "true":
                    System.out.println("True");
                    break;
                default:
                    System.out.println("***");
            }
            System.out.println("Done");

            //**************************************//

            int data[] = {1,2,3,4,5};
            int key = 4;
            int count = 0;
            for(int e:data){
                if(e!=key){
                    continue;
                    //count++;
                }
            }
            System.out.println(count + " Found");

            System.out.println("Result A " + 0 + 1);
            System.out.println("Result B " + (1 + 2));

            StringBuilder sb = new StringBuilder("Satish");
            sb.delete(0,sb.length());
            System.out.println("-----");
            System.out.println(sb.toString());
            System.out.println("-----");




        }
    }
}
