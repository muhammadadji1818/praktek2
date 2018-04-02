package praktek2;
public class reactangel {
    double panjang;
    double lebar;
    
    void cetakinfo(){
        System.out.println("======================");
        System.out.println("panjang : "+panjang");
        System.out.println("lebar : "+lebar");
        System.out.println("======================");
    }
    double hitungluas(){
        double luas;
        luas=panjang*lebar;
        return luas;
    }
}
