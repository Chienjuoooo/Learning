package ju;

public class Customer {
    String id;
    int amount;
    public Customer(String id, int amount){
        this.id = id;
        this.amount = amount;
    }
    public void print() {
        System.out.println(id + "\t" + amount);


    }
    public int getTotal(){
        return amount;
    }
}
