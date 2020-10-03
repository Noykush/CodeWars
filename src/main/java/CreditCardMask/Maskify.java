package main.java.CreditCardMask;

public class Maskify {
    public static String maskify(String str) {
        StringBuilder sb = new StringBuilder();
        String res = str;
        if(str.length()>4)
            res = new String(new char[res.length()-4]).replace("\0", "#") + str.substring(str.length()-4,str.length());
        return res;
    }
}
