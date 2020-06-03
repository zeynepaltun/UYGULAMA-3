//hayvanlar sınıfımızdan kuş türünde bir nesne oluşturup özelliklerini tanıttık.
package hayvanlar;

public class Hayvanlar { //hayvanlar adında sınıf oluşturudk.
    String Ismi;
    String Ucabilirlik;// özelliklerini neye göre seçeceğimizi belirttik.
    int YasamaYılı;
    String renk;
   
    public static void main(String[] args)
    {
        
        
       Hayvanlar kuslar=new Hayvanlar(); // hayvanlar adındaki sınıfımıza kuşlar adında nesne oluşturduk.
       kuslar.Ismi="MaviAlakarga";
       kuslar.YasamaYılı=4-8;           //nesnelerimizin özelliklerini belirttik
       kuslar.renk="mavi";
       kuslar.Ucabilirlik="Uçabilir";
       

        System.out.println("kuşun ismi :" + kuslar.Ismi);
        System.out.println("kuşun yaşama yılı :"+kuslar.YasamaYılı);
        System.out.println("kuşun rengi :"+kuslar.renk);
        System.out.println("uçabilirmi ? :"+kuslar.Ucabilirlik);
        
        //sout ile yazdırdık.
        
        
    }

}