package okulkayıt;
import java.util.Scanner;
public class Okulkayıt {
public static void main(String[] args) {
Scanner k=new Scanner(System.in);
     
int ogrenci_sayisi=0;
    System.out.println("sınıftaki öğrenci sayısı= "+ ogrenci_sayisi);
    System.out.println("başvurunun kabul edilebilmesi için\n"
            + " not ortalamanızın en az 70 olması gerekir");
    System.out.println("kaç kişi için başvurmak istersiniz");
    int basvuru_yapan_sayisi=k.nextInt();
    ogrenci_sayisi+=basvuru_yapan_sayisi;
     System.out.println("not ortalamanızı giriniz");
   int not_ort=k.nextInt();
    if(not_ort<=69){
        System.out.println("not ortalamanız kriterlerimize uymuyor...");
    }
    else if(not_ort>=70){
        System.out.println("not ortlamanız yeterli\n"
                + " başvuru işlemlerinizi yapabilirsiniz");
        System.out.println("adınızı ve soyisminizi giriniz");
        String ad_soyad=k.nextLine();
       
        System.out.println("neden burada olmak istediğinizi kısaca açıklayınız");
        String aciklama=k.nextLine();
                
        System.out.println("size ulaşabilmemiz için iletişim bilgilerinizi lütfen yazınız");
        System.out.print("e posta adresiniz= ");
        String e_posta=k.nextLine();
        System.out.print("telefon numaranız= ");
        int telefon_numara=k.nextInt();
        System.out.println("bilgileriniz:  "+ not_ort + ad_soyad + aciklama + e_posta + telefon_numara);
        System.out.println("onaylıyor musunuz");
        String onay=k.nextLine();
        if(onay=="evet"){
               System.out.println("başvurunuz değerlendirilmeye alınmıştır...");
        System.out.println("verdiğiniz bilgiler için teşekkürler");
        System.out.println("en kısa sürece sizinle iletişime geçeceğiz");
        }
        else {
            System.out.println("lütfen bilgilerinizi tekrar giriniz..");
int ikinci_ogrenci_sayisi=0;
    System.out.println("sınıftaki öğrenci sayısı= "+ ogrenci_sayisi);
    System.out.println("başvurunun kabul edilebilmesi için\n"
            + " not ortalamanızın en az 70 olması gerekir");
    System.out.println("kaç kişi için başvurmak istersiniz");
    int ikinci_basvuru_yapan_sayisi=k.nextInt();
    ikinci_ogrenci_sayisi+=ikinci_basvuru_yapan_sayisi;
     System.out.println("not ortalamanızı giriniz");
   int ikinci_not_ort=k.nextInt();
    if(ikinci_not_ort<=69){
        System.out.println("not ortalamanız kriterlerimize uymuyor...");
    }
    else if(ikinci_not_ort>=70){
        System.out.println("not ortlamanız yeterli\n"
                + " başvuru işlemlerinizi yapabilirsiniz");
        System.out.println("adınızı ve soyisminizi giriniz");
        String ikinci_ad_soyad=k.nextLine();
       
        System.out.println("neden burada olmak istediğinizi kısaca açıklayınız");
        String ikinci_aciklama=k.nextLine();
                
        System.out.println("size ulaşabilmemiz için iletişim bilgilerinizi lütfen yazınız");
        System.out.print("e posta adresiniz= ");
        String ikinci_e_posta=k.nextLine();
        System.out.print("telefon numaranız= ");
        int ikinci_telefon_numara=k.nextInt();
        System.out.println("bilgileriniz:  "+ " "+ ikinci_not_ort + " "+ikinci_ad_soyad +" " +ikinci_aciklama + " "+ikinci_e_posta + " "+ikinci_telefon_numara);
        System.out.println("onaylıyor musunuz");
        String ikinci_onay=k.nextLine();
        if(onay=="evet"){
               System.out.println("başvurunuz değerlendirilmeye alınmıştır...");
        System.out.println("verdiğiniz bilgiler için teşekkürler");
        System.out.println("en kısa sürece sizinle iletişime geçeceğiz");
        }
        else {
        System.out.println("sayfayı yenile beceriksiz");
                }
        }
        
        
        
        
     
    }
  
    
 
}    
}}
