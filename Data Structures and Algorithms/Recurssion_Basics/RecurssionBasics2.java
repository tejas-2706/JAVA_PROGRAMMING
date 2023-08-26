import javax.swing.plaf.synth.SynthLookAndFeel;

public class RecurssionBasics2 {

    public static int optimizedPower(int a, int n) {

        if (n==0) {
            return 1;
        }
        int halfPower = optimizedPower(a, n/2);
        // int halfPowerSq = optimizedPower(a, n/2) * optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;

        // n is odd
        if (n %2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }

    // Tiling Problem
    public static int TilingWays(int n) { // 2 * n (floor size)
        // Base
        if(n == 0 || n == 1) {
            return 1;
        }
        // kaam 
        int verticalTiles = TilingWays(n-1);
        int HorizontalTiles = TilingWays(n-2);
        int TotalWays = verticalTiles + HorizontalTiles;
        return TotalWays;
        //                    OR 
        // return TilingWays(n-1) + TilingWays(n-2);
    }

    // Remove Duplicates in a string
    public static int removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        //  base
        if(idx == str.length()) {
            System.out.println(newStr);
            return 1;
        }

        // kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true) {
            // Duplicate
            removeDuplicates(str, idx+1, newStr, map);
        }
        else {
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
        return 1;
    }
    
    // Friends Pairing Problem
    public static int friendsPairing(int n) {
        // Base case

        if (n == 1 || n == 2) {
            return n;
        }
        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);

                //   OR
        // // choices
        // // single
        // int fnm1 = friendsPairing(n-1);

        // // pair
        // int fnm2 = friendsPairing(n-2);
        // int pairways = (n-1) * fnm2;

        // // total ways
        // int totalWays = fnm1 + pairways;
        // return totalWays;
    }

    // Binary String Problem
    public static void printBinaryStrings(int n, int lastPlace, String str) {
        if(n == 0) {
            System.out.println(str);
            return;
        }
        // kaam
        printBinaryStrings(n-1, 0, str+"0");
        if(lastPlace == 0) {
            printBinaryStrings(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        // System.out.println(optimizedPower(2, 5));

        // System.out.println(TilingWays(4));

        // String str = "aappnaa";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

        // System.out.println(friendsPairing(3));

        printBinaryStrings(7, 0, "");
    }
}
