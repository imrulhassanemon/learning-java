import java.util.Scanner;

public class scanner {
    public static void main(String[] args){

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        System.out.print("Enter your gpa: ");
//        double gpa = scanner.nextDouble();
//
//        System.out.print("Are you student? (true/false)");
//        boolean isStudent = scanner.nextBoolean();
//
//
//        System.out.println("hello mr. " + name);
//        System.out.println("You are " + age + " years old");
//        System.out.println("Your gpa is " + gpa);
//        System.out.println("Your are the ");
//
//        if(isStudent){
//            System.out.println("You are student.");
//        }else{
//            System.out.println("You are not a student");
//        }

//        make a rectangle calculator get input from the user.
        Scanner scanner = new Scanner(System.in);

        double height = 0;
        double width = 0;
        double length = 0;

        System.out.print("Enter width: ");
        length = scanner.nextDouble();

        System.out.print("Enter width: ");
        width = scanner.nextDouble();

        double areas = length * width;
        System.out.println("The area is " + areas + " cm¯²");




        scanner.close();
    }
}
