import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name:");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name:");
        String lastName = scanner.nextLine();
        Email email = new Email(firstName, lastName);
        System.out.println(email.showInfo());
    }

}
