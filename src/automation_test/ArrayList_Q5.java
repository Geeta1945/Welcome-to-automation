package automation_test;
/*
Question:5 - Marks:4
5.1 Create the class with the name "ArrayList_Q5"
5.2	Create the main method
5.3 Declare the string type ArrayList and add the values "Scrum", "Java", "Jira", "Selenium", "Cucumber", "Postman", “Rest Assured”
5.4 Print the list using a forEach loop.

OutPut
Scrum
Java
Jira
Selenium
Cucumber
Postman
Rest Assured
 */
import java.util.ArrayList;

public class ArrayList_Q5 {

    public static void main(String[] args) {
        ArrayList <String> softwareTesting = new ArrayList();
        softwareTesting.add("Scrum");

        softwareTesting.add("Java");
        softwareTesting.add("Jira");
        softwareTesting.add("Selenium");
        softwareTesting.add("Cucumber");
        softwareTesting.add("Postman");
        softwareTesting.add("Rest Assured");

        for (String software:softwareTesting  ) {
            System.out.println(software);
        }

    }
}
