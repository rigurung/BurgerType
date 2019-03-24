public class main {
    public static void main(String[] args){
    Hamburger hamburger = new Hamburger("Basic burger", "whole wheat", "ham");
    hamburger.addIngridient(true, true, true, false);

    HealthyBurger burger = new HealthyBurger("ham");

    burger.addIngridient(true, true, true, true, true, true);
    System.out.println(burger.actualPrice);

    DeluxeBurger rojina = new DeluxeBurger("whole wheat", "ham", "Sprite", "lays");
    rojina.addIngridient(true, true, true, true);


    }
}

