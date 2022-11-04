package ba.rpr;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String unos = "";
        Scanner in = new Scanner(System.in);
        ArrayList<Double> lista = new ArrayList<Double>();
        for(;;){
            unos = in.nextLine();
            if(unos.equals("stop")) break;
            try{
                lista.add(Double.parseDouble(unos));
            }
            catch(Exception e){
                System.out.println("Nije unesen broj, pokusajte ponovo");
                continue;
            }
        }
        System.out.println("Niz broejva je: " + lista);
        System.out.print("Najmanji broj je: " + Statistika.min(lista) +
                      "\n Najveci broj je: " + Statistika.max(lista) +
                      "\n Srednja vrijednost je: " + Statistika.srednjaVrijednost(lista) +
                      "\n Standardna devijacija je: " + Statistika.standardnaDevijacija(lista));
    }

}
