
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

      
        int age;
        double salary;
        String name;

    
        age = 25;
        salary = 55000.50;
        name = "John Doe";

       
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);

       
        byte smallNumber = 127;  
        short shortNumber = 32000;
        int integerNumber = 100000;
        long longNumber = 1234567890L;
        float floatNumber = 3.14f;
        double doubleNumber = 123.456;
        char character = 'A';
        boolean isJavaFun = true;

    
        System.out.println("Byte: " + smallNumber);
        System.out.println("Short: " + shortNumber);
        System.out.println("Int: " + integerNumber);
        System.out.println("Long: " + longNumber);
        System.out.println("Float: " + floatNumber);
        System.out.println("Double: " + doubleNumber);
        System.out.println("Char: " + character);
        System.out.println("Boolean: " + isJavaFun);

        
        int num = 10;
        double numDouble = num;  
        System.out.println("Implicit Casting (int to double): " + numDouble);

       
        double largeNum = 9.78;
        int smallNum = (int) largeNum;  
        System.out.println("Explicit Casting (double to int): " + smallNum);

        int a = 10, b = 5;

       
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        
        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));

        
        System.out.println("Logical AND: " + (a > 5 && b < 10));
        System.out.println("Logical OR: " + (a < 5 || b > 2));

        String str = "Hello, World!";

        
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring: " + str.substring(7));
        System.out.println("Character at index 4: " + str.charAt(4));
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));

        
        int[] numbers = {10, 20, 30, 40, 50};

        
        for (int numb : numbers) {
            System.out.println(numb);
        }
    }
}
