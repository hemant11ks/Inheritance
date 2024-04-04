public class Main{

    public static void main(String[] args){

        Animal animal = new Animal("Generic Animal", "Huge", 500);
        doAnimalStuff(animal, "slow");

    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("---------------------------------------");

    }

    
    
}