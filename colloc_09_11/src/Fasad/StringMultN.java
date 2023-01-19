package Fasad;

public class StringMultN {
    public StringMultN(){
    }
    public String Complete(String string, Integer n){
        String newString = new String();
        for(int i = 0; i < n; i++){
            newString += string;
        }
        return newString;
    }
}
