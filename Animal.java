public class Animal {

    protected String type; // because it used in Dog method -> makeNoise()
    private String size;
    private double weight;

    public Animal(){

    }

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "{" +
            " type='" + type + "'" +
            ", size='" + size + "'" +
            ", weight='" + weight + "'" +
            "}";
    }

    public void move(String speed){
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise(){
        System.out.println(type + " Make some kind of noise ");
    }
    
    
}

    
