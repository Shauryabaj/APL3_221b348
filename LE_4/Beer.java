class Beer {
    void pour(){
        System.out.println("Pour 30ml of Beer in a glass");
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
