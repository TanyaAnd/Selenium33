
/*
BoxConstructor використовує конструктор для ініціалізації розмірів блоку
 */

class BoxConstructor {
    double width;
    double height;
    double depth;

    // Це конструктор класу BoxConstructor

    BoxConstructor () {
        System.out.println("Створення BoxConstructor:");
        width = 10;
        height = 10;
        depth = 10;
    }

    // вирахувати і повернути об'єм

    double volume () {
        return width * height * depth;
    }
}

class BoxDemo6 {
    public static void main(String args[]){
        // об'явити, розмістити в пам'яті та ініціалізувати BoxConstructor об'єкти

        BoxConstructor myBox1 = new BoxConstructor();
        BoxConstructor myBox2 = new BoxConstructor();

        double vol;

        // отримати об'єм першого блоку

        vol = myBox1.volume();
        System.out.println("Об'єм дорівнює " + vol);

        // отримати об'єм другого блоку

        vol = myBox2.volume();
        System.out.println("Об'єм дорівнює " + vol);
    }
}
