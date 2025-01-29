
public class Main {
    public static void main(String[] args) {
       
        Person person = new Person();
        person.setName("John");
        person.setAge(30);
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());

        
        Dog dog = new Dog();
        dog.sound();
        dog.sleep();

        
        Car car = new Car();
        car.startEngine();

        
        car.startCar();

        
        MathOperations mathOps = new MathOperations();
        System.out.println("Addition of integers: " + mathOps.add(5, 3));
        System.out.println("Addition of doubles: " + mathOps.add(5.5, 3.3));

        ParentClass parent = new ParentClass();
        parent.display();

        ChildClass child = new ChildClass();
        child.display();

    
        ExceptionExample.main(args);
    }
}
