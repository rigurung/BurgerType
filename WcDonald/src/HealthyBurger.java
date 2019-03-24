
public class HealthyBurger extends Hamburger{
    private String healthyBread;
    private boolean avocado;
    private boolean strawberry;
    private String noFatMeat;


    public HealthyBurger(String noFatMeat) {
        super("Healthy Burger", "brown rye bread", noFatMeat);

        this.healthyBread = "brown rye bread";
        this.noFatMeat = noFatMeat;

        System.out.println("Your order a healthy burger. It comes with six ingredients." +
                " You initial price is " + getBasePrice() + ".");
    }

    public void addIngridient(boolean tomato, boolean lettuce, boolean onion, boolean carrot, boolean avocado, boolean strawberry) {
        super.addIngridient(tomato, lettuce, onion, carrot);

        if (avocado) {
            this.actualPrice += avocado();
            System.out.println("Add Avocado: " + avocado());
            this.avocado = avocado;
        }
        if (strawberry) {
            this.actualPrice += strawberry();
            System.out.println("Add Strawberry: " + avocado());
            this.strawberry = strawberry;
        }
    }

    public double avocado(){
        return 2;
    }

    public double strawberry(){
    return 2;}

    public void healthyPrice(){
        System.out.println("You can add six additional ingredients in your burger." + "\n"+ "The price are as follows: ");
        System.out.println("Tomato: " + tomato() +  "\n" + "Lettuce: " + lettuce() + "\n" +
                "Onion: " + onion()+ "\n"+ "Carrot: " + carrot() + "\n" + "Avocado: " + avocado() +"\n" + "Strawberry: " +  strawberry());

    }


}


