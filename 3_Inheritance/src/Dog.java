public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog() {
        super("Mutt", "Big", 50);
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() {

    }

//    This method is overriding the Parent class method and it can have more specific methods over
//    parent class by using the same name of the methods
    @Override
    public void move(String speed) {
        super.move(speed);
        if (speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
    }

    public void bark() {
        System.out.print("lol lol!! ");
    }

    public void run() {
        System.out.print("Dog running ");
    }

    public void walk() {
        System.out.print("Dog walking ");
    }

    public void wagTail() {
        System.out.print("Waging tail ");
    }
}
