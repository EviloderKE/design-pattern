package strategy;

public class App {

    public static void main(String[] args) {
        King king = new King();
        king.fight(new SwordBehavior());

        Queue queue = new Queue();
        king.fight(new KnifeBehavior());
    }

}