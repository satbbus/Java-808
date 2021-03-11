public class SwitchCaseTest {
    public static void main(String[] args) {
       char colorCode = 'y';

       switch(colorCode){
            case 'r':
                int color = 100;
                break;
            case 'p':
                color = 20;
                break;
            case 'y':
                color = 1;
                break;
        }
       // System.out.println(color);

       int nums1[] = {1,2,3};
       int nums2[] = {1,2,3,4,5};
       nums2 = nums1;
       for(int x:nums2)
           System.out.print(x+":");


    }
}
