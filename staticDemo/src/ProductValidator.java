public class ProductValidator
{
    static {
        //Static fonksiyonlar calistiginda constructure fonksiyon varsa bile calismaz. New ile olusturuldugunda calisir.
        // Burada kullanilan gibi static diye acilan static constructure kullanabilirsin.
        System.out.println("Construct calisti.");
    }
    public static boolean isValis(Product product){
        if (product.price > 0 && !product.name.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
