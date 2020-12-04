/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
NAMA   : Andreas Danhago P.I
KELAS  : PBO2
NIM    : 10119067
Deskripsi Program : Genre Music
 */
package uts.if2.pkg10119067.andreasdanhago.no3;

/**
 *
 * @author Zetro
 */
public class UTSIF210119067andreasdanhagoNo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rnb blues = new Rnb();
        blues.setArtistName("Jimmy Hendrik");
        blues.genreBlues(blues.getArtistName());

        Rnb jazz = new Rnb();
        jazz.setArtistName("Chad Baker");
        jazz.genreJazz(jazz.getArtistName());

        Folk folk = new Folk();
        folk.setArtistName("Bob Dylan");
        folk.genreFolk(folk.getArtistName());

        Rockability rockability = new Rockability();
        rockability.setArtistName("Elvis Presley");
        rockability.genreRockability(rockability.getArtistName());

        HardRock ProgressiveRock = new HardRock();
        ProgressiveRock.setArtistName("DreamTheater");
        ProgressiveRock.genreProgressiveRock(ProgressiveRock.getArtistName());

        HardRock psychedelicRock = new HardRock();
        psychedelicRock.setArtistName("The Doors");
        psychedelicRock.genrePsychedelicRock(psychedelicRock.getArtistName());

        HardRock popRock = new HardRock();
        popRock.setArtistName("Kiss");
        popRock.genrePopRock(popRock.getArtistName());
        
        Metal punk = new Metal();
        punk.setArtistName("MXPX");
        punk.genrePunk(punk.getArtistName());

        Metal heavyMetal = new Metal();
        heavyMetal.setArtistName("METALLICA");
        heavyMetal.genreHeavyMetal(heavyMetal.getArtistName());

        Grindcore grindCore = new Grindcore();
        grindCore.setArtistName("Mesin Tempur");
        grindCore.genreGrindcore(grindCore.getArtistName());

        DeathMetal deathMetal = new DeathMetal();
        deathMetal.setArtistName("JASAD");
        deathMetal.genreDeathMetal(deathMetal.getArtistName());

        DeathCoreKepiting deathCoreKepiting = new DeathCoreKepiting();
        deathCoreKepiting.setArtistName("Revenge The Fate");
        deathCoreKepiting.genreDeathCoreKepiting(deathCoreKepiting.getArtistName());

        BlackMetal blackMetal = new BlackMetal();
        blackMetal.setArtistName("Behemoth");
        blackMetal.genreBlackMetal(blackMetal.getArtistName());

        NewSkul newskul = new NewSkul();
        newskul.setArtistName("HATEBREED");
        newskul.genreNewSkul(newskul.getArtistName());

    }
    
}
