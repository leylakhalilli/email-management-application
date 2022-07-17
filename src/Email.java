import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String email;
    private int mailCapacity=500;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();
        System.out.println("Department:" + this.department);

        this.password = randomPassword(6);
        System.out.println("Your password is:" + this.password);

        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + "gmail.com";
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

    public void setMailCapacity(int capacity) {
        this.mailCapacity = capacity;
    }


    public int getMailCapacity() {
        return mailCapacity;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "Display name: " + firstName + " " + lastName +
                "\nCompany Email: " + email +
                "\nMailBox capacity " + mailCapacity + "mb";

    }
}

