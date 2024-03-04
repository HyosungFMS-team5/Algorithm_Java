import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<Student> studentArray = new ArrayList<Student>();
    studentArray.add(new Student("A", 1));
    studentArray.add(new Student("B", 2));
    studentArray.add(new Student("C", 3));

    String inputEnd = "n";
    while(!inputEnd.equals("y")) {
      switch (inputEnd) {
        case "n":
          
          break;
      
        default:
          break;
      }
    }

  }
}
