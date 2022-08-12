import java.util.Arrays;

class Recursion {

    public static int reven(int n) {
        return 0;
    }
    
    public static String rrevStr(String text) {
        return "";
    }
    
    public static void rblastoff(int val) {
    }
    
    public static int rgetMod() {
        return 0;
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
    
    public static boolean rinString(char x, String word) {
        return false;
    }
    
    public static int rcount(char x, String word) {
        return 0;
    }

    public static void test(Object o1, Object o2) throws Exception {
        if (o1 != o2) {
            throw new Exception("Test Failed: "+o1+" != "+o2);
        }
    }

    public static void test(String o1, String o2) throws Exception {
        if (o1.compareTo(o2) != 0) {
            throw new Exception("Test Failed: "+o1+" != "+o2);
        }
    }
    
    public static void main(String[] args) {
        
        try {
            rblastoff(5);

            test (reven(10), 30); 
            test (reven(1), 0); 

            test (rrevStr("hello"), "olleh"); 
            test (rrevStr("A"), "A"); 
            test (rrevStr(""), "");
            test (rrevStr("HANNAH"), "HANNAH");
            
            test (rxerox("la", 4), "lalalala");
            test (rxerox("la", 0), "");

            test (rraise(2,3) ,  8);
            test (rraise(2,0) ,  1);

            test (risPalindrome("abba") ,  true);
            test (risPalindrome("apple") ,  false);
            test (risPalindrome("8") ,  true);
            test (risPalindrome("$-$") ,  true);
            test (risPalindrome("") ,  true);

            test (rinString('0', "4,6,0") ,  true);
            test (rinString('0', "4,6,4") ,  false);
            test (rinString('0', "") ,  false);

            test (rgetMod() % 3, 0);

            test (rcount('a', "abba") ,  2);
            test (rcount('a', "obbi") , 0);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
