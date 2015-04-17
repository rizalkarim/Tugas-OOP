

package tamanhiburan;

public class TamanHiburan {

 
    public static void main(String[] args) throws Exception {
        
        Petugas petugas1 = new Petugas();
        petugas1.setId("1234");
        
        try {
            petugas1.setNama("Petugas A");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        Petugas petugas2 = new Petugas();
        petugas2.setId("1235");
        
        try {
            petugas2.setNama("Petugas B");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    
        System.out.println("Daftar Petugas");
        System.out.println("ID:" +petugas1.getId() + " " + "Nama:" + petugas1.getNama());
        System.out.println("ID:" +petugas2.getId() + " " + "Nama:" + petugas2.getNama());
        
        Pengunjung pengunjung1 = new Pengunjung();
        
        try {
            pengunjung1.setNama("Pengunjung A");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            pengunjung1.settinggiBadan(111);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        Pengunjung pengunjung2 = new Pengunjung();
        
        try {
            pengunjung2.setNama("Pengunjung B");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            pengunjung2.settinggiBadan(112);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println();
        System.out.println("Daftar Pengunjung");
        System.out.println("Nama:" + pengunjung1.getNama());
        System.out.println("Nama:" + pengunjung2.getNama());
        
        Wahana wahana1 = new Wahana ();
        try {
            wahana1.setJenis("Dragon Tower");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        Wahana wahana2 = new Wahana ();
        try {
            wahana2.setJenis("Hysteria");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        
        Wilayah wilayah1 = new Wilayah ();
        wilayah1.setKode("A1");
        
        Wilayah wilayah2 = new Wilayah ();
        wilayah2.setKode("A2");
        
        Tiket tiket1 = new Tiket();
    
        try {
            tiket1.setHarga(100);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        Tiket tiket2 = new Tiket();
    
        try {
            tiket2.setHarga(200);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
       System.out.println();
       petugas1.mengurus(wahana1);
       petugas2.mengurus(wahana2);
       wahana1.bertempat(wilayah1);
       wahana2.bertempat(wilayah2);
       wahana1.biaya(tiket1);
       wahana2.biaya(tiket2);
       pengunjung1.biaya(tiket1, wahana1);
       pengunjung2.biaya(tiket2, wahana2);
       pengunjung1.bermain(wahana1);
       pengunjung2.bermain(wahana2);
      
        
        
    }

}
    

