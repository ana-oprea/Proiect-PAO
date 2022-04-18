package models;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> shoppingCart;
    private int nrProducts;
    private float total;

    public Cart(){
        this.shoppingCart = new ArrayList<>();
        this.total = 0;
    }

    public ArrayList<Product> getShoppingCart() {
        return this.shoppingCart;
    }

    public int getNrProducts() {
        return nrProducts;
    }

    public void setNrProducts(int nrProducts) {
        this.nrProducts = nrProducts;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total += total;
    }

    public void addToCart(Product product){
        this.shoppingCart.add(product);
    }

    public void deleteFromCart(Product product){
        this.shoppingCart.remove(product);
    }

    public void deleteFromCartById(int id) {
        Product p = this.shoppingCart.get(id);
        deleteFromCart(p);
    }

    public int getCartSize(){
        return this.shoppingCart.size();
    }

    public Product getShoppingCartById(int id) {
        return this.shoppingCart.get(id);
    }

}
