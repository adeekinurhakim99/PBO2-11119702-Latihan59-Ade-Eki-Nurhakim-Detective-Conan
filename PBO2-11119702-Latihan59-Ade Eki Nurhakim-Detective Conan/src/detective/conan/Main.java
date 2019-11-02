/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detective.conan;

/**
 *
 * @author Ekiw
 */
public class Main {
    public static void main(String[] args) {
        Shinichi s=new Shinichi();
        s.setNama("Shinichi Kudo");
        s.desS();
        
        Endogawa e=new Endogawa();
        e.setNama("Endogawa Kudo");
        e.desE();
        
        RanMouri r=new RanMouri();
        r.setNama("Ran Mouri");
        r.desR();
        
        KogoroMouri k=new KogoroMouri();
        k.setNama("Kogoro Mouri");
        k.desK();
        
        EriKisaki er=new EriKisaki();
        er.setNama("Eri Kisaki");
        er.desEr();
        
        sSuzuki es=new sSuzuki();
        es.setNama("Sonoko Suzuki");
        es.dess();
        
        gKojima g=new gKojima();
        g.setNama("Genta Kojima");
        g.desg();
        
        aYoshida a=new aYoshida();
        a.setNama("Ayumi Yoshida");
        a.desa();
        
        yKudo y=new yKudo();
        y.setNama("Yukiko Kudo");
        y.desy();
        
        aHaibara ah=new aHaibara();
        ah.setNama("Ai Haibara");
        ah.desaH();
        
        hHattori h=new hHattori();
        h.setNama("Heiji Hattori");
        h.desh();
        
        mTsuburaya m=new mTsuburaya();
        m.setNama("Mitsuhiko Tsuburaya");
        m.desm();
        
    }
}
