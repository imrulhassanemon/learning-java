public class variable {
    public static void main(String[] args){

//        THESE ARE PREMITIVE DATATYPE
//        integer
        int age = 32;
        int year = 2025;
      int queantity = 1;

        System.out.println("This is the year of " + year);

//        double

        double price = 19999.99;
        double gpa = 3.5;
        double temperature = -12.5;
        System.out.println(price);

//        char
        char grade = 'A';
        char symbol  = '!';
        char currency = '$';
        System.out.println(grade);

//        boolean

        boolean isStudent = true;
        boolean forSale = true;
        boolean isOnline = true;
        System.out.println(forSale);

        int num1 = 3300;
        int num2 = 35;

        if(num1 > num2){
            System.out.println("num1 is bigger");
        }else {
            System.out.println("num2 is bigger");
        }

        if(isStudent){
            System.out.println("Yes I am student.");
        }else {
            System.out.println("Sorry, Im parent");
        }

//        THESE ARE REFERANCE DATATYPE
//        1. strings
//        2. arrays
//        3. objects


        String name = "Imrul Hassan Emon";
        String food = "pizza";
        String email = "imrul@gmail.com";
        String color = "red";
        String car = "Mustang";
        System.out.println( "My favourite car is "+ car);
        System.out.println("The prince is: " + currency + price );

        if(forSale){
            System.out.println("There is a " + car + " for sale.");
        }else {
            System.out.println("The " + car + " is not for sale");
        }


    }
}