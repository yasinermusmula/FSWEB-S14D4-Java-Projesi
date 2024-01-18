public class Store {
    public static void main(String[] args) {
        ProductForSale chocolate = new Chocolate(Type.CANDY,30,"Market","Milka");
        ProductForSale coke = new Coke(Type.BAVARAGE,25,"Bakkal", "Cola Turka");
        ProductForSale bread = new Bread(Type.BAKERY,10, "Cafe",250);
//        ProductForSale ProductForSale[] = new ProductForSale[3];
//        ProductForSale[0] = chocolate;
//        ProductForSale[1] = coke;
//        ProductForSale[2] = bread;

//        System.out.println(chocolate.showDetails());

        ProductForSale[] ProductForSale = {chocolate,coke,bread};

        listProducts(ProductForSale);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale p : products){
            System.out.println(p.showDetails());
        }
    }
}