# oop_les5_opdracht1_bedrijf_arraylist
1. Arraylist
2. for-each + instance of
3. for-each + methode --> om data te printen

1. // maak een arraylist
        ArrayList<Persoon> personenArrayList = new ArrayList<>();
        personenArrayList.add(new Werknemer("Mark", "Den Haag", afdeling[2], 10000));
        personenArrayList.add(new Werknemer("Caroline", "Delf", afdeling[1], 4000));
        personenArrayList.add(new Zzper("Klaas", "Diemen", afdeling[0], 50.00));
        personenArrayList.add(new Zzper("Ronals", "Zaandam", afdeling[0], 80.00));
        personenArrayList.add(new Zzper("Jannie", "Utrecht", afdeling[0], 60.00));
        personenArrayList.add(new Zzper("Anne", "Zwolle", afdeling[0], 40.00));

2. // gebruik for-each met instanceof om alle zzp'ers in te huren voor 320 uur
        for (Persoon persoon : personenArrayList){ // for each loop zegt: voor elk datatype : [:=in] in de array met de naam ... doe...
            if (persoon instanceof Zzper){ // instance of zegt parent is persoon en de instantie is zzper (is A relatie)
                ((Zzper) persoon).huurIn(320); // type casten in, om zo bij de methode huurIn te kunnen komen
                ((Zzper) persoon).huurIn(320);
            }
        }

3. // gebruik for-each om de toonJaarInkomen() te printen
        for (Persoon persoon : personenArrayList){
            toonJaarInkomen(persoon);
        }
    }