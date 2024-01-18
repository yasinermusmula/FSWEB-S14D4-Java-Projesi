public class Chocolate extends ProductForSale{

    private String chocolateName;
    public Chocolate(Type type, int price, String description, String chocolateName) {
        super(type, price, description);
        this.chocolateName = chocolateName;
    }

    public String getChocolateName() {
        return chocolateName;
    }

    @Override
    public String showDetails() {
        return "This product is " +getType().getName() + " and name is "  + getChocolateName() + " price is " +getPrice() + " $" + " description is " + getDescription();
    }
}
