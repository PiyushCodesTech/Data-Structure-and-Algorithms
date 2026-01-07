public class findSubsetOfString {

    public static void printSubstring(String str, String ans, int i){
        // Base Case
        if (i == str.length()) {
            if (ans.length() == 0){
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // Yes Choice
        printSubstring(str, ans+str.charAt(i), i+1);

        // No choice
        printSubstring(str, ans, i+1);


    }

    static void main() {
        String str = "abc";
        printSubstring(str, "", 0);

    }
}
