class RubberDuck implements Duck, SwimBehavior, SqueakBehavior {
    public void display() {
        System.out.println("I am a Rubber Duck!");
    }
    
    public void performSwim() {
        swim();
    }
    
    public void swim() {
        System.out.println("Rubber Duck swims.");
    }
    
    public void squeak() {
        System.out.println("Rubber Duck squeaks!");
    }
}