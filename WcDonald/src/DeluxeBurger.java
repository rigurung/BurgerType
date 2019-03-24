public class DeluxeBurger extends Hamburger {
    private String drinks;
    private String Chips;

    public DeluxeBurger( String bread, String meat, String drinks, String chips) {
        super("Deluxe Burger", bread, meat);
        this.drinks = drinks;
        Chips = chips;

        this.actualPrice += drinks();
        this.actualPrice+= chips();
    }

    public void addIngridient(boolean tomato, boolean lettuce, boolean onion, boolean carrot) {
        super.addIngridient(tomato, lettuce, onion, carrot);

        System.out.println("You have ordered a deluxe burger with " + "\n" + "bread: " + getBread() + "\n" + "Stuffed meat: " + getMeat() + "\n" +
                "tomato: " + tomato + "\n" + "lettuce: " + lettuce +  "\n" +"Carrot: " + carrot +  "\n" +"Onion: " + onion +  "\n" +"Chips: " + Chips +  "\n" +"Drinks: " + drinks) ;
    }

    public double drinks(){
        return 1.25;
    }
    public double chips(){
        return 1.25;
    }


}
