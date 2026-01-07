public class numbertoEnglish {

    public static void printNumberToEnglish(int num){
        String[] words = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };

        if(num == 0){
            return;
        }

        // This will give the first number after complete recursion
        printNumberToEnglish(num/10);

        //Getting the Number index
        int d = num % 10;
        System.out.print(words[d] + " ");

    }

    static void main() {
        int n = 12345;
        printNumberToEnglish(n);
    }
}
