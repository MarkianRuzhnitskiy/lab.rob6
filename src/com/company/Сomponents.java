package com.company;

class Сomponents extends Сomputers {
    private int motherboard;
    private int processor;

    Сomponents(int motherboard, int processor, String nameСomputers, int priceСomputers, int goodsСomputers, String name, int price, int goods){
        super(nameСomputers, priceСomputers, goodsСomputers, name, price, goods);
        this.motherboard = motherboard;
        this.processor = processor;
    }

    void Access(){
        СomponentsBrand componentsBrand = new СomponentsBrand();
        componentsBrand.brand();
    }

    class СomponentsBrand {
        void brand() {
            if ((motherboard == 0) && (processor == 0)) {
                System.out.println("ви можете зробити замовлення тут https://www.asus.com/ua-ua/");
            }
            else{
                System.out.println("Ви можете придбати усе в нас");
            }

        }
    }

    public int getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(int motherboard) {
        this.motherboard = motherboard;
    }

    public int getProcessor() {
        return processor;
    }

    public void setProcessor(int processor) {
        this.processor = processor;
    }
}
