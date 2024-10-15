public class ProductManager {
    public void add(Product product){
        if (ProductValidator.isValis(product)){
            System.out.println("Eklendi");
        }else {
            System.out.println("Urun gecersiz");
        }
    }
}
