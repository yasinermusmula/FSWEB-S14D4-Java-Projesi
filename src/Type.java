public enum Type {
    CANDY("Chocolote"),
    BAKERY("Bread"),
    BAVARAGE("Coke");

    private String name;

    Type(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
