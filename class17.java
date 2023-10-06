package java09;

class namecard {
    private String name;
    private String address;
    private phone data;

    class phone {
        public String company;
        public String cell;

        public phone(String s1, String s2) {                            // 設定company和cell的值
            this.company = s1;
            this.cell = s2;
        }
    }

    namecard(String name, String address, String company, String cell) { // 初始化name和address
        this.name = name;
        this.address = address;
        this.data = new phone(company, cell);
    }

    void show() {
        System.out.println("好友姓名: " + name);
        System.out.println("聯絡地址: " + address);
        System.out.println("公司電話: " + data.company);
        System.out.println("手機號碼: " + data.cell);
    }
}

public class class17 {
    public static void main(String[] args) {

        namecard first = new namecard("Andy", "123City", "2345-6789", "0911-336600");
        first.show();
    }
}
