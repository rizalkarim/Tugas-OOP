/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tamanhiburan;

/**
 *
 * @author Lenovo
 */
public class Wahana {
    
    
    private String jenis;
   
   
    public Wahana() {
    }
    
    
 
     public String getJenis() {
        return jenis;
    }
     public void setJenis(String jenis) throws Exception {
        if (jenis.equalsIgnoreCase("Dragon Tower")
                || jenis.equalsIgnoreCase("Hysteria")) {
            this.jenis = jenis;
        } else {
            throw new Exception("Harus Mobil atau Motor saja");
        }
    }

     public void biaya(Tiket tiket) {
        System.out.println(jenis + " harga tiketnya " + tiket.getHarga());
    }
      public void bertempat(Wilayah wilayah) {
        System.out.println(jenis + " berlokasi di " + wilayah.getKode());
    }

    /**
     * @param id the id to set
     */

}
