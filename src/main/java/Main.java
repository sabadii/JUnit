import java.util.Scanner;

class Main {


    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax1 = (earnings - spendings) * 15 / 100;
        if (tax1 >= 0) {
            return tax1;
        } else {
            return 0;
        }
    }

    public static int taxEarnings(int earnings) {
        int tax2 = earnings * 6 / 100;
        if (tax2 >= 0) {
            return tax2;
        } else {
            return 0;
        }
    }


    public static void bestTax(int earnings, int spendings) {
        int tax1 = taxEarningsMinusSpendings(earnings, spendings);
        int tax2 = taxEarnings(earnings);

        if (tax1 < tax2) {
            System.out.println("Мы советуем вам УСН доходы-расходы");
            System.out.println("Ваш налог составит: " + tax1);
            System.out.println("Налог на другой системе: " + tax2);
            System.out.println("Экономия: " + (tax2 - tax1));

        } else {
            System.out.println("Мы советуем вам УСН доходы");
            System.out.println("Ваш налог составит: " + tax2);
            System.out.println("Налог на другой системе: " + tax1);
            System.out.println("Экономия: " + (tax1 - tax2));

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int earnings = 0;
        int spendings = 0;


        while (true) {
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать ситему налогооблажения");

            String input = scanner.nextLine();
            if ("end".equals(input)) {
                System.out.println("Программа завершена!");
                break;
            }
            int operation = Integer.parseInt(input);
            switch (operation) {

                case 1:
                    System.out.println("Введите сумму дохода:");
                    String moneyStr = scanner.nextLine();
                    int money = Integer.parseInt(moneyStr);
                    earnings += money;
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    String costStr = scanner.nextLine();
                    int cost = Integer.parseInt(costStr);
                    spendings += cost;
                    break;
                case 3:
                    bestTax(earnings, spendings);
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }
    }


}