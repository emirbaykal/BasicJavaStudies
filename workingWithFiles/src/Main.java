import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //createFile();
        //getFileInfo();
        readFile();
        writeFile();
        readFile();
    }

    public static void createFile(){
        File file = new File("C:\\javademos\\files\\students.txt");
        try {
            if (file.createNewFile()){
                System.out.println("Dosya Olusturuldu");
            }else {
                System.out.println("Dosya Olusturuldu");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getFileInfo(){
        File file = new File("C:\\javademos\\files\\students.txt");
        if (file.exists()){
            System.out.println("Dosya adi" + file.getName());
            System.out.println("Dosya yolu" + file.getAbsolutePath());
            System.out.println("Dosya yazilabilir mi?" + file.canWrite());
            System.out.println("Dosya okunabilir mi?" + file.canRead());
            System.out.println("Dosya boyutu (byte)" + file.length());
        }
    }

    public static void readFile(){
        File file = new File("C:\\javademos\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\javademos\\files\\students.txt", true));
            writer.write("Ahmet");
            System.out.println("Dosya yazildi");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}