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
        System.out.println("Your is password:" + this.password);
    }

    private String setDepartment() {
        System.out.print("Select department\n1:for Development\n2:for Accounting\n3:for Sales\nEnter department:");
        Scanner scanner = new Scanner(System.in);
        int department = scanner.nextInt();
        if (department == 1) {
            return "Development";
        } else if (department == 2) {
            return "Accounting";
        } else if (department == 3) {
            return "Sales";
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

