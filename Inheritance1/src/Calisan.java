public class Calisan {
//supperclass or baseclass
    private String isim;
    private int maas;
    private String departman;
    public Calisan(String isim, int maas, String departman){
        this.isim=isim;
        this.maas=maas;
        this.departman=departman;       
}
public void calis(){
                System.out.println("çalışan çalışıyor....");        
}
public void bilgileri_goster(){
                System.out.println("isim:  "+getIsim());
                System.out.println("maaş:  "+getMaas());
                System.out.println("departman:  "+getDepartman());
}
public void departman_degistir(String yeni_departman){
                System.out.println("departman değiştiriliyor...");
                this.setDepartman(yeni_departman);
                System.out.println("yeni departman:  "+this.getDepartman());       
}  

   
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
