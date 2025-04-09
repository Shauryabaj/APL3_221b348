class Test {
    public static void main(String args[]) {
        Offering off = new Coffee();
        off = new Rum(off);
        off = new Rum(off);
        System.out.println(off.getName() + " " + off.getPrice());
    }
}