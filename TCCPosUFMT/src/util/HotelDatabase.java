/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import objetos.Hotel;

/**
 *
 * @author roliveira
 */
public class  HotelDatabase {
    
    ArrayList<Hotel> hoteis = new ArrayList<Hotel>();
    
  
    
  

   // hoteis.add()
    
    public ArrayList<Hotel> getHoteis() {
        return hoteis;
    }

    public void setHoteis() {
          Hotel h = new Hotel();
            h.setCity("Cuiaba");
            h.setId("1");
            h.setName("Holliday");
            h.setDescription("Hotel cuiabando");
            hoteis.add(h);
            Hotel h1 = new Hotel();
            h1.setCity("VG");
            h1.setId("2");
            h1.setName("Holliday");
            h1.setDescription("Hotel VG");
            hoteis.add(h1);
         Hotel h2 = new Hotel();
            h2.setCity("Lucas");
            h2.setId("3");
            h2.setName("Holliday in lucas");
            h2.setDescription("Hotel matogrossense");
            hoteis.add(h2);
    }
    
    
    
    
   
    
}
