import java.util.Arrays;

class Recursion {
    
    public static void rblastoff(int val) {
        return;
    }

    public static int rgetMod() {
        return 1;
    }

    public static int reven(int n) {
        return 0;
    }

    public static String rrevStr(String text) {
        return "";
    }

    public static String rxerox(String word, int n) {
        return "";
    }
    
    public static int rraise(int n, int m) {
        return 0;
    }

    public static boolean risPalindrome(String text) {
        return false;
    }
    
    public static int rcount(char x, String word) {
        return 0;
    }

    public static int rmax(int[] lst) {
        return 0;
    }

    public static double raverage(int[] L) {
        return 0.0;
    }

    public static void rreverse(int[] L) {
    }

    public static void test(String msg, Object o1, Object o2) throws Exception {
        if (o1 != o2) {
            throw new Exception("Failed: "+msg+" "+o1+" != "+o2);
        }
        System.out.println("SUCCESS: "+msg+" "+o1+" = "+o2);
    }

    public static void test(String msg, double o1, double o2) throws Exception {
        if (Math.abs(o1 - o2) > 0.00001) {
            throw new Exception("Failed: "+msg+" "+o1+" != "+o2);
        }
        System.out.println("SUCCESS: "+msg+" "+o1+" = "+o2);
    }

    public static void test(String msg, String o1, String o2) throws Exception {
        if (o1.compareTo(o2) != 0) {
            throw new Exception("Failed: "+msg+" "+o1+" != "+o2);
        }
        System.out.println("SUCCESS: "+msg+" "+o1+" = "+o2);
    }

    public static void test(String msg, int[] o1, int[] o2) throws Exception {
        if (o1.length != o2.length) {
            throw new Exception("Failed (length): "+msg+" "
               +Arrays.toString(o1) + " != "+Arrays.toString(o2));
        }

        for (int i = 0; i < o1.length; i++) {
            if (o1[i] != o2[i]) {
                throw new Exception("Failed (value): "+msg+" "
                    +Arrays.toString(o1) + " != "+Arrays.toString(o2));
            }
        }
        System.out.println("SUCCESS: "+msg+ " "
            +Arrays.toString(o1) + " = "+Arrays.toString(o2));
    }
    
    public static void main(String[] args) {
        
        try {
            rblastoff(5);
            test ("rgetMod", rgetMod() % 3, 0);

            test ("reven", reven(10), 30); 
            test ("reven", reven(11), 30); 
            test ("reven", reven(1), 0); 

            test ("rrevStr", rrevStr("hello"), "olleh"); 
            test ("rrevStr", rrevStr("A"), "A"); 
            test ("rrevStr", rrevStr(""), "");
            test ("rrevStr", rrevStr("HANNAH"), "HANNAH");
            
            test ("rxerox", rxerox("la", 4), "lalalala");
            test ("rxerox", rxerox("la", 0), "");

            test ("rraise", rraise(2,3) ,  8);
            test ("rraise", rraise(2,0) ,  1);

            test ("risPalindrome", risPalindrome("abba") ,  true);
            test ("risPalindrome", risPalindrome("apple") ,  false);
            test ("risPalindrome", risPalindrome("8") ,  true);
            test ("risPalindrome", risPalindrome("$-$") ,  true);
            test ("risPalindrome", risPalindrome("") ,  true);

            test ("rcount", rcount('a', "abba") ,  2);
            test ("rcount", rcount('a', "obbi") , 0);

            test ("raverage", raverage(new int[]{2, 5, 10, 8}), 25/4.0);
            test ("raverage", raverage(new int[]{}), 0);

            test ("rmax", rmax(new int[]{2, 5, 10, 8}), 10);
            test ("rmax", rmax(new int[]{10, 5, 6, 8}), 10);
            test ("rmax", rmax(new int[]{2}), 2);
            test ("rmax", rmax(new int[]{}), -1);

            int[] L1 = {2, 5, 10, 8};
            int[] L3 = {2, 5, 8};
            int[] L2 = {};
            rreverse(L1);
            rreverse(L2);
            rreverse(L3);

            test ("rreverse", L1, new int[]{8, 10, 5, 2});
            test ("rreverse", L3, new int[]{8, 5, 2});
            test ("rreverse", L2, new int[]{});
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
