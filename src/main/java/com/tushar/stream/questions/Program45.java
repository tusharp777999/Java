package com.tushar.stream.questions;

/*
* Given a Product class with attributes: id:int, name:String, price:double and category:String
* Create a list of Products.
* Implement in the following functionalities.
* 1.Print the names of Products whose price is below a certain threshold(e.g. 100).
* 2.Create a new list containing Products with a price reduction of 20%.
* 3.Calculate the average price of all products.
* 4.Find a product with the lowest price using Stream API.
*/

import com.tushar.stream.utility.Product;
import com.tushar.stream.utility.Utility;

import java.util.List;

public class Program45 {
    public static void main(String[] args) {
        List<Product> list = Utility.getProducts();

        //1.Print the names of Products whose price is below a certain threshold(e.g. 100).
        List<String> names = list.stream().filter(data -> data.getPrice() > 100.0).map(newData -> newData.getName()).toList();
        System.out.println(names);

        //2.Create a new list containing Products with a price reduction of 20%.
        List<Product> discountedProductList = list.stream().map(data -> {
                                                    double discountedPrice = data.getPrice() * 0.80;
                                                    data.setPrice(discountedPrice);
                                                    return data;
                                                }).toList();
        System.out.println(discountedProductList);

        //3.Calculate the average price of all products.
        double average = list.stream().mapToDouble(data -> data.getPrice()).average().getAsDouble();
        System.out.println(average);

        //4.Find a product with the lowest price using Stream API.
        Product product = list.stream().min((x, y) -> Double.compare(x.getPrice(), y.getPrice())).get();
        System.out.println(product);
    }
}
