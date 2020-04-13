import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int studentAge = 36;
    double studentGPA = 4.0;
    boolean hasPerfectAttendance = true;
    String studentFirstName = "Aimee";
    String studentLastName = "Pederson";
    char studentFirstInitial = studentFirstName.charAt(0);
    char studentLastInitial = studentLastName.charAt(0);

    System.out.println(studentAge);
    System.out.println(studentGPA);
    System.out.println(hasPerfectAttendance);
    System.out.println(studentFirstInitial);
    System.out.println(studentLastInitial);
    System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
    System.out.println("What do you want to update it to?");

    Scanner input = new Scanner(System.in);
    studentGPA = input.nextDouble();

    System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGPA);
  }
}