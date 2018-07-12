package one;
public class Instruments {
    public static void main(String[] args){
        Instrument instrument[] = new Instrument[10];

        for(int i=0;i<instrument.length;i++){
            if(i==1||i==3||i==5){
                instrument[i]=new Piano();
            }
            else if(i==2||i==4||i==6){
                instrument[i]=new Flute();
            }
            else{
                instrument[i]=new Guitar();
            }

            instrument[i].play();

            if(instrument[i] instanceof Piano){
                System.out.println("Index "+i+" is an instance of Piano");
            }
            else if(instrument[i] instanceof Flute){
                System.out.println("Index "+i+" is an instance of Flute");
            }
            else if(instrument[i] instanceof Guitar){
                System.out.println("Index "+i+" is an instance of Guitar");
            }
        }

    }
}

