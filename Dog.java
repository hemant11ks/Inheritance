// extends - specifies the superclass or parent class we are declaring.
// A class can specify one, and only one, class in its extends clause.
// super - is a way to call the constructor of super class directly from subclass constructor.
// Because of hat rule this() and super() can never be called from same constructor.
// if you dont call super() then java make it for you using super's default constructor.
public class Dog extends Animal{

    public Dog(){
        super(null, null, 0);
    }
}
