import java.util.Scanner;
import java.text.DecimalFormat;
public class Homework {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        System.out.println("Enter value in Dollars:");
        double USD = Double.parseDouble(scanner.nextLine());
        double BGN = USD*1.64549;
        System.out.println("Value in BGN:" + df.format(BGN));
    }
}
