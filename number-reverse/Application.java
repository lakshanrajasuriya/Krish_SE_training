import java.util.Scanner;
public class Application {
    public static void main(String [] args){
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int userValue = scanner.nextInt();
        System.out.print("\nReverse format: ");

        while(userValue!=0) {
        System.out.print(userValue%10);
        userValue/=10;
      }
    }
}