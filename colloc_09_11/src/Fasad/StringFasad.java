package Fasad;

public class StringFasad {
    public StringFasad(){
    }
    public String FasadComplete(String stringOne, String stringTwo){
        StringСoncatenation stringСoncatenation = new StringСoncatenation();
        return stringСoncatenation.Complete(stringOne,stringTwo);
    }
    public String FasadComplete(String string, Integer n){
        StringMultN stringMultN = new StringMultN();
        return stringMultN.Complete(string, n);
    }
}
