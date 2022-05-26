package com.company;

class HardwareStore {
    private String name;
    private int price;
    private int goods;

    HardwareStore(String name, int price, int goods) {
        this.name = name;
        this.price = price;
        this.goods = goods;
    }

    void menuOne(){
        System.out.println("Вітаємо в нашому магазині");
    }

    void nameCheck(){
        if (name.equals("Asus")){
            System.out.println("Товар продається в магазині");
        }
        else if (name.equals("Aser")){
            System.out.println("Товар продається в магазині");
        }
        else{
            System.out.println("Такого товару немає в магазині !");
        }
    }

    int priceLimit(){
        if ((price < 5000)){
            System.out.println("На такому ціновому ліміті немає товарів!");
        }
        else if (price >= 5000){
            System.out.println("Таких товарів є " + goods);

        }
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getGoods() {
        return goods;
    }

    public void setGoods(int goods) {
        this.goods = goods;
    }
}
