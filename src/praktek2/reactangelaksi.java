package praktek2;
public class reactangelaksi {
    public static void main(String[] args) {
         reactangel r1 = new reactangel();
         r1.panjang = 9;
         r1.lebar = 3;
         
         r1.cetakinfo();
         System.out.println("luas reactangel = "+r1.hitungluas());
    }
}
