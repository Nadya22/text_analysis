import java.lang.String;
public class SymbolAnalys {

        static int SentenseCoun(StringBuffer data){
        int rez=0;
        for (int i=0;i<data.length();i++){
            if(data.charAt(i)=='.')rez++;
            if(data.charAt(i)=='!')rez++;
            if(data.charAt(i)=='?')rez++;
        }
        return  rez;
    }

    static int WordCoun(StringBuffer data){
            int rec=0;
            for(int i=0;i<data.length();i++){
                if(data.charAt(i)==' '){
                    rec++;
                }

            }
            rec++;
            return rec;
    }
    static int MarksCoun(StringBuffer data){
        int rez=0;
        for (int i=0;i<data.length();i++){
            if(data.charAt(i)=='.'){rez++;continue;}
            if(data.charAt(i)=='!'){rez++;continue;}
            if(data.charAt(i)=='?'){rez++;continue;}
            if(data.charAt(i)==','){rez++;continue;}
            if(data.charAt(i)==':'){rez++;continue;}
            if(data.charAt(i)==';'){rez++;continue;}
            if(data.charAt(i)=='"'){rez++;continue;}
            if(data.charAt(i)=='-'){rez++;continue;}
            if(data.charAt(i)=='"'){rez++;continue;}
            if(data.charAt(i)=='('){rez++;continue;}
            if(data.charAt(i)==')'){rez++;continue;}
        }
        return  rez;
    }

    static String LongWord(StringBuffer data){
            String S=data.toString();
        String sw = "", lw = "";
        int s = data.length(), l = 0;
        String words[] = S.split(" ");

        for(String word:words) {
            if(word.length()<s)
                sw = word;
            else if(word.length()>l)
                lw = word;
        }

        System.out.println("LONGEST WORD : "+lw);

           return lw ;
    }

}
