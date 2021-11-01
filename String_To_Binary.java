public class String_To_Binary {

    static int dec_To_Bin(int num){
        int rem, bin = 0, i = 1;
        while(num > 0){
            rem = num % 2;
            bin = bin + (rem * i);
            num = num / 2;
            i = i * 10;
        }
        return bin;
    }    

    static void a(String s){
        int ar[] = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            ar[i] = s.charAt(i);
        }

        int dec[] = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            dec[i] = dec_To_Bin(ar[i]);
        }

        for (int i : dec) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        System.out.println(dec_To_Bin(5));
        a("Hello How are you");
    }
}
