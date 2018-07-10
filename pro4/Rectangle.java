package pro4;

public class Rectangle {
    private double length;
    private double width;

    Rectangle(){
        length=0;
        width=0;
    }
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }


    public double getWidth() {
        return width;
    }

    public int setLength(double length) {
        int y=0 ;
        this.length = length;
        if(this.length<=0 || this.length>20){
            System.out.println("Error..Number out of range ");
            return y;
        }
        return (y=1);
    }

    public int setWidth(double width) {
        int z=0 ;
        this.width = width;
        if(this.width<=0 || this.width>20){
            System.out.println("Error..Number out of range ");
            return z;
        }
        return (z=1);
    }

    public double area(){
        return (length*width);
    }
    public double perimeter() {
        return (2*(length+width));
    }

}
