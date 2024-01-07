package Interfaces;

import Classes.Actor;
import Classes.ClientDiscount;

public interface iReturnOrder {
    public boolean isTakeOrder();
    public boolean isMakeOrder();
    public void setTakeOrder(boolean val); 
    public void setMakeOrder(boolean val);
    public Actor geActor();
    public ClientDiscount geClientDiscount();  
}