package main.java.RoboScript;
public class RoboScript {

    private static final String PATTERN = "<span style=\"color: %s\">%s</span>";
    static StringBuilder resCode = new StringBuilder();

    public static String highlight(String code) {
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if(Character.isLetter(c))
                handleLetter(code,i);
            else if(Character.isDigit(c))
                handleDigit(code,i);
            else
                resCode.append(c);
        }
        //


//            if ( i < code.length() -1 && code.charAt(i) == code.charAt(i + 1))
//                    letterCount++;
//            else if(i == code.length()-1)
//                res +=  !digitSequence.isEmpty() ? letterCount == 1 ? String.format(PATTERN, "orange",digitSequence) : String.format(PATTERN, "orange",digitSequence) + String.format(PATTERN, letterToColor(code.charAt(i)), Character.toString(code.charAt(i)).repeat(letterCount)) : Character.isDigit(code.charAt(i)) ?  String.format(PATTERN, "orange", code.charAt(i)) : String.format(PATTERN, letterToColor(code.charAt(i)), Character.toString(code.charAt(i)).repeat(letterCount));
//            else if (Character.isDigit(code.charAt(i)))
//                    digitSequence += code.charAt(i);
//            else {
//                res += digitSequence.isEmpty() ? String.format(PATTERN, letterToColor(code.charAt(i)), Character.toString(code.charAt(i)).repeat(letterCount)) : String.format(PATTERN, "orange", digitSequence) + String.format(PATTERN, letterToColor(code.charAt(i)), code.charAt(i));
//                letterCount = 1;
//                digitSequence = "";
//            }

        return resCode.toString();
    }

    private static void handleLetter(String code, int index){
        char c = code.charAt(index);
        int occurrences = 0;
        for (; index < code.length() && code.charAt(index) == c ;index++){
            occurrences++;
        }
        index--;
        String format =  String.format(PATTERN, letterToColor(code.charAt(index)),Character.toString(c).repeat(occurrences));
        resCode.append(format);
    }

    private static void handleDigit(String code, int index){
        char c = code.charAt(index);
        String digitSeq = "";
        for(; index < code.length() && Character.isDigit(code.charAt(index)); index++){
            digitSeq += Character.toString(code.charAt(index));
        }
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


