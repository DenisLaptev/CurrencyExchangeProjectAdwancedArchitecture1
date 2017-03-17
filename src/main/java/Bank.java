/**
 * Created by Lenovo on 17.03.2017.
 */
public class Bank {
    String name;
    double USD_TO_UAH;

    public Bank(String name, double USD_TO_UAH) {
        this.name = name;
        this.USD_TO_UAH = USD_TO_UAH;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name +
                ", USD_TO_UAH=" + USD_TO_UAH +
                '}';
    }
}
