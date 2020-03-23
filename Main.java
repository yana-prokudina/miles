import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {

        BigDecimal ticketprice = new BigDecimal("67897");
        BigDecimal miles = new BigDecimal("20");
        BigDecimal bonusmiles = ticketprice.divide(miles,0, RoundingMode.FLOOR); // деление
        System.out.println(bonusmiles);
    }
}
