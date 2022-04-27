package ExamJPII;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerRelationshipManagement {
    static List<Person> personList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int ch;
        do {
            Menu();
            ch = Integer.parseInt(scanner.nextLine());
            switch (ch){
                case 1:
                    addCustomer();
                    break;
                case 2:
                    findByName();
                    break;
                case 3:
                    displayAll();
                    break;
                case 4:
                    System.out.println("Exit!!!!!");
                    break;
                default:
                    System.out.println("Fail!!! Please enter again!");
                    break;
            }
        }while (ch!=4);
    }

    static void  Menu(){
        System.out.println("1. Add new Customer");
        System.out.println("2. Find by name");
        System.out.println("3. Display all");
        System.out.println("4. Exit");
        System.out.println("Choose ");
    }

    static void addCustomer(){
        int n;
        System.out.println("Enter n Customer");
        n = Integer.parseInt(scanner.nextLine());

        for (int i=0; i< n; i++){
            Person person = new Person();
            person.inputInfo();
            personList.add(person);
        }
    }

    static void findByName(){
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        int count =0;
        for ( Person person: personList){
            if (person.getName().equalsIgnoreCase(name)){
                person.display();
                count++;
            }
        }
        if (count ==0){
            System.out.println("Not found");
        }
    }

    static void displayAll(){
        for (Person person: personList ) {
            person.display();
        }
    }
}
