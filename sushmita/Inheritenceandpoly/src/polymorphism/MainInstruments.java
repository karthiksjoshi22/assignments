package polymorphism;

public class MainInstruments
{
    public static void main(String[] args)
    {
        Instrument[] all = new Instrument[10];

       for(int i=0;i<10;i++)
       {
           if(i==1||i==3||i==5){
               all[i]=new Piano();
           }
           else if(i==2||i==4||i==6){
               all[i]=new Flute();
           }
           else{
               all[i]=new Guitar();
           }
           all[i].play();
           if(all[i] instanceof Piano){
               System.out.println("the index is\t"+i+"\tIt is an instance of piano");
           }
           if(all[i] instanceof Flute){
               System.out.println("the index is\t"+i+"\tIt is an instance of Flute");
           }
           if(all[i] instanceof Guitar){
               System.out.println("the index is\t"+i+"\tIt is an instance of Guitar");
           }
       }
    }
}
