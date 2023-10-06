package java09;

class CCount {
    private int cnt = 0;            // 初始值為0

    void count() {                  // count函數，每次呼叫都將cnt加1
        cnt++;
    }

    int getCnt() {                  // 取得cnt的值
        return cnt;
    }

    void setZero() {                // 將cnt重置为0
        cnt = 0;
    }
    void setValue(int n){           //將cnt設為n
        cnt = n;
    }
}

public class class05 {
    public static void main(String[] args) {
        CCount counter1 = new CCount();
        counter1.count();
        counter1.count();
        counter1.count();
        int count1 = counter1.getCnt();                     // count1為3

        CCount counter2 = new CCount();
        counter2.count();
        int count2 = counter2.getCnt();                     // count2為1

        System.out.println("counter1 的 cnt：" + count1);
        System.out.println("counter2 的 cnt：" + count2);

        counter1.setZero();                                 // cnt重置為0
        int count1afterreset = counter1.getCnt();           // count1afterreset 為0
        System.out.println("counter1 重置后的 cnt：" + count1afterreset);


        CCount counter3 = new CCount();
        counter3.setValue(3);                           //將cnt設為3
        System.out.println(counter3.getCnt());
    }
}
