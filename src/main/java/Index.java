import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Index {

    public static final void print(){

    }

    public static void main(String[] args) {
        String str = "Sweet Sweat";
        String str2 = str.trim().charAt(6)+""+str.indexOf("Sw",0);
        System.out.println(str2);

        StringBuilder sb1 = new StringBuilder("Duke");
        String str1 = sb1.toString();
        String str3 = "Duke";
        System.out.println(str1 == str3);

        LocalDateTime dt = LocalDateTime.of(2014,7,31,1,1);
        dt.plusMonths(1);
        dt.plusDays(30);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));

        LocalDate dt1 = LocalDate.of(2014,8,31);
        dt.plusMonths(1);
        dt.plusDays(30);
        System.out.println(dt1.format(DateTimeFormatter.ISO_DATE));

        System.out.println(str3.toString());

    }

}
