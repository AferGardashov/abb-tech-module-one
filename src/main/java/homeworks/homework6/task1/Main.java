package homeworks.homework6.task1;


public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("The animal makes a sound");
            }
        };

        animal.makeSound();
    }
}
