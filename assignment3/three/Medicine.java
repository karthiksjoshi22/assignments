package three;

//class Medicine represents a drug manufactured by a pharmaceutical company.
public class Medicine {
    String companyName;
    String companyAddress;
    Medicine(){
        companyName="Cipla";
        companyAddress="Plot No. 285, Bommasandra-Jigani Link Road, Industrial Area, KIADB, Bengaluru, Karnataka 560105";
    }
    public void displayLabel(){
        System.out.println("The medicines are from "+companyName);
        System.out.println("The company is situated in "+companyAddress);
    }
}
