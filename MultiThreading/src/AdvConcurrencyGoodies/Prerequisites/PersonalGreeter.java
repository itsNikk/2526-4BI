package AdvConcurrencyGoodies.Prerequisites;

public class PersonalGreeter implements Greetable{
    @Override
    public void greet() {
        System.out.println("Hello!");
    }
}
