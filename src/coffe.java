import org.w3c.dom.ls.LSOutput;

public class coffe {
    public static void main(String[] args) {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skinnedMilkAmount = 1290;

        boolean isBlocked = false;

        int cappucinoMilkRequired = 60;
        int cappucinoCoffeeRequired = 15;

        boolean milkIsEnought = skinnedMilkAmount >= cappucinoMilkRequired ||
                milkAmount >= cappucinoMilkRequired;

        boolean coffeIsEnought = coffeeAmount >= cappucinoCoffeeRequired;

        boolean hasErrors = false;

        if (isBlocked) {
            System.out.println("Кофе-машина заблокирована");
            hasErrors = true;
        }
        if (!coffeIsEnought) {
            System.out.println("Кофе недостаточно");
            hasErrors = true;

        }
        if (!milkIsEnought) {
            System.out.println("Молока не достаточно");
            hasErrors = true;
        }

        if (!hasErrors) {
            System.out.println("Готовим кофе");
        }
    }
}
