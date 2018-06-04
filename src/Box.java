
// ця програма використовує параметризований метод

public class Box {
    double width;
    double height;
    double depth;

    // обрахувати та повернути об'єм

    double volume () {
        return width * height * depth;
    }

    // встановити розміри блоку

    void setDim (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

}

class BoxDemo5 {
    public static void main (String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        // ініціалізувати кожний блок

        mybox1.setDim(5,6,7);
        mybox2.setDim(1,2,3);

        // отримати об'єм першого блоку

        vol = mybox1.volume();
        System.out.println("Об'єм рівний:" + vol);
    }
}

