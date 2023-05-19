import java.util.*;

public class Calendar {
    public static void main(String[] args) {
    	int year, month;
        Scanner sc = new Scanner(System.in);
        System.out.print("연도를 입력하세요: ");
        year = sc.nextInt();
        System.out.print("월을 입력하세요: ");
        month = sc.nextInt();
        

        Calendarframe printer = new Calendarframe();
        printer.Calendar(year, month);
    }
}
