import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Fronta {

    private Node front = null;
    private Node rear = null;
    private int size = 0;

    private int pocetObslouzenych;

    //vlozeni
    public void add(String pozice, String jmeno, String vzdelani, int vek ) {
        Uchazec uchazec = new Uchazec(pozice, jmeno, vzdelani, vek);
        Node newNode = new Node(uchazec);
        if (rear == null) { // fronta je prázdná
            front = newNode;
            rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
        size++;
    }

    public void odchodPrvniho(){
        if (front == null) { // fronta je prázdná
            return;
        }
        Uchazec uchazec = front.getData();
        front = front.getNext();
        if (front == null) { // fronta je prázdná
            rear = null;
        }
        size--;
    }


    public void obslouzeniUchazece(){
        if(size==0){
            IO.println("žádný uchazeč ve frontě");
        }else{
            System.out.println("Obsloužen uchazeč: " +front.getData()/*.getJmeno()*/);
            odchodPrvniho();
            pocetObslouzenych++;
            System.out.println("Počet obsloužených uchazečů: " +pocetObslouzenych);
        }
    }

    public void printAll(){
        Node current = front;
        while (current != null) {
            System.out.print(current.getData() + "  ");
            current = current.getNext();
            System.out.println();

        }
        System.out.println();
    }

    public void nakouknutiNaDalsiho(){
        System.out.println("Další uchazeč ve frontě: " +front.getData());
        System.out.println("-----------");
    }

    public void vypsatPodlePozice(String pozice){
        Node current = front;
        while (current != null) {

            if (current.getData().getPozice().toLowerCase().equals(pozice.toLowerCase())) {
                System.out.println(current.getData());
            }

            current = current.getNext();

        }
        System.out.println();
    }

    public void deleteAll(){
        if (front != null) { // fronta neni prázdná
            Node current = front;
            while (current != null) {

                Uchazec uchazec = front.getData();
                front = front.getNext();
                if (front == null) { // fronta je prázdná
                    rear = null;
                }
                size--;
                current = current.getNext();
            }
        }

    }

    public void ulozitDoJSON() {


        Path cesta = Path.of("data", "uchazeci.json");

        try {
            // Vytvoření složky, pokud neexistuje
            if (cesta.getParent() != null && !Files.exists(cesta.getParent())) {
                Files.createDirectories(cesta.getParent());
            }

            try (BufferedWriter bw = Files.newBufferedWriter(cesta)) {
                bw.write("[");
                bw.newLine();

                Node current = front;
                while (current != null) {
                    Uchazec u = current.getData();
                    bw.write("  {\n");
                    bw.write("    \"pozice\": \"" + u.getPozice() + "\",\n");
                    bw.write("    \"jmeno\": \"" + u.getJmeno() + "\",\n");
                    bw.write("    \"vzdelani\": \"" + u.getVzdelani() + "\",\n");
                    bw.write("    \"vek\": " + u.getVek() + "\n");

                    if (current.getNext() != null) {
                        bw.write("  },");
                    } else {
                        bw.write("  }");
                    }
                    bw.newLine();

                    current = current.getNext();
                }

                bw.write("]");
                bw.newLine();
            }

            System.out.println("Zápis do JSON proběhl úspěšně.");
            System.out.println("Absolutní cesta: " + cesta.toAbsolutePath());

        } catch (IOException e) {
            System.out.println("Chyba při zápisu do JSON souboru:");
            e.printStackTrace();
        }


    }




}