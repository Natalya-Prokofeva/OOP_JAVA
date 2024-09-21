public class Main {
    public static void main(String[] args) {
        ГорячихНапитковАвтомат автомат = new ГорячихНапитковАвтомат();

        // Создание горячих напитков
        ГорячийНапитокСТемпературой кофе = new ГорячийНапитокСТемпературой("Кофе", 200, 80);
        ГорячийНапитокСТемпературой чай = new ГорячийНапитокСТемпературой("Чай", 150, 75);

        // Добавление продуктов в автомат
        автомат.addProduct(кофе);
        автомат.addProduct(чай);

        // Получение продукта из автомата
        ГорячийНапиток напиток = автомат.getProduct("Кофе", 200, 80);
        if (напиток != null) {
            System.out.println("Выдан напиток: " + напиток.getName());
        } else {
            System.out.println("Напиток не найден");
        }
    }
}
