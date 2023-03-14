import java.util.Scanner;

public class ConvertToSeconds {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int minutes = 0;

        System.out.println("To exit converter enter a negative number");
        while(minutes >= 0){
            System.out.print("Enter a number: ");
            minutes = scan.nextInt();
            scan.nextLine();
            System.out.println(convert(minutes));
        }
        System.out.println("This is not a time machine. " + minutes + " is an invalid amount of time");
    }

    public static int convert(int minutes){
        return minutes*60;
    }
}
