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
public class Tiket {
    
    
    
    
    private int harga;
   

    


  
     public int getHarga() {
        return harga;
    }

    /**
     * @param biaya the biaya to set
     */
     public void setHarga(int harga) throws Exception {
        if (harga > 90)
             {
            this.harga = harga;
        } else {
            throw new Exception("Harga salah");
        }
    }
    /**
     * @return the waktuMulai
     */
   
}
