class WoodenDuck implements Duck, SwimBehavior {
    public void display() {
        System.out.println("I am a Wooden Duck!");
    }
    
    public void performSwim() {
        swim();
    }
    
    public void swim() {
        System.out.println("Wooden Duck swims.");
    }
}