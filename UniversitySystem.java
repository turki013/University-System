
import java.util.Scanner;

class Person {

    String name;
    int age;
    String address;
    String nationality;

    public Person() {
        //Constructor 
        this.name = "no name yet..";
        this.age = 0;
        this.address = "you dont add the address yet..";
        this.nationality = "not available..";

    }

    public Person(String n, int a, String ad, String nat) {

        name = n;
        age = a;
        address = ad;
        nationality = nat;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAddress(String ad) {
        address = ad;
    }

    public void setNationality(String nat) {
        nationality = nat;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    public String getAddress() {
        return address;
    }
}

//student class that inherit fron Person class  
class Student extends Person {

    int Study_level;
    String Specilization;
    Double GPA;

    public Student() {

        this.Study_level = 0;
        this.Specilization = "Common first year";
        this.GPA = 1.00;

    }

    public Student(String n, int a, String ad, String nat, int level, String special, double gpa) {
        super(n, a, ad, nat);
        Study_level = level;
        Specilization = special;
        GPA = gpa;
    }

    public void setStudy_level(int level) {
        this.Study_level = level;

    }

    public void setSpecilization(String special) {
        this.Specilization = special;
    }

    public void setGPA(Double GPA) {
        this.GPA = GPA;
    }

    public int getStudy_Level() {
        return Study_level;
    }

    public String getSpecilization() {
        return Specilization;
    }

    public Double getGPA() {
        return GPA;
    }

    public String getSpecialization() {
        return Specilization;
    }

}

public class UniversitySystem {

    //Main class 
    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // object
        Student s1 = new Student();
        // Welcome message

        System.out.println("\nWelcome to University System ! ");
        int chose; // Variable to store user choice
        do {
            //User Interface 

            //Display menu options
            System.out.println("1.Add new Student.");
            System.out.println("2.Edit student info");
            System.out.println("3. Delete student info");
            System.out.println("4.Display info");
            System.out.println("5.Exit");

            //chose a order 
            chose = input.nextInt();
            input.nextLine();

            switch (chose) {
                case 1:
                    // First order create a new student to the System 

                    String name;
                    Double age;
                    String address;
                    String nationality;
                    int Study_level;
                    String Specilization;
                    Double GPA;

                    System.out.println("Enter the name : ");
                    name = input.nextLine();

                    System.out.println("Enter the age : ");
                    age = input.nextDouble();

                    input.nextLine();
                    System.out.println("Enter the address : ");
                    address = input.nextLine();

                    System.out.println("Enter the nationality : ");
                    nationality = input.nextLine();

                    System.out.println("Enter the Study level  : ");
                    Study_level = input.nextInt();

                    input.nextLine();
                    System.out.println("Enter the Specilization :  ");
                    Specilization = input.nextLine();

                    System.out.println("Enter the GPA : ");
                    GPA = input.nextDouble();
                    input.nextLine();

                    s1.setName(name);
                    s1.setNationality(nationality);
                    s1.setSpecilization(Specilization);
                    s1.setAddress(address);
                    s1.setStudy_level(Study_level);
                    s1.setGPA(GPA);
                    break;
                case 2:
                    // third order for edit the info

                    System.out.println("Choose the field to edit: ");
                    System.out.println("1. Name\n2. Age\n3. Address\n4. Nationality\n5. Study Level\n6. Specialization\n7. GPA");
                    int editChoice = input.nextInt();
                    input.nextLine();
                    switch (editChoice) {
                        case 1:
                            //Edit name

                            System.out.println("Enter the name : ");
                            s1.setName(input.nextLine());
                            System.out.println("Updated name: " + s1.getName());
                            break;
                        case 2:
                            //Edit age

                            System.out.println("Enter the age : ");
                            s1.setAge(input.nextInt());

                            input.nextLine();
                            System.out.println("Value updated successfully!");
                            System.out.println("Updated name: " + s1.getAge());
                            break;

                        case 3:
                            //Edit address

                            System.out.println("Enter the address : ");
                            s1.setAddress(input.nextLine());
                            System.out.println("Value updated successfully!");
                            System.out.println("Updated name: " + s1.getAddress());
                            break;

                        case 4:
                            //Edit nationality 

                            System.out.println("Enter the nationality : ");
                            s1.setNationality(input.nextLine());
                            System.out.println("Value updated successfully!");
                            System.out.println("Updated name: " + s1.getNationality());
                            break;

                        case 5:
                            //Edit level

                            System.out.println("Enter the Study level  : ");
                            s1.setStudy_level(input.nextInt());
                            System.out.println("Value updated successfully!");
                            System.out.println("Updated name: " + s1.getStudy_Level());
                            break;

                        case 6:
                            //Edit sepeciliz

                            System.out.println("Enter the Specilization :  ");
                            s1.setSpecilization(input.nextLine());
                            System.out.println("Value updated successfully!");
                            System.out.println("Updated name: " + s1.getSpecilization());
                            break;

                        case 7:
                            //Edit GPA

                            System.out.println("Enter the GPA : ");
                            s1.setGPA(input.nextDouble());
                            System.out.println("Value updated successfully!");
                            System.out.println("Updated name: " + s1.getGPA());
                            break;

                        default:
                            //Error order

                            System.out.println("Invalid choice! Try again.");

                    }

                    System.out.println("field updated successfully!");
                    break;

                case 3:
                    //Delete student

                    s1 = new Student();
                    break;

                case 4:
                    //Second order display student info 

                    System.out.println("\n--- Student Details ---");
                    System.out.println("Name: " + s1.getName());
                    System.out.println("Age: " + s1.getAge());
                    System.out.println("Address: " + s1.getAddress());
                    System.out.println("Nationality: " + s1.getNationality());
                    break;
                case 5:
                    System.out.println("Exiting..");
                    break;

                default:

                    // Erorr order 
                    System.out.println("Invalid choice! Try again.");
            }

        } while (chose != 5);

    }

}
