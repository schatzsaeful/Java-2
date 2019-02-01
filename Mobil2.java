package tugaspemrograman2;

public class Mobil2 {

    public static void main(String[] args) {
        
        System.out.println("  Saeful Husna - 1842809 - IF Z");
        System.out.println("  Tugas Latihan Pemrograman 2  ");
        System.out.println("=============================\n");
        Mobil sedan = new Mobil();

        sedan.start(false);
        sedan.gantiGigi(2);
        sedan.gas();
        sedan.rem(false);
        sedan.stop(true);
        sedan.gas();
       
         

    }
}
