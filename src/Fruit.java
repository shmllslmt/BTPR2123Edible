public class Fruit implements Edible, Comparable, Cloneable {
    protected String name;
    protected double price;
    protected double weight;

    Fruit(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    /**
     * This is a method from the Edible interface
     * @return describe how you eat a fruit
     */
    @Override
    public String howToEat() {
        return "Cut, slice and eat.";
    }

    @Override
    public String toString() {
        return "I am a "+name+". I am RM "+String.format("%.2f",calcTotalPrice())+"!";
    }

    public double calcTotalPrice() {
        return price * weight;
    }

    /**
     * @param o the object to be compared.
     * @return positive integer if the weight is heavier, negative integer if the weight is lighter and 0 if equal weight
     */
    @Override
    public int compareTo(Object o) {
        Fruit tempFruit = (Fruit) o;

        if(this.weight > tempFruit.weight)
            return 1;
        else if(this.weight < tempFruit.weight)
            return -1;
        else
            return 0;
    }

    /** 
     * This is a method from the Cloneable interface
     * @return a copy of the Fruit object
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Apple extends Fruit {
    Apple(String name, double price, double weight) {
        super(name, price, weight);
    }
}
class Orange extends Fruit {
    Orange(String name, double price, double weight) {
        super(name, price, weight);
    }
}
