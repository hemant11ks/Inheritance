// extends - specifies the superclass or parent class we are declaring.
// A class can specify one, and only one, class in its extends clause.
// super - is a way to call the constructor of super class directly from subclass constructor.
// Because of hat rule this() and super() can never be called from same constructor.
// if you dont call super() then java make it for you using super's default constructor.

// Dog-> earShape: String, tailShape: String and bark(), run(), walk(), wagTail() methods

public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog(){
        super("Mutt", "Big", 50);
    }

    public Dog(String type,double weight){
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape){
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
            " earShape='" + earShape + '\'' +
            ", tailShape='" + tailShape + '\'' +
            "}" + super.toString();
    }

    public void makeNoise(){
        if(type == "Wolf"){
        System.out.println("Ow Woooo! ");
        }
        bark();
        System.out.println();
    }

    public void move(String speed){
        super.move(speed);
        // System.out.println("Dog walk, run and wag their tail");
        if(speed == "slow"){
            walk();
            wagTail();
        }else {
            run();
            bark();
        }
        System.out.println();
    }

    public void bark(){
        System.out.println("Woof! ");
    }

    public void run(){
        System.out.println("Dog Running ");
    }

    public void walk(){
        System.out.println("Dog Walking ");
    }
    public void wagTail(){
        System.out.println("Tail Wagging ");
    }

}

    
