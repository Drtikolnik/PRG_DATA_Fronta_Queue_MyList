package LIFO;
import java.util.*;

public class Zasobnik {
    Scanner sc = new Scanner(System.in);

    private int kapacita = 2;
    private int top = -1;
    Predmet[] zasobnik = new Predmet [kapacita];




    public void push(){
        try{
            if (top == kapacita - 1){
                throw new FullBackpackException("Backpack je plný");
            }else{
                System.out.print("Zadej název:");
                String nazev = sc.nextLine();
                System.out.print("Zadej typ:");
                String typ = sc.nextLine();
                System.out.print("Zadej hodnotu:");
                int hodnota = sc.nextInt();
                sc.nextLine();

                Predmet predmet = new Predmet(nazev, typ, hodnota);

                top++;
                zasobnik[top] = predmet;
                System.out.println("Item přidán");
            }
        }catch(FullBackpackException e){
            System.out.println(e.getMessage());
        }



    }


    public void pop(){
        try{
            if (top == - 1){
                throw new EmptyBackpackException("Backpack je prázdný");
            }else{
                System.out.println("použit předmět: " +zasobnik[top].toString());
                zasobnik[top] = null;
                top--;
            }
        }catch(EmptyBackpackException e){
            System.out.println(e.getMessage());
        }


    }


    public void printAll(){
        for (int i = 0; i < top+1; i++) {
            System.out.println(zasobnik[i].toString());
        }
    }


    public void nakouknutiDoBatohu(){
        System.out.println(zasobnik[top].toString());
    }


    public void vypsatPodleTypu(String zadanyTyp){
        for(Predmet predmet : zasobnik){
            if(predmet.getTyp().equals(zadanyTyp)){
                System.out.println(zasobnik[top].toString());
            }
        }

    }


    public void rozsiritBatoh(int pocet){
        int novaKapacita = kapacita + pocet;

        Predmet[] zasobnik2 = new Predmet[novaKapacita];
        for (int i = 0; i < top+1; i++) {
            zasobnik2[i] = zasobnik[i];
        }
        zasobnik = zasobnik2;
        kapacita = novaKapacita;
    }



















}
