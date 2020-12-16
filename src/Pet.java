
/* Java Classes & Objects 1
pet.java 
Create a Pet Class with the following instance variables: name (PRIVATE) age (PRIVATE) location (PRIVATE) type (PRIVATE) two constructors empty all attributes 
Code to be able to access the following (Get Methods): name age type 
Code to be able to change (Set Methods): name age location 
*/
import com.pkg.Car;

public class Pet {
    private String name = "Peanut";
    private int age = 7;
    private String location = "Home";
    private String type = "Cat";

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void jump() {
        System.out.println("Jumping!");
    }

    public void run() {
        System.out.println("Running!");
    }

    public static void main(String[] args) throws Exception {
        Pet pet = new Pet();

        String name = pet.getName();
        int age = pet.getAge();
        pet.jump();
        pet.run();

        Car car = new Car();
        String color = car.getColor();

        System.out.printf("My cat's name is %s.", name);
        System.out.println();
        System.out.printf("She is %s.", age);
        System.out.println();
        System.out.printf("My car is %s.", color);

    }
}
