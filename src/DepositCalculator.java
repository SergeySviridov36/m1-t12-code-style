import java.util.Scanner;
public class DepositCalculator {
    public static void main(String[] args) {

        new DepositCalculator().Menu();
    }
    double CalculateComplexPercent(double a, double y, int d) {
        double pay = a * Math.pow((1 + y / 12), 12 * d);
        return calculation(pay, 2);
    }

    double CalculateSimplePercent(double doubleAmount, double doubleYearRate, int depositPeriod) {
        return calculation(doubleAmount + doubleAmount * doubleYearRate * depositPeriod, 2);
    }

    double calculation(double value, int places) {
        double scaLe = Math.pow(10, places);
        return Math.round(value * scaLe) / scaLe;
    }

    void Menu() {
        int period;
        int action;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму вклада в рублях:");

        int amount = scanner.nextInt();

        System.out.println("Введите срок вклада в годах:");

        period = scanner.nextInt();

        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");

        action = scanner.nextInt();

        double out = 0;

        if (action == 1) {
            out = CalculateSimplePercent(amount, 0.06, period);
        } else if (action == 2) {
            out = CalculateComplexPercent(amount, 0.06, period);
        }
        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + out);
    }


}
