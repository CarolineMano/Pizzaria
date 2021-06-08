package model;

public class Menu {
    private Product[] menu;

    public Menu() {
        menu = new Product [] {
                new Product("Mussarela", 24.99),
                new Product("Quatro queijos", 26.99),
                new Product("Pepperoni", 28.99),
                new Product("Frango com catupiry", 26.99)
        };
    }

    public Product[] getMenu() {
        return menu;
    }

    public String showAllToppings() {
        String output = "***Menu***\n";
        for (int i = 0; i < menu.length; i++) {
            output += i+1 + "-" + menu[i].getName() + " - R$" + menu[i].getPrice() + "\n";
        }
        return output;
    }
}
