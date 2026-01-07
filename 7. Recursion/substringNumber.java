public class substringNumber {

    public static int printSubstringNumber(String n, int start){
        if (start == n.length()){
            return 0;
        }
        int count = 0;
        for (int j = start; j<n.length() ; j++){
            if(n.charAt(start) == n.charAt(j)){
                count++;
            }
        }

        return count + printSubstringNumber(n, start+1);
    }

    static void main() {
        String str = "abcab";
        System.out.println(printSubstringNumber(str,0));
    }
}
