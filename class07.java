package java09;

class calcualtepower {
    int x;
    int n;

    double setpower(int x, int n) {
        return Math.pow(x, n);
    }
}

public class class07 {
    public static void main(String[] args) {
        calcualtepower number1 = new calcualtepower();
        System.out.println(number1.setpower(5, 0));
        System.out.println(number1.setpower(5, 2));
    }
}
