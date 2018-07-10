package rect4;

public class Rectangle4 {
    private double length;
    private double width;


    public Rectangle4()
    {
        length=0;
        width=0;
    }
    public Rectangle4(double length,double breadth)
    {
        this.length=length;
        this.width=breadth;
    }
    public int setLength(double length)
    {
        int x = 0;
        if (length <= 0 || length > 20) {
            System.out.println("length is not in range");
            return x;
        }
        this.length = length;
        return (x = 1);
    }
    public int setWidth(double width)
    {
        int y = 0;
        if (width <= 0 || width > 20)
        {
            System.out.println("width is not in range");
            return y;
        }
        this.width = width;
        return (y = 1);
    }
    public double area()
    {
        return length*width;
    }
    public double perimeter()
    {
        return 2*(length+width);
    }
    public String display()
    {
        return ("\n Length : "+length+"\t Breadth : "+width+"\n Area of Rectangle : "+area()+"\n perimeter of rectangle:"+perimeter());
    }
}


