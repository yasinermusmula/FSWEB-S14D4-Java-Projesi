public class Bread extends ProductForSale{

    private int weight;
    public Bread(Type type, int price, String description,int weight) {
        super(type, price, description);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String showDetails() {
        return "This product is " + getType().getName() + " and weight is " + getWeight() + " gr." + " Price is " +getPrice() + " TL" + " description is " + getDescription();
    }
}
