public class Get_IthBit {
    public static void main() {
        int result = getIthBit(5, 2);
        System.out.println(result);
    }
    public static int getIthBit(int number, int i){
        int bitMask = 1<<i;
        if((number & bitMask) == 0){
            return 0;
        } else{
            return 1;
        }

    }

    public static int setIthBit(int number, int i){

    }
}
