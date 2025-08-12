public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Animal animal = new Animal("Animal", 100);
        System.out.println(animal);

        Animal tiger = new Tiger("Tigger", 70);
        System.out.println(tiger);

        Animal chicky = new Chicken("Chicky", 5);
        System.out.println(chicky);
        // chicky need to be explicitly cast to Chicken to call howToEat()
        System.out.println(((Chicken)chicky).howToEat());

        Fruit buah = new Fruit("Durian", 50, 1);
        Fruit mango = new Fruit("Mango", 50, 12);
        System.out.println(buah);
        System.out.println(buah.howToEat());

        if(buah.compareTo(mango) > 0)
            System.out.println("Durian is more than Mango");
        else if(buah.compareTo(mango) < 0)
            System.out.println("Durian is less than Mango");
        else
            System.out.println("Durian and Mango is of the same weight");

        Fruit durian = (Fruit)buah.clone();
        System.out.println(durian);
    }
}