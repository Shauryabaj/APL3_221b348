class Mother {
    int x;
    void show() {
        System.out.println("Show of Mother");
    }
}

class Child extends Mother {
    void show() {
        System.out.println("Show of Child");
    }
}

class Main {
    public static void main(String[] args) {
        Mother m1 = new Child();
        m1.show();
    }
}
