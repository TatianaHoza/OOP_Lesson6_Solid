package solid;

import solid.srp.models.Order;
import src.solid.srp.models.Factory;
import src.solid.srp.models.FactoryOrdery;
import src.solid.srp.models.Saver;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        FactoryOrdery fo = new FactoryOrdery();
        Order order = fo.createOrder();
        Saver save = new Saver("Order1",order);
        save.savaToJson();

    }
}
