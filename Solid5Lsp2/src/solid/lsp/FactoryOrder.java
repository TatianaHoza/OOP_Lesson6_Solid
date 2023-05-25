package solid.lsp;

public class FactoryOrder {
    public Order create(int qnt, int price, boolean isBonus) {
        if (isBonus) {
            return new Order(qnt, price);
        }
        return new Order(qnt, price);
    }
}
