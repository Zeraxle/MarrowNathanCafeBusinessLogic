import java.util.Arrays;
import java.util.ArrayList;

public class CafeUtil {

    int sum;
    public int getStreakGoal() {
        for (int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println(sum);
        }
        return sum;
    }

    double total;
    public double getOrderTotal(double[] prices) {
        for (int i = 0; i < prices.length; i++){
            total += prices[i];
            System.out.println(prices[i]);
            System.out.println(total);
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for (int i = 0; i < menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.println("Hello, " + username + "!");
        System.out.printf("There are %d people in front of you.", customers.size());
        customers.add(username);
        System.out.println(customers);
    }
    }

