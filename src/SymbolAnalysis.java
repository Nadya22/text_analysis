import java.lang.String;
import java.util.HashMap;
import java.util.Map;

public class SymbolAnalysis {

   public static String countSent(StringBuffer data) {
        int rez = 0;
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == '.') rez++;
            if (data.charAt(i) == '!') rez++;
            if (data.charAt(i) == '?') rez++;
        }
        return "Количество предложений в тексте:\t" + rez+"\n";
    }

    public static String countWord(StringBuffer data) {
        int rec = 0;
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == ' ') {
                rec++;
            }
        }
        rec++;
        return "Количество слов в тексте:\t" +rec+"\n";
    }

    public static String countMark(StringBuffer data) {
        int rez = 0;
        String symbols = ".!?,:;()-";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            stringBuilder.append(data.charAt(i));
            if (symbols.contains(stringBuilder.toString())) {
                rez++;
            }
            stringBuilder.deleteCharAt(0);
        }
        return "Количество знаков препинаяни в тексте:\t" +rez+"\n";
    }

   public static String longWord(StringBuffer data) {
        String S = data.toString();
        String words[] = S.split(" ");
        int i, size = words.length;
        int iMax = -1, iMaxLength = -1;
        for (i = 0; i < size; ++i)
            if (!"".equals(words[i]) && words[i].length() > iMaxLength) {

                iMax = i;
                iMaxLength = words[i].length();
            }
        if (iMax == -1)
            System.err.println("Строка не содержит слов!");
        else
            System.out.println("Самое длинное слово = " + words[iMax].replaceAll("\\.","").replaceAll(",",""));
        return "Позиция в тексте:" + (iMax + 1)+"\n";
    }

   public static String longSent(StringBuffer data) {
        String S = data.toString();
        String sentens[] = S.split("\\.");
        int i, size = sentens.length;
        int iMax = -1, iMaxLength = -1;
        for (i = 0; i < size; ++i)
            if (!"".equals(sentens[i]) && sentens[i].length() > iMaxLength) {
                iMax = i;
                iMaxLength = sentens[i].length();
            }
        if (iMax == -1)
            System.err.println("Строка не содержит слов!");
        else
            System.out.println("Самое длинное предложение = " + sentens[iMax].replaceAll("\\.",""));
        return "Позиция в тексте:" + (iMax+1) +"\n" ;
    }

    public static String maxRepeatWord(StringBuffer data){
        HashMap<String, Integer> repeats = new HashMap<>();
        String symbols = ".!?,:;()-";
        String[] words = data.toString().split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            stringBuilder.append(words[i].charAt(words[i].length() - 1));
            if (symbols.contains(stringBuilder.toString())){
                words[i] = words[i].substring(0, words[i].length() -1);
            }
            stringBuilder.deleteCharAt(0);
        }
        repeats.put(words[0], 1);
        for (int i = 1; i < words.length; i++) {
            if (repeats.containsKey(words[i])) repeats.replace(words[i], repeats.get(words[i]) + 1);
            else repeats.put(words[i], 1);
        }
        int max = -1;
        String ans = "";
        for (Map.Entry<String, Integer> entry : repeats.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                ans = entry.getKey();
            }
        }
        return "В тексте самым часто встречающимся словом является: " + ans + ". \nКоличество вхождений:  " + max;
    }
}
