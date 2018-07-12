package polymorphism5;

public class SportsCar extends Car {
    private int initialSpeed,gearStatus;
    public void airBalloonType()
    {
        initialSpeed=100;
        gearStatus=4;
    }
    public void display()
    {
        super.display();
        System.out.println("the initial speed is"+initialSpeed);
        System.out.println("the gear status is"+gearStatus);
    }
}
