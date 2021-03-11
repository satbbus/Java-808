public class Equal {

    public static void main(String[] args) {
        String s1 = "Java";
        String[] s2 = {"J","a","v","a"};
        String s3 = "";

        for(String s:s2){
            s3 = s3+s;
        }
        boolean b1 = s1.equals(s3);
        boolean b2 = s1 == s3;
        System.out.println(b1);
        System.out.println(b2);


        float fit = 100.00F;
        float fit2 = (float) 1_11.00;
        Float fit3  = 100.00f;


        int arr2[] = new int[3];
        arr2[0]= 1;
        arr2[1]= 2;
        arr2[2]= 3;

        int arr4[] = new int[]{1,2,3,};


        Short short1 = 200;
        Integer integer1 = 400;
        Long long1 = (long) short1 + integer1;
       // String str5 = (String) (long1 * integer1);

    }
}
