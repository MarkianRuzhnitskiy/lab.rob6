package com.company;

class Сomputers extends HardwareStore {
    private String nameСomputers;
    private int priceСomputers;
    private int goodsСomputers;

    Сomputers(String nameСomputers, int priceСomputers, int goodsСomputers, String name, int price, int goods) {
        super(name, price, goods);
        this.nameСomputers = nameСomputers;
        this.priceСomputers = priceСomputers;
        this.goodsСomputers = goodsСomputers;
    }

    Сomputers(String nameСomputers, String name, int price, int goods){
        super(name, price, goods);
        this.nameСomputers = nameСomputers;
    }

    void menuTwo(){
        menuOne();
        System.out.println("У нас ви можете купити комп'ютерну техніку");
    }

    int cheakСomputers(){
        int request = 0;
        if (goodsСomputers == 0){
            System.out.println("Нажаль все розкупили");
            request++;
        }
        else {
            System.out.println("Таких товарів є " + goodsСomputers);
        }
        return request;
    }

    double cheakСomputers(int goodsСomputers){
        int request = 0;
        if (goodsСomputers == 0){
            System.out.println("Нажаль все розкупили");
            request++;
        }
        else {
            System.out.println("Таких товарів є " + goodsСomputers);
        }
        return request;
    }

    void nameCheck(String nameMonitor){
        if (nameMonitor.equals("Asus")){
            System.out.println("У нас є блок такої ж марки");
        }
        else if (nameMonitor.equals("Aser")){
            System.out.println("У нас є блок такої ж марки");
        }
        else{
            System.out.println("У нас немає блоку такої ж марки !");
        }
    }

    void checkComponents(Сomponents o, Monitors b){
        int component1 = o.getProcessor();
        int component2 = o.getMotherboard();
        String component3 = b.getNameMonitors();

        if ((component1 != 0) && (component2 != 0) && (component3.equals("Lenovo"))){
            System.out.println("немає таких компонентів !");
        }
        else{
            System.out.println("Усі компоненти є !");
        }

    }

    public String getNameСomputers() {
        return nameСomputers;
    }

    public void setNameСomputers(String nameСomputers) {
        this.nameСomputers = nameСomputers;
    }

    public int getPriceСomputers() {
        return priceСomputers;
    }

    public void setPriceСomputers(int priceСomputers) {
        this.priceСomputers = priceСomputers;
    }

    public int getGoodsСomputers() {
        return goodsСomputers;
    }

    public void setGoodsСomputers(int goodsСomputers) {
        this.goodsСomputers = goodsСomputers;
    }
}
