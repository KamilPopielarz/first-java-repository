import inheritance.children.Bird;
import inheritance.children.Cat;
import inheritance.children.Dog;
import inheritance.children.Fish;
import inheritance.parent.Animal;
import service.BurgerPriceCalculator;
import service.PizzaPriceCalculator;

public class Main {
    public static void main(String[] args) {
//        PizzaPriceCalculator pizzaPriceCalculator = new PizzaPriceCalculator(0.04, 3.51, 0.05);
//        System.out.println("Pizza costs: " + pizzaPriceCalculator.calculatePrice(30) + " zł");
//        System.out.println("Delivery costs: " + pizzaPriceCalculator.calculateDeliveryPrice(10) + "zł");
//        System.out.println("OverallPrice: " + pizzaPriceCalculator.calculateTotalPrice(30, 10) + "zł");

//        BurgerPriceCalculator burgerPriceCalculator = new BurgerPriceCalculator(3, 3, 0.05);
//        System.out.println("Burger costs: " + burgerPriceCalculator.calculatePrice(10) + "zł");
//        System.out.println("Delivery costs: " + burgerPriceCalculator.calculateDeliveryPrice(13) + "zł");
//        System.out.println("Overall costs: " + burgerPriceCalculator.calculateTotalPrice(10, 13) + "zł");

        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal fish = new Fish();
        Animal bird = new Bird(3,"jack");
        Bird bird2 = new Bird(3,"kcaj");

        System.out.println(bird.equals(bird2));
        System.out.println(bird.hashCode());
        System.out.println(bird2.hashCode());
        System.out.println((char)97);



        Dog dog2 = new Dog();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

//        System.out.println(dog.hashCode());
//        System.out.println(dog2.hashCode());

//        System.out.println("Animal animal: "+ animal.move());
//        System.out.println("Animal dog: "+ dog.move());
//        System.out.println("Animal cat: "+ cat.move());
//        System.out.println("Dog dog2: "+ dog2.move());
//        System.out.println("Cat cat2: "+ cat2.move());
//
//        System.out.println("Can dog fly?:" + dog.canFly());
//        System.out.println("Can dog run?:" + dog.canRun());
//        System.out.println("Can fish swim?:" + fish.canSwim());
//        System.out.println("Can bird fly?:" + bird.canFly());
//        System.out.println(dog2.poke());
//        System.out.println(cat.toString());
//        System.out.println(dog.toString());
//        System.out.println(bird.toString());
//        System.out.println(cat2.equals(cat3));

//        String s1 = "kamil";
//        String s2 = "kamil";
//        String s3 = new String("kamil");
//        String s4 = new String("kamil");

//        System.out.println(s1.equals(s2));
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
//        System.out.println(s1.equals(s3));
//        System.out.println(s3.hashCode());
//        System.out.println(s4.hashCode());
//        System.out.println(s3.equals(s4));
//        System.out.println(s3==s4);



    }


}


