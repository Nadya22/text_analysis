import java.io.FileReader;
import java.util.Scanner;

public class SymbolReader {

        FileReader f;
        StringBuffer data=new StringBuffer();

        public SymbolReader() {
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

        StringBuffer getData(){
            return this.data;
        }
    }


