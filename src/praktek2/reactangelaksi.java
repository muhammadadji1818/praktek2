package praktek2;
public class reactangelaksi {
    public static void main(String[] args) {
         reactangel r1 = new reactangel();
         r1.panjang = 9;
         r1.lebar = 3;
         
         r1.cetakinfo();
         System.out.println("luas reactangel = "+r1.hitungluas());
         r1.cetakluas();
         
         reactangel r2 = new reactangel();
         r2.cetakinfo();
         
         reactangel r3 = new reactangel(50,30);
         r3.cetakinfo();
         
    }
}
