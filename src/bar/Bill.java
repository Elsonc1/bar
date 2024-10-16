package bar;

class Bill {
    private static final double PRICE_TICKET_MALE = 10.00;
    private static final double PRICE_TICKET_WOMAN = 8.00;
    private static final double PRICE_BEER = 5.00;
    private static final double PRICE_SODA = 3.00;
    private static final double PRICE_STEAK = 7.00;
    private static final double COUVERT = 4.00;

    public double calcularConsumo(Client client) {
        double allBill = (client.getQuantityBeer() * PRICE_BEER)
                            + (client.getQuantitySoda() * PRICE_SODA)
                            + (client.getQuantitySteaks() * PRICE_STEAK);
        return allBill;
    }

    public double calcularCouvert(double consume) {
        if (consume > 30.00) {
            return 0.00;
        } else {
            return COUVERT;
        }
    }

    public double calcularIngresso(Client client) {
        if (client.getSex() == 'M' || client.getSex() == 'm') {
            return PRICE_TICKET_MALE;
        } else {
            return PRICE_TICKET_WOMAN;
        }
    }

    public void generateReport(Client client) {
        double consume = calcularConsumo(client);
        double couvert = calcularCouvert(consume);
        double ticket = calcularIngresso(client);
        double allValue = consume + couvert + ticket;

        System.out.println("RELATÓRIO:");
        System.out.printf("Consumo = R$ %.2f\n", consume);
        System.out.printf("Couvert = R$ %.2f\n", couvert);
        System.out.printf("Ingresso = R$ %.2f\n", ticket);
        System.out.printf("Valor a pagar = R$ %.2f\n", allValue);
    }
}