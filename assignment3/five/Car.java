package five;

public class Car {
    double speed;
    int noOfGear;
    public void drive(){
        speed=500;
        noOfGear=5;
    }
    public void display(){
        System.out.println("the speed : "+speed);
        System.out.println("the number of gears : "+noOfGear);
    }
}
