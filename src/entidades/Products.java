/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author caiqu
 */
public class Products {

    private String name;
    private double price;

    public Products() {
    }

    public Products(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String priceTag() {
        return name + " $ " + String.format("%.2f", price);
    }
    
    //não preciso do toString, posso chamar direto o método priceTag.
//    @Override
//    public String toString() {
//        return priceTag();
//    }
}
