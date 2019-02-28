
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
public class Storehouse {

    private Map<String, Integer> productsPrice;
    private Map<String, Integer> productsStock;

    public Storehouse() {
        this.productsPrice = new HashMap<String, Integer>();
        this.productsStock = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        this.productsPrice.put(product, price);
        this.productsStock.put(product, stock);
    }

    public int price(String product) {
        int value;
        String key = product;
        if (this.productsPrice.get(key) == null) {
            value = -99;
        } else {
            value = this.productsPrice.get(key);
        }
        return value;
    }

    public int stock(String product) {
        int value;
        String key = product;
        
        if (this.productsStock.get(key) == null) {
            value = 0;
        } else {
            value = this.productsStock.get(key);
        }
        return value;
    }

    public boolean take(String product) {
        int value;
        String key = product;
        if (this.productsStock.get(key) == null) {            
            return false;
        } else if (this.productsStock.get(key) == 0) {
            return false;
        } else {
            value = this.productsStock.get(key);
            value--;
            this.productsStock.put(key, value);
        }
        return true;
    }
    
    public Set<String> products() {
        Set keyset = this.productsPrice.keySet();
        return keyset;
    }

}
