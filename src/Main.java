import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Здорова, задолбал! Заходи, подскажу курс! 💰\n");
        start();
    }

    static void start() {
        Scanner scanner = new Scanner(System.in);

        // Братанский вопрос про бабки
        System.out.println("\nСлушай, сколько у тебя рублей-то? Вбей цифру:");
        int rubles = scanner.nextInt();

        if (rubles <= 0) {
            System.out.println("Внатуре? Давай по-пацански, введи нормально! 😐");
            start(); // Перезапускаем, если троллит
            return;
        }

        // Выбор валюты в стиле "разговор на лавочке"
        System.out.println("\nНу и чё тебе надо, говори:");
        System.out.println("1. Баксы (USD) — зелёные, качают бицуху 💵");
        System.out.println("2. Еврики (EUR) — там мосты, типа культурно 🌉");
        System.out.println("3. Крипта? (Шутка, но вдруг?) 🚀");

        int choice = scanner.nextInt();

        // Конвертация с братанскими комментариями
        String result = convertCurrency(rubles, choice);
        System.out.println("\n⚡ Воу, держи результат: ⚡");
        System.out.println(rubles + "₽ — это " + result + "!");
        System.out.println("(Ну такое, конечно, но лучше, чем ничего 😅)");

        // Предложение замутить ещё раз
        System.out.println("\nЧё, ещё разок прогоним? (1 - Да, 0 - Нет, я в шоке)");
        int again = scanner.nextInt();
        if (again == 1) {
            System.out.println("Окей, поехали снова! 🔄");
            start();
        } else {
            System.out.println("\nНу ладно, братюнь, иди трать! 😎✌️");
        }
    }

    static String convertCurrency(int rubles, int choice) {
        double rubToUsd = 0.012; // Курс, будто ты меняешь у "того чела"
        double rubToEur = 0.011;  // Ну такое, но братан не врет

        switch (choice) {
            case 1:
                double usd = rubles * rubToUsd;
                return String.format("%.2f$ (на пивко 🍺 хватит!)", usd);
            case 2:
                double eur = rubles * rubToEur;
                return String.format("%.2f€ (может, на круассан? 🥐)", eur);
            case 3:
                return "0.0₿ (ну ты и мечтатель, бро 😂)";
            default:
                return "чё? Ты че ввёл, а? Давай по новой...";
        }
    }
}