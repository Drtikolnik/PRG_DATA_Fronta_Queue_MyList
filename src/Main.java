import java.util.*;

void main() {
    Scanner sc = new Scanner(System.in);

    Fronta fronta = new Fronta();

    fronta.add("Uklízeč", "Pavel", "žádné", 65);
    fronta.add("Uklízeč", "Candy", "vysoká škola života", 78);
    fronta.add("Manager", "mr", "byznis", 16);
    fronta.add("vládce vesmíru", "pedagog", "dogma", 99999);
    fronta.add("matematyk", "kvik", "mats", 25+5-4);

    System.out.println("Počáteční fronta:");
    fronta.printAll();
    System.out.println("-----------");
    //fronta.nakouknutiNaDalsiho();
    System.out.println("");





    boolean pokracovat = true;
    while(pokracovat){
        System.out.println("---MENU---");
        System.out.println("1 - Příchod noého uchazeče");//
        System.out.println("2 - Obsloužení uchazeče");//
        System.out.println("3 - Výpis všech uchazečů ve frontě");//
        System.out.println("4 - Nakouknutí na dalšího");//
        System.out.println("5 - Filtrování podle pozice");//
        System.out.println("6 - Ulož frontu do souboru");//fungujeeeeee
        System.out.println("7 - Vymazání celé fronty");
        System.out.println("8 - KONEC");//
        int vyber =  sc.nextInt();
        sc.nextLine();

        switch (vyber){
            case 1:
                System.out.println("--ZADEJ ÚDAJE--");
                System.out.println("jmeno:");
                String jmeno = sc.nextLine();
                System.out.println("vzdelani:");
                String vzdelani = sc.nextLine();
                System.out.println("vek:");
                int vek = sc.nextInt(); sc.nextLine();
                System.out.println("uchazena pozice:");
                String pozice = sc.nextLine();

                fronta.add(pozice, jmeno, vzdelani, vek);
                break;


            case 2:
                fronta.obslouzeniUchazece();
                break;


            case 3:
                fronta.printAll();
                break;


            case 4:
                fronta.nakouknutiNaDalsiho();
                break;


            case 5:
                System.out.println("zadej pozici:");
                String zadanaPozice = sc.nextLine();
                fronta.vypsatPodlePozice(zadanaPozice);
                break;


            case 6:
                fronta.ulozitDoJSON();
                break;


            case 7:
                fronta.deleteAll();
                break;


            case 8:
                pokracovat = false;
                break;
        }


















    }



































}
