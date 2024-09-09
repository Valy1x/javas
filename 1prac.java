import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;
        double yu;
        int yuan;
        int digit;
        double roubles;
        System.out.print("Введите целое число - сколько юаней вы хотите конвертировать в рубли: ");
        Scanner input = new Scanner(System.in);
        yu = input.nextDouble();
        if (yu % 1 != 0) {
            System.out.print("Ошибка! Введено нецелое число юаней.");
        } else {
            yuan = (int) yu;
            digit = yuan % 10;
            roubles = ROUBLES_PER_YUAN * yuan;
            if (roubles % 1 != 0) {
                roubles += 1;
            }
            if (digit == 1) {
                System.out.println(yuan + " Китайский юань конвертируется в сумму в рублях, равную: " + (int) roubles);
            } else if ((digit >= 2) & (digit <= 4)) {
                System.out.println(yuan + " Китайских юаня конвертируются в сумму в рублях, равную: " + (int) roubles);
            } else {
                System.out.println(yuan + " Китайских юаней конвертируются в сумму в рублях, равную: " + (int) roubles);
            }
        }
    }
}
