package main.java.VasyaClerk;
import java.util.HashMap;
import java.util.Map;

public class Line {
    /*The new "Avengers" movie has just been released! There are a lot of people at the cinema box office standing in a huge line. Each of them has a single 100, 50 or 25 dollar bill. An "Avengers" ticket costs 25 dollars.

Vasya is currently working as a clerk. He wants to sell a ticket to every single person in this line.

Can Vasya sell a ticket to every person and give change if he initially has no money and sells the tickets strictly in the order people queue?

Return YES, if Vasya can sell a ticket to every person and give change with the bills he has at hand at that moment. Otherwise return NO.


EXAMPLES:
Line.Tickets(new int[] {25, 25, 50}) // => YES
Line.Tickets(new int[] {25, 100}) // => NO. Vasya will not have enough money to give change to 100 dollars
Line.Tickets(new int[] {25, 25, 50, 50, 100}) // => NO. Vasya will not have the right bills to give 75 dollars of change (you can't make two bills of 25 from one of 50)

*/
    protected enum CHASH{
        C25,
        C50,
        C100
    }
    public static String Tickets(int[] peopleInLine) {
        Map<CHASH, Integer> chashMap = new HashMap<CHASH, Integer>(){{put(CHASH.C25,0);put(CHASH.C50,0);put(CHASH.C100,0);}};
        int bill = 0;
        if(peopleInLine[0] > 25) //end case
            return "NO";
        for (int i = 0; i < peopleInLine.length; i++) {
            bill = peopleInLine[i];
            if (bill == 25) {
                chashMap.put(CHASH.C25, chashMap.get(CHASH.C25) + 1);
            }
            else if (bill == 50)
                if (chashMap.get(CHASH.C25) >= 1) {
                    chashMap.put(CHASH.C25, chashMap.get(CHASH.C25) - 1);
                    chashMap.put(CHASH.C50, chashMap.get(CHASH.C50) + 1);
                } else
                    return "NO";

            else if (bill == 100) {
                if (chashMap.get(CHASH.C50) >= 1 && chashMap.get(CHASH.C25) >= 1) {
                    chashMap.put(CHASH.C25, chashMap.get(CHASH.C25) - 1);
                    chashMap.put(CHASH.C50, chashMap.get(CHASH.C50) - 1);
                    chashMap.put(CHASH.C100, chashMap.get(CHASH.C100) + 1);
                }
                else if (chashMap.get(CHASH.C25) >= 3) {
                    chashMap.put(CHASH.C25, chashMap.get(CHASH.C25) - 3);
                    chashMap.put(CHASH.C100, chashMap.get(CHASH.C100) + 1);
                }
                else
                    return "NO";
            }
        }
        return  "YES";
    }
}
