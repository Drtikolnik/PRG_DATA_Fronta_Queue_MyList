import LIFO.Predmet;
import LIFO.Zasobnik;
import java.util.*;

void main() {
    Scanner sc = new Scanner(System.in);

    Zasobnik z = new Zasobnik();

    boolean pokracovat = true;
    while(pokracovat){
        System.out.println("---MENU---");
        System.out.println("1 - Přidat nový item");//
        System.out.println("2 - Použít item");//
        System.out.println("3 - Vypsat inventář");//
        System.out.println("4 - Nakouknutí do batohu");//
        System.out.println("5 - Filtrování podle typu");//
        System.out.println("6 - Rozšíření kapacity");//
        System.out.println("7 - KONEC");
        int vyber =  sc.nextInt();
        sc.nextLine();

        switch (vyber){
            case 1:
                z.push();
                break;


            case 2:
                z.pop();
                break;


            case 3:
                z.printAll();
                break;


            case 4:
                z.nakouknutiDoBatohu();
                break;


            case 5:
                System.out.println("zadej typ:");
                String zadanyTyp = sc.nextLine();
                z.vypsatPodleTypu(zadanyTyp);
                break;


            case 6:
                System.out.println("zadej o kolik navíc:");
                int zadanyPocet = sc.nextInt();
                sc.nextLine();
                z.rozsiritBatoh(zadanyPocet);
                break;

            case 7:
                pokracovat = false;
                break;
        }










}






}