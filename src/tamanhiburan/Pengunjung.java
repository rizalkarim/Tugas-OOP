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
public class Pengunjung {
    
    private String nama;
    private int tinggiBadan;
    
    public Pengunjung() {
    }
    public Pengunjung(String nama, int tinggibadan) throws Exception {
        this.setNama(nama);
  
    }

    
    
     public String getNama() {
        return nama;
    }

   
    public void setNama(String nama) throws Exception {
        for (char c : nama.toCharArray()) {
            if (Character.isDigit(c)) {
                throw new Exception("Nama tidak boleh "
                        + "mengandung angka");
            }
        }
        this.nama = nama;
    }

    /**
     * @return the nama
     */
    public int gettinggiBadan() {
        return tinggiBadan;
    }

    /**
     * @param nama the nama to set
     */
     public void settinggiBadan(int tinggiBadan) throws Exception {
        if (tinggiBadan > 110)
             {
            this.tinggiBadan = tinggiBadan;
        } else {
            throw new Exception("Tinggi tidak mencukupi untuk bermain Dragon Tower");
        }
    }
     
     
     public void bermain(Wahana wahana) {
        System.out.println(nama + " bermain " + wahana.getJenis());
    }
     
     public void biaya(Tiket tiket, Wahana wahana) {
        System.out.println(nama + " membeli tiket " +  wahana.getJenis() + " dengan harga " + tiket.getHarga());
    }
     
}
