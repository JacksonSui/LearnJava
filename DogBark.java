/**
 * Created by jiash on 2017-04-20.
 */

class Dog{
    String name;
    String says;
}

public class DogBark {
    static void bark(Dog d){
        System.out.println(d.name + " barks:" + d.says);
    }
    public static void main(String[] args){
        Dog dog_1 = new Dog();
        Dog dog_2 = new Dog();
        dog_1.name="spot";
        dog_2.name="scruffy";
        dog_1.says="\"Ruff!\"";
        dog_2.says="\"Wurf!\"";
        bark(dog_1);
        bark(dog_2);
    }
}
