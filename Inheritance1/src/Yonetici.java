public class Yonetici extends Calisan {
    //extends Clisan= Clisandaki tüm özellikleri miras almış olduk
    //yine de bir constructor yazmak zorundayız yöneticiye ait
    private int sorumlu_kisi;//ekstra özellik
    public Yonetici(String isim, int maas, String departman, int sorumlu_kisi){
      /*   this.isim=isim;
        this.maas=maas;
        this.departman=departman;  */
      super(isim, maas, departman);
      // calisan super class olduğu için super() i yazdık
      //privateleri doğrdudan alamıyoruz o yüzden dolaylık olarak aldık      
      this.sorumlu_kisi=sorumlu_kisi;
    }
    public void zam_yap(int zam_miktari){
        System.out.println("çalışanlara  "+ zam_miktari+ " tl zam yapıldı");
    }
    public void bilgileri_goster(){
        super.bilgileri_goster();
        
    System.out.println("sorumlu kişi sayisi:  "+ this.sorumlu_kisi);
     /*  System.out.println("isim:  "+getIsim());
                System.out.println("maaş:  "+getMaas());
                System.out.println("departman:  "+getDepartman()); */
}
}
