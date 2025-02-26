class RedHeadDuck implements Duck, SwimBehavior, FlyBehavior, QuackBehavior {
    public void display() {
        System.out.println("I am a RedHead Duck!");
    }

    public void performSwim() {
        swim();
    }
    
    public void swim() {
        System.out.println("RedHead Duck swims.");
    }

    public void fly() {
        System.out.println("RedHead Duck flies!");
    }

    public void quack() {
        System.out.println("RedHead Duck quacks!");
    }
}