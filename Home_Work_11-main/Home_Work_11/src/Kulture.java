public class Kulture extends Government   {
    private String art;   // искусство
    private int money;

    public Kulture(String art, int money) {
        this.art = art;
        this.money = money;
    }

    @Override
    public void print() {
        System.out.println("Министерство культуры, тип работы: " + art + "\nMoney: " + money);

    }
}
