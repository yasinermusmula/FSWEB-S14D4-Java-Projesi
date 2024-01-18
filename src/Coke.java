public class Coke extends ProductForSale{

    private String cokeBrand;
    public Coke(Type type, int price, String description, String cokeBrand) {
        super(type, price, description);
        this.cokeBrand=cokeBrand;
    }

    public String getCokeBrand() {
        return cokeBrand;
    }

    @Override
    public String showDetails() {
        return "This Product is " + getType().getName() + " and brand is " + getCokeBrand() + " price is " + getPrice() + " TL" + " description is " + getDescription();
    }
}
