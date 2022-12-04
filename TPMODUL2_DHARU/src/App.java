public class App {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat = new Perangkat("Apple", 8, 1.2);
        perangkat.informasi();
 
        Laptop laptop = new Laptop("Asus", 32, 2.80, false); 
        laptop.informasi();
        laptop.bukaGame("Subway Surf");
        laptop.kirimEmail("dharu.ktp@gmail.com");
        laptop.kirimEmail("dharu.ktp@gmail.com", "naraya@gmail.com");
 
        Handphone handphone = new Handphone("Macan", 128, 3.2, true);
        handphone.informasi();
        handphone.telfon(628969174);
        handphone.kirimSMS(628969174);
        handphone.kirimSMS(628969174, 628969174);;
    }
}
