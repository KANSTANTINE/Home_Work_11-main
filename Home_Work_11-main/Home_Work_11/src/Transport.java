public class Transport extends Government  {
    private String street;
    private String shipping;  // перевозки

    public Transport(String street, String shipping) {
        this.street = street;
        this.shipping = shipping;
    }

    @Override
    public void print() {
        System.out.println("Министерство транспорта, тип работы: " + street
        + "\nПеревозки: " + shipping );
    }
}