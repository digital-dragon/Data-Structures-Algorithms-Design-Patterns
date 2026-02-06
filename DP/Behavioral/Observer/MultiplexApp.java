import java.util.concurrent.TimeUnit;

public class MultiplexApp {
    public static void main(String[] args) throws InterruptedException {
        Multiplex multiplex = new Multiplex();

        MovieGoer tom = new MovieGoer("Tom");
        MovieGoer dick = new MovieGoer("Dick");
        MovieGoer harry = new MovieGoer("Harry");

        multiplex.subscribe(tom);
        multiplex.subscribe(dick);
        multiplex.subscribe(harry);

        multiplex.setReleasing("The good, the bad, and the ugly");

        TimeUnit.SECONDS.sleep(1);

        multiplex.setReleasing("For a few dollars more");

        TimeUnit.SECONDS.sleep(3);

        multiplex.setReleasing("Dirty Harry");

        TimeUnit.SECONDS.sleep(5);

        multiplex.setReleasing("Some bollywood movie!");

        multiplex.setClosing("Some bollywood movie!");

    }

}
