
/*
Тут клас BoxPConstructor використовує параметризований конструктор для ініціалізації розмірів блоку
 */

class BoxPConstructor {
    double width;
    double height;
    double depth;

    // Це конструктор класу BoxPConstructor

    BoxPConstructor (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // вирахувати і повернути об'єм

    double volume () {
        return width * height * depth;
    }
}

class BoxDemo7 {
    public static void main(String args[]) {
        // об'явити, розмістити в пам'яті та ініціалізувати BoxPConstructor об'єкти

        BoxPConstructor myBox1 = new BoxPConstructor(5, 6, 7);
        BoxPConstructor myBox2 = new BoxPConstructor(8, 9, 6);

        double vol;

        // отримати об'єм першого блоку

        vol = myBox1.volume();
        System.out.println("Об'єм дорівнює " + vol);

        // отримати об'єм другого блоку

        vol = myBox2.volume();
        System.out.println("Об'єм дорівнює " + vol);
    }
}
