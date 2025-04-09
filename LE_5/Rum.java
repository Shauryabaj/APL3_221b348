class Rum extends Decorator {
    Rum(Offering off) {
        this.off = off;
    }
    
    int getPrice() {
        return off.getPrice() + 55;
    }
    
    String getName() {
        return off.getName() + " with Rum";
    }
    
}