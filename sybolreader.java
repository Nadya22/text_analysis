import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sybolreader {
    FileReader f;
StringBuffer data=new StringBuffer();
public sybolreader() {
    System.out.println("Путь к файлу: ");
    Scanner src = new Scanner(System.in);
    String path = src.nextLine();

    try {
            f = new FileReader(path);
            int c=f.read();
            while (c !=-1){
                data.insert(0,(char)c);

              c=f.read();
            }
            data.reverse();
        }
         catch(Exception e) {
             System.out.println(e);
         }

    }

StringBuffer getData(){return this.data;}



}
