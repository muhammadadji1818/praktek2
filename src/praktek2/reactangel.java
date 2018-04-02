package praktek2;
public class reactangel {
    double panjang;
    double lebar;

    public reactangel() {
        panjang=5;
        lebar=5;
    }
    
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
    void cetakluas(){
        System.out.println("luasnya adalah: "+hitungluas());
    }
}
