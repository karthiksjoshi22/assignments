package Rangle;

public class Rectangle {
    public double len;
    public double breadth;


    public Rectangle()
    {
        len=0;
        breadth=0;
    }
    public Rectangle(double l,double b)
    {
        len=l;
        breadth=b;
    }
    public void setlength(double l)
    {
        len=l;
    }
    public void setbreadth(double b)
    {
        breadth=b;
    }
    public double area()
    {
        return len*breadth;
    }
    public double perimeter()
    {
        return 2*(len+breadth);
    }
    public String display()
    {
        return ("\n Length : "+len+"\t Breadth : "+breadth+"\n Area of Rectangle : "+area()+"\n perimeter of rectangle:"+perimeter());
    }
}
