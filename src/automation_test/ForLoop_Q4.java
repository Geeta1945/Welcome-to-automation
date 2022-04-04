package automation_test;
/*
Question:4 - Marks:4
        4.1 Create the class with the name "ForLoop_Q4"
        4.2 Create a method with the name "print my name" with no return type and two parameters with the typed string and name "name" and int type name 'how many times.
        4.3 Write the for loop into the "print my name '' method which prints your name depending upon how many time values are.
        4.4	Create the main method
        4.5 Create the Object and call the 'print my name' method into the main method.
   */


import java.util.Scanner;

public class ForLoop_Q4 {

     static int no;  static String name;

     // no return type two parameters - instance method

    public void printMyName(int howManyTimes,String name ){

        for(int i =1;i<=howManyTimes;i++){

            System.out.println(name);

        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // allowing user to enter how many times want to print name and name entered by user will be printed that many times

        System.out.println("Please enter your name : ");
        name = scanner.next();

        System.out.println("Please enter no - how many times you want to print your name : ");
        no =scanner.nextInt();

        ForLoop_Q4 obj = new ForLoop_Q4(); // object created to call method print my name
        obj.printMyName(no,name);// calling instance method and passing both parameters received from user
    }


}
