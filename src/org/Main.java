package org;

public class Main {

    public static void main(String[] args)  {
       SymbolReader s=new SymbolReader();
        System.out.println(SymbolAnalysis.countSent(s.getData()));
        System.out.println(SymbolAnalysis.countWord(s.getData()));
        System.out.println(SymbolAnalysis.countMark(s.getData()));
        System.out.println(SymbolAnalysis.longWord(s.getData()));
        System.out.println(SymbolAnalysis.longSent(s.getData()));
        System.out.println(SymbolAnalysis.maxRepeatWord(s.getData()));
    }
}
/*C:\Laborotory2\j.txt*/