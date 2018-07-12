package polymorphism5;

public class Car {
    private int speed,noOfGear;
    public void drive()
    {
        speed=40;
        noOfGear=2;
    }
    public void display()
    {
        System.out.println("the starting speed is"+"\t"+speed);
        System.out.println("the number of gears are"+"\t"+noOfGear);
    }
}
