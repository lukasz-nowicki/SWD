package com.company;

/**
 * Created by Newuser on 2016-12-27.
 */
public class Product {


    private int price;
    private int width;

    Product(int price, int width){
        price=this.price;
        width=this.width;
    }

    public int getPrice() {
        return price;
    }

    public int getWidth() {
        return width;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", width=" + width +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (getPrice() != product.getPrice()) return false;
        return getWidth() == product.getWidth();

    }

    @Override
    public int hashCode() {
        int result = getPrice();
        result = 31 * result + getWidth();
        return result;
    }
}
