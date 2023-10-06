package java09;

class Crational {
    int n;
    int d;

    void setn(int num) { // 設定分子
        n = num;
    }

    void setd(int num) { // 設定分母
        d = num;
    }

    void setnd(int num, int den) { // 同時設定分子、分母
        n = num;
        d = den;
    }

    void show() {
        System.out.println(n + "/" + d);
    }
}

public class class10 {
    public static void main(String[] args) {

        Crational aaa = new Crational();
        aaa.setn(10);
        aaa.setd(2);
        aaa.show();
    }
}
