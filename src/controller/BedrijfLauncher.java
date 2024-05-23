package controller;
import model.Afdeling;
import model.Persoon;
import model.Werknemer;
import model.Zzper;


public class BedrijfLauncher {
    public static void main(String[] args) {
        // maak array met afdelingen, vul hem daarna
        Afdeling[] afdeling = new Afdeling[4];
        afdeling[0] = new Afdeling("Uitvoering", "Hilverum");
        afdeling[1] = new Afdeling("Support", "Amsterdam");
        afdeling[2] = new Afdeling("Management", "Almere");
        afdeling[3] = new Afdeling("Documentatie", "Gouda");

        // maak medewerkers / zzp'ers gebruik polymorfisme
        Persoon baas = new Werknemer("Mark", "Den Haag", afdeling[2], 10000);
        Persoon medewerker = new Werknemer("Caroline", "Delf", afdeling[1], 4000);
        Persoon assistent = new Zzper("Klaas", "Diemen", afdeling[0], 50.00);
        Persoon projectleider = new Zzper("Ronals", "Zaandam", afdeling[0], 80.00);

        //aantal uren inhuur zzp'ers
        ((Zzper) assistent).huurIn(160); // je moet hem eerst casten naar zzper, daar staat de methode die je wil benaderen
        ((Zzper) projectleider).huurIn(320);

        //maak een Persoon array met 4 objecten
        Persoon[] personen = new Persoon[4];
        personen[0] = baas;
        personen[1] = medewerker;
        personen[2] = assistent;
        personen[3] = projectleider;

        // gebruik forloop om de items te printen
        for (int i = 0; i < personen.length; i++) {
            toonJaarInkomen(personen[i]);
        }
    }

    // methode om het jaarinkomen te tonen
    public static void toonJaarInkomen(Persoon persoon){
        System.out.printf("%s verdient %.2f per jaar\n", persoon.getNaam(), persoon.berekenJaarInkomen());
    }

}
