package polymorphism3;

public class TestMedicine {
    public static void main(String[] args)
    {


        Medicine m[]=new Medicine[10];

        for(int i=0;i<10;i++) {
            double x = Math.random() * 4;

            int answer = (int) x;
            System.out.println(answer);
            switch (answer) {
                case 1:
                    m[0] = new Tablet();
                    m[0].displayLabel();
                    break;
                case 2:
                    m[1] = new Syrup();
                    m[1].displayLabel();
                    break;
                case 3:
                    m[2] = new Ointment();
                    m[2].displayLabel();
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }
    }
}
