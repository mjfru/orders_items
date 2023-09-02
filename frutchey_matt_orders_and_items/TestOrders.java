import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {

        //! Menu Items
        Item drink1 = new Item();
        drink1.name = "Mocha";
        drink1.price = 4.5;

        Item drink2 = new Item();
        drink2.name = "Drip Coffee";
        drink2.price = 2.5;

        Item drink3 = new Item();
        drink3.name = "Latte";
        drink3.price = 4.0;

        Item drink4 = new Item();
        drink4.name = "Cappuccino";
        drink4.price = 3.5;

        //! Order Variables (Order1, etc.)
        Order order1 = new Order();
        order1.name = "Cindhuri";
        order1.total = 0.00;
        order1.ready = false;

        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.total = 0.00;
        order2.ready = false;

        Order order3 = new Order();
        order3.name = "Noah";
        order3.total = 0.00;
        order3.ready = false;

        Order order4 = new Order();
        order4.name = "Sam";
        order4.total = 0.00;
        order4.ready = false;
        
        //* Application Simulations:

        //? Add item1 to order2's item list and increment the order's total.
        order2.items.add(drink1);
        order2.total += drink1.price;
        System.out.println(order2.name + "'s total is: $" + String.format("%.2f", order2.total));

        //? Noah ordered a cappuccino. Add the cappuccino to their order list and to their tab.
        order3.items.add(drink4);
        order3.total += drink4.price;
        System.out.println(order3.name + "'s total is: $" + String.format("%.2f", order3.total));

        //? Sam ordered a latte. Update the order accordingly.
        order4.items.add(drink3);
        order4.total += drink3.price;
        System.out.println(order4.name + "'s total is: $" + String.format("%.2f", order4.total));

        //? Cindhuri's order is now ready. Update her status
        order1.ready = true;
        System.out.println(order1.name + "'s order ready?: " + order1.ready);

        //? Sam ordered 2 more lattes, update their order.
        order4.items.add(drink3);
        order4.items.add(drink3);
        order4.total += drink3.price * 2;
        System.out.println(order4.name + "'s NEW total is: $" + String.format("%.2f", order4.total));

        //? Jimmy's order is now ready. Update his status.
        order2.ready = true;
        System.out.println(order2.name + "'s order ready?: " + order2.ready);
        
        // Example code for testing order updates:
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("Name: %s\n", order1.name);
        System.out.println(order3.total);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
    }
}