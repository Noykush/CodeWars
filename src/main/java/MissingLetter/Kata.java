package main.java.MissingLetter;
public class Kata {
    public static char findMissingLetter(char[] array)  {
        char prev = array[0], c='s';
        for(int i = 1; i < array.length; i++){
            if(array[i] != prev+1 || array[i] != prev+1) {
                if (Character.isUpperCase(array[i]))
                    c = (char)(prev+1);
                else
                    c = (char)(prev +1);
                return c;
            }
            prev++;
        }
        return '0';
    }
}
