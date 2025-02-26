class LakeDuck implements Duck, SwimBehavior, FlyBehavior, QuackBehavior {
    public void display() {
        System.out.println("I am a Lake Duck!");
    }

    public void performSwim() {
        swim();
    }
    
    public void swim() {
        System.out.println("Lake Duck swims.");
    }

    public void fly() {
        System.out.println("Lake Duck flies!");
    }

    public void quack() {
        System.out.println("Lake Duck quacks!");
    }
}