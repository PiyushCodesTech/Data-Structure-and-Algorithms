public class findLengthOfString {

    public static int stringLen(String str){
        if(str.length() == 0){
            return 0;
        }
        return stringLen(str.substring(1)) + 1;
    }

    static void main() {
        String str = "whatisyournamedarling";
        System.out.println(stringLen(str));
    }
}
