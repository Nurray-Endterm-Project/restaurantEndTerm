package RESTAURANT;

import java.util.ArrayList;

public class Foods {
    private int id;
    private static int id_gen = 0;
    private String name;
    private int price;
    private Receipts receipt;
    public Foods(String name, int price, Receipts receipt){
        id =  id_gen++;
        this.name = name;
        this.price = price;
        this.receipt = receipt;
    }
    public int getId(){
        return id;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setReceipt(Receipts receipt) {
        this.receipt = receipt;
    }

    public Receipts getReceipt() {
        return receipt;
    }
}
