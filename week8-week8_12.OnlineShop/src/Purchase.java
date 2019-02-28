/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aikitrumm
 */
public class Purchase {
    
    private String product;
    private int amount;
    private int unitPrice;
    
    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }
    
    public Purchase(String product, int unitPrice) {
        this.product = product;
        this.unitPrice = unitPrice;
    }
    
    public int price() {
        // if (this.amount == 0) {
        //     return this.unitPrice;
        // }
        return this.amount * this.unitPrice;
    }
    
    public void increaseAmount() {
        this.amount++;
    }
    
    public String toString() {
        return this.product + ": " + this.amount;
    }

    public String getProduct() {
        return product;
    }
    
    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        Purchase compared = (Purchase) object;

        // if (this.publishingYear != compared.getPublishingYear()) {
        //     return false;
        // }

        if (this.product == null || !this.product.equals(compared.getProduct())) {
            return false;
        }

        return true;
    }
    
}
