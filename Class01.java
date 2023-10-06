/// *1, 3 , *5, 6, *7, 8 , 10a, 10b, *15, *16,  *17, 18,19
package java09;

class CRectangle {

    int width;
    int height;

    CRectangle(int w, int h) {
        width = w;
        height = h;
    }

    // public CRectangle() {
    //     width = 10;
    //     height = 8;
    // }

    public CRectangle() {
        this(10, 8);
    }
}

public class Class01 {
    public static void main(String[] args) {
        CRectangle rectangle1 = new CRectangle(); // 無引數建構元，width=10，height=8
        CRectangle rectangle2 = new CRectangle(5, 12); // 有引數建構元，width=5，height=12

    }
}
