package pro2;

public class Rectangle {
    private float len;
    private float bre;
    private float area;
   Rectangle(){
        len=0;
        bre=0;
    }
    Rectangle(float len, float bre){
        this.len=len;
        this.bre=bre;
    }

    public float getLen() {
       return len;
    }

    public void setLen(float len) {
       this.len = len;
    }

    public float getBre() {
       return bre;
    }

    public void setBre(float bre) {
       this.bre = bre;
    }

    public float area(){
      area=len*bre;
      return area;
   }
}
