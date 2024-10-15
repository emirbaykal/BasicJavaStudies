import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList();
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");

        sayilar.set(2,100);
        //sayilar.remove(0);
        //sayilar.clear();
        System.out.println(sayilar.get(1));

        for (Object i : sayilar){
            System.out.println(i);
        }
    }
}