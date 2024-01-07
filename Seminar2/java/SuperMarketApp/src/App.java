import Classes.Actor;
import Classes.ClientDiscount;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Classes.TaxInspector;
import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public class App {
    public static void main(String[] args) throws Exception {

        Market magnit = new Market();

        Actor client1 = new OrdinaryClient("Надежда", 2);
        Actor client2 = new OrdinaryClient("Юрий", 4);
        Actor client3 = new SpecialClient("директор", 1);
        iActorBehaviour client4 = new TaxInspector();

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);

        magnit.update();
    }
}
