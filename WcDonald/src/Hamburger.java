public class Hamburger {
    private String name;
    private String bread;
    private String meat;
    private boolean tomato;
    private boolean lettuce;
    private boolean carrot;
    private boolean onion;

    private double basePrice;
    public double actualPrice;


    public Hamburger(String name, String bread, String meat) {
        this.name = "Basic Burger";
        this.bread = bread;
        this.meat = meat;
        this.basePrice = 2.75;
        this.actualPrice = this.basePrice;
    }

        public void addIngridient( boolean tomato, boolean lettuce, boolean onion, boolean carrot){

        if(tomato){
            System.out.println("Add tomato: " + tomato());
            this.actualPrice += tomato();
        this.tomato = tomato;}

        if(lettuce){
            System.out.println("Add Lettuce: " + lettuce());
            this.actualPrice += lettuce();
        this.lettuce = lettuce;}

        if(carrot){
            System.out.println("Add carrot: " + carrot());
            this.actualPrice += carrot();
        this.carrot = carrot;}

        if(onion){
            System.out.println("Add onion: " + onion());
            this.actualPrice += onion();
        this.onion = onion;}

        System.out.println("Your total is " + this.actualPrice);

    }

    public double tomato(){
        return .75;
    }

    public double lettuce(){
        return 0.5;
    }
    public double carrot(){
        return 0.5;
    }
    public double onion(){
        return 0.75;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void price(){
        System.out.println("You can add four additional ingredients in your basic burger." + "\n"+ "The price are as follows: ");
        System.out.println("Tomato: " + tomato() +  "\n" + "Lettuce: " + lettuce() + "\n"
                + "Onion: " + onion()+ "\n"+ "Carrot: " + carrot() + "\n");
    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }
}