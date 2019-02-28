
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aikitrumm
 */
public class ShoppingBasket {
    private List<Purchase> basket;
    
    public ShoppingBasket() {
        this.basket = new ArrayList<Purchase>();
    }
    
    public void add(String product, int price) {
        Purchase purchase = new Purchase(product, price);
        if (!basket.contains(purchase)) {
            basket.add(purchase);
            purchase.increaseAmount();
        } else if (basket.contains(purchase)) {
            int index = basket.indexOf(purchase);
            purchase = basket.get(index);
            purchase.increaseAmount();
        }
        
    }
    
    public int price() {
        int totalPrice = 0;
        for (int i = 0; i < basket.size(); i++) {
            Purchase purchase = basket.get(i);
            int price = purchase.price();
            totalPrice += price;
        }
        return totalPrice;
    }
    
    public void print() {
        for (int i = 0; i < basket.size(); i++) {
            Purchase purchase = basket.get(i);
            System.out.println(purchase.toString());
        }
    }
    
}
