package OOP.Lesson_2_Encapsulation.Exercise_2.ShoppingSpree_03;

import java.util.ArrayList;
import java.util.List;

public class Person {
//name: String
//money:  double
//products:  List<Product>
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();

    }

    private void setName(String name) {
        if (!name.trim().isEmpty()){
            this.name = name;
        }else {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    private void setMoney(double money) {
        if (money >= 0){
            this.money = money;
        }else {
            throw new IllegalArgumentException("Money cannot be negative");
        }
    }
    public void buyProduct (Product product){
        if (this.money >= product.getCost()){
            this.products.add(product);
            this.money -= product.getCost();
        }else {
            //"{Person name} can't afford {Product name}"
            String msg = this.name + " can't afford " + product.getName();
            throw new IllegalArgumentException(msg);
        }

    }

    public String getName() {
        return name;
    }
}
