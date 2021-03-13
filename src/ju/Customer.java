package ju;

public class Customer {
    String id;
    int money;
    int discount;
    public Customer(String id, int money, int discount){
        this.id = id;
        this.money = money;
        this.discount = discount;
    }
    public void print() {
        System.out.println(id + "\t" + money + "\t" + discount + "\t" +(money-discount));


    }
}
