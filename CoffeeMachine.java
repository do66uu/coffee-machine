import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int cash = 550;
        boolean active = true;


        while (active) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String answer = num.nextLine();
            switch (answer) {
                case "remaining": // check the available amount of ingredients and cash
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(beans + " of beans");
                    System.out.println(cups + " of disposable cups");
                    System.out.println(cash + " of money");
                    continue;
                case "buy": // click to buy coffee

                    /* For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
                     * For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
                     * For the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee beans. It costs $6. */

                    System.out.println("What do You want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu");
                    String choose = num.nextLine();
                    switch (choose) {
                        case "1": // espresso
                            if (water >= 250 && beans >= 16 && cups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 250;
                                beans -= 16;
                                cash += 4;
                                cups -= 1;
                            } else if (water < 250 && beans >= 16 && cups >= 1) {
                                System.out.println("Sorry, not enough water!");
                            } else if (water >= 250 && beans < 16 && cups >= 1) {
                                System.out.println("Sorry, not enough beans!");
                            } else if (water >= 250 && beans >= 16 && cups < 1) {
                                System.out.println("Sorry, not enough cups!");
                            }
                            break;
                        case "2": // latte
                            if (water >= 350 && milk >= 75 && beans >= 20 && cups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 350;
                                milk -= 75;
                                beans -= 20;
                                cash += 7;
                                cups -= 1;
                            } else if (water < 350 && milk >= 75 && beans >= 16 && cups >= 1) {
                                System.out.println("Sorry, not enough water!");
                            } else if (water >= 350 && milk >= 75 && beans < 16 && cups >= 1) {
                                System.out.println("Sorry, not enough beans!");
                            } else if (water >= 350 && milk >= 75 && beans >= 16 && cups < 1) {
                                System.out.println("Sorry, not enough cups!");
                            } else if (water >= 350 && milk < 75 && beans >= 16 && cups >= 1) {
                                System.out.println("Sorry, not enough milk");
                            }
                            break;
                        case "3": // cappuccino
                            if (water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 200;
                                milk -= 100;
                                beans -= 12;
                                cash += 6;
                                cups -= 1;
                            } else if (water < 200 && milk >= 100 && beans >= 12 && cups >= 1) {
                                System.out.println("Sorry, not enough water!");
                            } else if (water >= 200 && milk >= 100 && beans < 12 && cups >= 1) {
                                System.out.println("Sorry, not enough beans!");
                            } else if (water >= 200 && milk >= 100 && beans >= 12 && cups < 1) {
                                System.out.println("Sorry, not enough cups!");
                            } else if (water >= 200 && milk < 100 && beans >= 12 && cups >= 1) {
                                System.out.println("Sorry, not enough milk");
                            }
                            break;
                        case "back": // back to main menu
                            break;
                        default: // error! start again
                            break;
                    }
                    continue;
                case "take": // get cash
                    System.out.println("I gave You " + cash + " $");
                    cash -= cash; // cash equals 0
                    continue;
                case "fill": // add ingredients
                    System.out.println("Write how many ml of water do you want to add: ");
                    int addWater = num.nextInt();
                    System.out.println("Write how many ml of milk do you want to add: ");
                    int addMilk = num.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add: ");
                    int addCoffee = num.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add: ");
                    int addCups = num.nextInt();

                    water += addWater;
                    milk += addMilk;
                    beans += addCoffee;
                    cups += addCups;
                    continue;
                case "exit": // turn off the machine
                    active = false;
                    break;
                default:
                    break;
            }
        }
    }
}
