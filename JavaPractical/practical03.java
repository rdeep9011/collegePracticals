//WAP to demonstrate creation and casting of variables.

package JavaPractical;

public class practical03 {
    public static void main(String[] args) {
        
        //Variable creation
        int num1 = 10;                 
        double num2 = 5.75;            
        char letter = 'A';
        boolean flag = true;           
        String name = "Depinder Singh"; 

        //Displaying variables 
        System.out.println("Integer value: " + num1);
        System.out.println("Double value: " + num2);
        System.out.println("Character value: " + letter);
        System.out.println("Boolean value: " + flag);
        System.out.println("String value: " + name);

        //Type Casting Demonstration 
        double castToDouble = num1;        
        int castToInt = (int) num2;        

        System.out.println("\nAfter Type Casting:");
        System.out.println("Implicit casting (int → double): " + castToDouble);
        System.out.println("Explicit casting (double → int): " + castToInt);
    }
}
