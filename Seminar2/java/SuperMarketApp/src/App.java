import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Classes.TaxInspector;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {

        Market magnit = new Market();

        Actor client1 = new OrdinaryClient("boris");
        Actor client2 = new OrdinaryClient("masha");
        Actor client3 = new SpecialClient("prezident", 1);

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);

        magnit.update();
    }
}
