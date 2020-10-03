package main.java.RoboScript;
public class RoboScript {

    private static final String PATTERN = "<span style=\"color: %s\">%s</span>";
    static StringBuilder resCode = new StringBuilder();
    private static int index = 0;

    public static String highlight(String code) {
        resCode.delete(0,resCode.length());
        for ( index = 0; index < code.length(); index++) {
            char c = code.charAt(index);
            if(Character.isLetter(c))
                handleLetter(code);
            else if(Character.isDigit(c))
                handleDigit(code);
            else
                resCode.append(c);
        }
        return resCode.toString();
    }

    private static void handleLetter(String code){
        char c = code.charAt(index);
        int occurrences = 0;
        for (; index < code.length() && code.charAt(index) == c ;index++){
            occurrences++;
        }
        index--;
        String format =  String.format(PATTERN, letterToColor(c),Character.toString(c).repeat(occurrences));
        resCode.append(format);
    }

    private static void handleDigit(String code){
        char c = code.charAt(index);
        String digitSeq = "";
        for(; index < code.length() && Character.isDigit(code.charAt(index)); index++){
            digitSeq += Character.toString(code.charAt(index));
        }
        index--;
        String format =  String.format(PATTERN, "orange", digitSeq);
        resCode.append(format);
    }

    private static String letterToColor(char c){
        String color = "";
        switch(c) {
            case 'F':
                color ="pink";
                break;
            case 'L':
                color = "red";
                break;
            case 'R':
                color = "green";
                break;
        }
        return color;
    }
}


