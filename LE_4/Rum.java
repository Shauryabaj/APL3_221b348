class Rum {
    void pour(){
        System.out.println("Pour 50ml of Rum in a glass");
    }
    void add(){
        System.out.println("Add some soda");
    }
    void stir(){
        System.out.println("Stir for 30 seconds");
    }
    void serve(){
        System.out.println("Serve through waiter");
    }
    public void templateMethod() {
        pour();
        add();
        stir();
        serve();
    }
}
