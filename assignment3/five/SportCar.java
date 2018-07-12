package five;

public class SportCar extends Car {
    int initialSpeed ;
    int gearStatus;
    public void airBallonType(){
        initialSpeed=120;
        gearStatus=2;
    }
    public void display(){
        super.display();
        System.out.println("Initial speed : "+initialSpeed+" | "+"Gear Status : "+gearStatus);
    }
}
