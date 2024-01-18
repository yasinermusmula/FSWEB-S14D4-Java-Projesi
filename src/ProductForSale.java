public abstract class ProductForSale {
    private Type type;
    private int price;
    private String description;

    public ProductForSale(Type type, int price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public int getSalesPrice(int quantity) {
        return this.price * quantity;
    }

    public Type getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public abstract String showDetails();
}
