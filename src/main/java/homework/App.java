package homework;

public class App {
    public static void main (String [] args) {
        Dog dog = new Dog ();
        Cat cat = new Cat();
        Animal animal = new Dog ();

        Interrogator.convinceToTalk(dog);
        Interrogator.convinceToTalk(cat);
        Interrogator.convinceToTalk(animal);
    }
}
