import java.util.Scanner;

public class Tafel {
public static void main(String[]args){
new Scanner(System.in);
Scanner s = new Scanner(System.in);
System.out.println("Voer een getal in om de tafel af te drukken: ");
    int getal = s.nextInt();
    System.out.println("De tafel van "+getal+ " is:");
    for (int i=1; i<=10; i++) {
        System.out.println(i + " x " + getal + " = " + getal * i);
    }
    System.out.println("Bedankt! :-)") ;
    }

}

