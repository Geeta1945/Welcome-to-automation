package automation_test;
/*
Question:3 - Marks:4
3.1 Create the class with the name "IfThenElse_Q3"
3.2 Create a method with the name "seen" with boolean return type and one parameter with type int and name "age".
3.3 Write the logic into the "teen" method. if age is less than or equal to 18 then return 'true'
    else return 'false'.
3.4 Create the main method
3.5 Create the Object and call the 'isTeen' method inside the sout statement.

OutPut
15  - true
25  - false
 */
public class IfThenElse_Q3 {
// method with boolean return type and one parameter -age to check that age received
// in parameter is teen or  not and return boolean type accordingly
    int age;
    public boolean isTeen(int age){

        this.age= age;
        if (age>12 && age<20){

            System.out.print(age +" - ");

            return true;
        }
        else
        {
            System.out.print(age +" - ");
             return false;
        }
    }


    public static void main(String[] args) {

        IfThenElse_Q3 obj = new IfThenElse_Q3();


        System.out.println(obj.isTeen(15)); // calling method and providing parameter then  printing the result
        System.out.println(obj.isTeen(25));
    }

}
