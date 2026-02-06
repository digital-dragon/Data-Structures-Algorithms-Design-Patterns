public class StrategyPatternDemo {
    public static void main(String[] args) {
        Character cowboy= new Cowboy();
        System.out.print("Cowboy ");
        cowboy.performFight();
        System.out.print("Cowboy ");
        cowboy.performDance();

        Character peacenik = new Peacenik();
        System.out.print("Peacenik ");
        peacenik.performFight();
        System.out.print("Peacenik ");
        peacenik.performDance();

        Character entertainer = new Entertainer();
        System.out.print("Entertainer ");
        entertainer.performFight();
        System.out.print("Entertainer ");
        entertainer.performDance();
    }
}
