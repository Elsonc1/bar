package bar;

class Client {
    private char sex;
    private int quantityBeer;
    private int quantitySoda;
    private int quantitySteak;

    public Client(char sex, int quantidadeCervejas, int quantitySoda, int quantitySteak) {
        this.sex = sex;
        this.quantityBeer = quantidadeCervejas;
        this.quantitySoda = quantitySoda;
        this.quantitySteak = quantitySteak;
    }

    public char getSex() {
        return sex;
    }

    public int getQuantityBeer() {
        return quantityBeer;
    }

    public int getQuantitySoda() {
        return quantitySoda;
    }

    public int getQuantitySteaks() {
        return quantitySteak;
    }
}