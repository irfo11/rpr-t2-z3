package ba.rpr;
import java.util.List;
public class Statistika {

    public static Double min(List<Double> brojevi){
        if(brojevi.size() == 0) {
            System.out.println("Lista je prazna");
            System.exit(-1);
        }
        double minimalniBroj = brojevi.get(0);
        for (double broj : brojevi)
            if (broj < minimalniBroj)
                minimalniBroj = broj;
        return minimalniBroj;
    }

    public static Double max(List<Double> brojevi){
        if(brojevi.size() == 0) {
            System.out.println("Lista je prazna");
            System.exit(-1);
        }
        double maksimalniBroj = brojevi.get(0);
        for (double broj : brojevi)
            if (broj > maksimalniBroj)
                maksimalniBroj = broj;
        return maksimalniBroj;
    }

    public static Double srednjaVrijednost(List<Double> brojevi){
        if(brojevi.size() == 0) {
            System.out.println("Lista je prazna");
            System.exit(-1);
        }
        double suma = 0;
        for(double broj : brojevi){
            suma += broj;
        }
        return  suma/brojevi.size();
    }

    public static Double standardnaDevijacija(List<Double> brojevi){
        if(brojevi.size() == 0) {
            System.out.println("Lista je prazna");
            System.exit(-1);
        }
        double srednjaVr = srednjaVrijednost(brojevi);
        double devijacija = 0;
        for(double broj : brojevi){
            devijacija += (broj - srednjaVr)*(broj - srednjaVr);
        }
        return Math.sqrt( devijacija / brojevi.size() );
    }
}

