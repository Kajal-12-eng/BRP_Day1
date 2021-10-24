import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        int month,day;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month:");
        month=scanner.nextInt();
        System.out.println("Enter day:");
        day=scanner.nextInt();
        scanner.close();
        springSeason(month,day);

    }

    private static void springSeason(int month, int day) {
        if((month==3 && day >= 20 && day <= 31) || (month ==4 && day >= 1 && day <= 30 ) || (month ==5 && day >= 1 && day <=31 )
           || (month == 6 && day >= 1 && day <= 20 ))
            System.out.println("True");
        else
            System.out.println("False");

    }

}
