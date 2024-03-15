package com.test;

import java.sql.SQLOutput;

public enum Element {
    HELIUM("He", "Gas"),
    MAGNESIUM("Mg", "Solid");
    private String chemicalSymbol;
    private String nature;

    private Element(String newChemicalSymbol, String newNature){
        chemicalSymbol = newChemicalSymbol;
        nature = newNature;
    }

    public String chemicalSymbol(){
        return chemicalSymbol;
    }

    public String getNature(){
        return nature;
    }

    public static void main(String[] args) {
        //System.out.printf("%s, %s, %s", Element[0],Element[0].chemicalSymbol,Element[0].nature);
        //System.out.println(Element.HELIUM);
    }
}
