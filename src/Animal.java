public class Animal {
    protected String name;
    protected int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Hi, I am "+name+" and "+age+" years old.";
    }
}

class Tiger extends Animal {
    Tiger(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return super.toString() + " I am a tiger.";
    }
}

class Chicken extends Animal implements Edible {
    Chicken(String name, int age) {
        super(name, age);
    }

    @Override
    public String howToEat() {
        return "Eat with rice - chicken rice!";
    }

    @Override
    public String toString() {
        return super.toString()+" I am a chicken.";
    }
}
