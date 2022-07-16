import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String email;
    private int mailCapacity;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created:" + this.firstName + this.lastName);
        this.department = setDepartment();
        System.out.println("Department:" + this.department);
        this.password = randomPassword(6);
        System.out.println("Your password is:" + this.password);
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "."+"gmail.com";
        System.out.println("Your email is:" + this.email);
    }

    private String setDepartment() {
        System.out.print("Select department\n1:for Teacher\n2:for Student\nEnter department:");
        Scanner scanner = new Scanner(System.in);
        int department = scanner.nextInt();
        if (department == 1) {
            return "teacher";
        } else if (department == 2) {
            return "student";
        } else {
            return "";
        }
    }

    private String randomPassword(int size) {
        String passwordSet = "ABCDEFGIJKLMNOPQRSTUWXYZ0123456789!@#$%";
        char[] password = new char[size];
        for (int i = 0; i < size; i++) {
            int randomPassword = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(randomPassword);

        }
        return new String(password);
    }


}

