package pro5;

public class Car {
    private int speed, noOfGear;
    public void drive(){
        speed=120;
        noOfGear=5;
    }
    public void display(){
        System.out.println("speed is "+speed);
        System.out.println("no of Gear is "+noOfGear);
    }
}
