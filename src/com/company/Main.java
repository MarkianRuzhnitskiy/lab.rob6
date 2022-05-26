package com.company;

public class Main {

    public static void main(String[] args) {
        HardwareStore hardwareStore = new HardwareStore("Lenovo", 400, 2 );
        Сomputers computers1 = new Сomputers("Lenovo", 600, 1, hardwareStore.getName(), hardwareStore.getPrice(), hardwareStore.getGoods());
        Сomputers computers2 = new Сomputers("Lenovo", hardwareStore.getName(), hardwareStore.getPrice(), hardwareStore.getGoods());
        Monitors monitors = new Monitors("lenovo", 500, 1, computers1.getNameСomputers(), computers1.getPriceСomputers(), computers1.getGoodsСomputers(), hardwareStore.getName(), hardwareStore.getPrice(), hardwareStore.getGoods());
        Сomponents components = new Сomponents(0, 0, computers1.getNameСomputers(), computers1.getPriceСomputers(), computers1.getGoodsСomputers(), hardwareStore.getName(), hardwareStore.getPrice(), hardwareStore.getGoods());


        monitors.menuThird();
        System.out.println("--------------------------");
        System.out.println("Перевірте ім'я товару");
        hardwareStore.nameCheck();
        System.out.println("--------------------------");
        System.out.println("Ваш ліміт");
        hardwareStore.priceLimit();
        System.out.println("--------------------------");
        System.out.println("перевірка комп'ютерів");
        computers1.cheakСomputers();
        computers1.cheakСomputers(5);
        System.out.println("--------------------------");
        System.out.println("Перевірка імені");
        computers1.nameCheck();
        System.out.println("--------------------------");
        System.out.println("перевірка компонент");
        computers1.checkComponents(components,monitors);
        System.out.println("--------------------------");
        System.out.println("виберіть герцовку монітора");
        monitors.gigahertz();
        System.out.println("--------------------------");
        System.out.println("Де ви можете придбати ваше замовлення");
        components.Access();






    }
}
