package com.company;

class Monitors extends Сomputers {
    private String nameMonitors;
    private int priceMonitors;
    private int goodsMonitors;

    Monitors(String nameMonitors, int priceMonitors, int goodsMonitors, String nameСomputers, int priceСomputers, int goodsСomputers, String name, int price, int goods){
        super(nameСomputers, priceСomputers, goodsСomputers, name, price, goods);
        this.nameMonitors = nameMonitors;
        this.priceMonitors = priceMonitors;
        this.goodsMonitors = goodsMonitors;
    }

    void menuThird(){
        menuTwo();
        System.out.println("можете перевірити наявність товарі нижче");
    }

    int gigahertz(){
        int gigahertzMonitor60 = 0;
        if (goodsMonitors > 5){
            gigahertzMonitor60 = 5;
            System.out.println("лишилося п'ять 60 герцових моніторів");
        }
        else{
            System.out.println("немає 60 герцових моніторів !");
        }
        return gigahertzMonitor60;
    }

    static void approximatePrices(int ... x){
        System.out.println("Приблизні цінові ліміти: " + x.length);
        for (int y : x) {
            System.out.println("Ліміти " + y);
        }
    }

    public String getNameMonitors() {
        return nameMonitors;
    }

    public void setNameMonitors(String nameMonitors) {
        this.nameMonitors = nameMonitors;
    }

    public int getPriceMonitors() {
        return priceMonitors;
    }

    public void setPriceMonitors(int priceMonitors) {
        this.priceMonitors = priceMonitors;
    }

    public int getGoodsMonitors() {
        return goodsMonitors;
    }

    public void setGoodsMonitors(int goodsMonitors) {
        this.goodsMonitors = goodsMonitors;
    }
}
