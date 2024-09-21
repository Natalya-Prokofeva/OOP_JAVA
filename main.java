// Главный класс программы
public class Main {
    public static void main(String[] args) {
        СпецифическийГорячийНапиток[] напитки = {
            new СпецифическийГорячийНапиток("Кофе", 250, 70),
            new СпецифическийГорячийНапиток("Чай", 200, 80),
            new СпецифическийГорячийНапиток("Какао", 300, 75)
        };

        ГорячихНапитковАвтомат автомат = new ГорячихНапитковАвтомат(напитки);

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Введите название напитка, объем и температуру:");
        String name = scanner.nextLine();
        int volume = scanner.nextInt();
        int temperature = scanner.nextInt();

        ГорячийНапиток выбранныйНапиток = автомат.getProduct(name, volume, temperature);
        if (выбранныйНапиток != null) {
            System.out.println("Вы получили: " + выбранныйНапиток);
        }
    }
}
