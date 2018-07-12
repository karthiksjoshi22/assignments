package pro5;

public class SportCar extends Car {
    private int inspeed, initialgear;
    public void AirBallonType(){
        inspeed=30;
        initialgear=2;

    }
    public void display(){
        System.out.println("initial speed is "+inspeed);
        System.out.println("initial noOfGear is "+initialgear);
        super.display();
    }
}
