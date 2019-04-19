import java.util.ArrayList;
public class Main {

    public static void main(String[] args)  {
       /* TextReader text = new TextReader();
        text.read();
        TextAnalis analis = new TextAnalis();
        analis.qsentences(text.getArr());
*/
        sybolreader s=new sybolreader();
        System.out.println(SymbolAnalys.SentenseCoun(s.getData()));
        System.out.println(SymbolAnalys.WordCoun(s.getData()));
        System.out.println(SymbolAnalys.MarksCoun(s.getData()));
        System.out.println(SymbolAnalys.LongWord(s.getData()));
        System.out.println(SymbolAnalys.LongWord(s.getData()));




    }
}
