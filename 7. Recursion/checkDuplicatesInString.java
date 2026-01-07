public class checkDuplicatesInString {
    public static void checkDup(String str, int idx, StringBuilder newStr, boolean [] map){
        // Base condition
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        // kaam
        char currChar = str.charAt(idx);

        if (map[currChar - 'a'] == true){
            //Duplicate
            checkDup(str, idx+1, newStr, map);
        } else{
            map[currChar-'a'] = true;
            checkDup(str, idx+1, newStr.append(currChar), map);
        }
    }

    static void main() {
        String str = "apnacollege";
        boolean [] map = new boolean[26];

        checkDup(str, 0, new StringBuilder(""), map);
    }
}
