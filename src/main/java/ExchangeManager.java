import java.util.Scanner;

/**
 * Created by Lenovo on 17.03.2017.
 */
public class ExchangeManager {
    static Bank[] banks = new Bank[3];

    ExchangeManager() {
        banks = generate();
    }

    public Bank[] generate() {
        Bank[] banks = new Bank[3];

        banks[0] = new Bank("PrivatBank", 26);
        banks[1] = new Bank("OshadBank", 27);
        banks[2] = new Bank("PUMB", 28);

        return banks;
    }

    public static void main(String[] args) {
        ExchangeManager em = new ExchangeManager();
        System.out.println(em.banks[0].name + ": 100 " + "USD = " + 100 * em.banks[0].USD_TO_UAH);
        System.out.println(em.banks[1].name + ": 100 " + "USD = " + 100 * em.banks[1].USD_TO_UAH);
        System.out.println(em.banks[2].name + ": 100 " + "USD = " + 100 * em.banks[2].USD_TO_UAH);
        System.out.println("-------------------------------------");

        String nameOfTheChosenBank = getNameOfTheBankFromConsole();
        System.out.println("Name Of The Chosen Bank = " + nameOfTheChosenBank);
        System.out.println("-------------------------------------");

        Bank chosenBank = getBankByName(nameOfTheChosenBank);
        System.out.println(chosenBank);
        System.out.println("-------------------------------------");

        System.out.println("Result: " + chosenBank.name + ": 100 " + "USD = " + 100 * chosenBank.USD_TO_UAH);
    }

    public static String getNameOfTheBankFromConsole() {
        //init scanner
        Scanner scanner = new Scanner(System.in);

        String nameOfTheBank = "MyBank";

        //enter name of the bank
        System.out.println("Choose the name of the bank. Enter 1, 2 or 3: ");
        System.out.print("1. PrivatBank; ");
        System.out.print("2. OshadBank; ");
        System.out.println("3. PUMB.");
        int numberOfTheBank = scanner.nextInt();

        switch (numberOfTheBank) {
            case 1:
                nameOfTheBank = "PrivatBank";
                break;

            case 2:
                nameOfTheBank = "OshadBank";
                break;

            case 3:
                nameOfTheBank = "PUMB";
                break;
        }
        return nameOfTheBank;
    }

    public static Bank getBankByName(String nameOfTheBank) {
        switch (nameOfTheBank) {
            case "PrivatBank":
                return banks[0];

            case "OshadBank":
                return banks[1];

            case "PUMB":
                return banks[2];

            default:
                return null;
        }

    }
}
