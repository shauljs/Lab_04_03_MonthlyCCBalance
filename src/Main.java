//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Declarations
        double startingBalance = 5000;
        double oneMonthBalance;
        double twoMonthBalance;

        oneMonthBalance = (startingBalance * .17) + startingBalance;

        System.out.println("Your balance due after one month is $" + oneMonthBalance + "0.");

        twoMonthBalance = (oneMonthBalance * .17) + oneMonthBalance;

        System.out.println("Your balance due after two months is $" + twoMonthBalance + "0.");
    }
}