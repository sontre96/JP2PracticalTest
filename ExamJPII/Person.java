package ExamJPII;

import java.util.Scanner;

public class Person {
    String name;
    String email;
    String phoneNumber;

    public Person() {
    }

    public Person(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name Person: ");
        name = scanner.nextLine();
        System.out.println("Enter phone Number: ");
        phoneNumber = scanner.nextLine();
        System.out.println("Enter email: ");
        email = scanner.nextLine();
    }

    public void display(){
        System.out.println(toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", PhoneNumber: " + phoneNumber + ", email: " + email;
    }
}
