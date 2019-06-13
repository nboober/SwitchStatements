import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Don't know the name of the month? How many days does it have? Maybe I can help: ");

        int days;
        String month;

        days = scanner.nextInt();

        switch(days){
            case 30: month = "September, April, June, November";
            break;
            case 31: month = "January, March, May, July, August, October, December";
            break;
            case 28: month = "February";
            break;
            default: month = "No Month has that exact amount of days";
            break;
        }
        System.out.println(month);

    }
}
