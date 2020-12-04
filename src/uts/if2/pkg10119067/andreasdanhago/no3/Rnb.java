/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119067.andreasdanhago.no3;

/**
 *
 * @author Zetro
 */
public class Rnb extends MusicGenre implements Blues, Jazz{
    @Override
    public void genreBlues(String artistName) {
        System.out.println(artistName+" adalah musisi Blues");
    }

    @Override
    public void genreJazz(String artistName) {
        System.out.println(artistName+" adalah musisi Jazz");
    }

    void setArtistName(String jimmy_Hendrik) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getArtistName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setArtistName(String jimmy_Hendrik) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}