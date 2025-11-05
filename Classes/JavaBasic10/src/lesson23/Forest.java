package lesson23;

public class Forest {
    public static void main(String[] args) {

        Fox fox = new Fox();
        fox.FurColor = "Red";
        fox.species = "Vulpes vulpes";
        fox.age = 4;
        fox.Eat();
        fox.Sleep();

        Bear bear = new Bear();
        bear.species = "Ursus arctos";
        bear.age = 7;
        bear.Eat();
        bear.Sleep();
        bear.Roar();

        Wolf wolf = new Wolf("Canis lupus", 5);
        wolf.Eat();
        wolf.Sleep();
        
    }
}
