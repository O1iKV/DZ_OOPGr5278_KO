package Classes;
import Interfaces.iReturnOrder;
/**
Класс ClientStocks - описывающий акционного клиента. 
Включить поле название акции, id клиента и количество участников в акции
*/
public class ClientDiscount implements iReturnOrder {
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;
    private static String discountName; //Название акции
    private static int idClient; //Номер клиента в акции
    private static int participantsNumber; //Количество участников акции

    //Метод установки названия акции
    public static void setDiscountName(String name) {
    discountName = name;
    }

    //Метод установки id клиента в акции
    public static void setClientNumber(int number) {
    if (number > participantsNumber) {
        System.out.println("Нельзя превышать лимит акции");
    } else {
    idClient = number;
    }
    }

    //Метод установки общего количества участников акции.
    public static void setParticipantsNumber(int number) {
    participantsNumber = number;
    }

    public ClientDiscount() {
        this.name = "Клиент с товаром по ";
    }

    public String getName()
    {
        return name;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean val) {
       this.isTakeOrder = val;
    }

    @Override
    public void setMakeOrder(boolean val) {
        this.isMakeOrder = val;
    }

    @Override
    public Actor geActor() {
        return new OrdinaryClient("Скидки", 8);
    }

    @Override
    public ClientDiscount geClientDiscount() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'geClientDiscount'");
    }
    
}