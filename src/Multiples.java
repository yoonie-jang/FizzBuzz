public class Multiples {

    public static void main(String[] args) {
        int multiples = 0;
        for (int i  = 1; i < 1000; i++){
            if (i % 3 == 0){
                multiples ++;
            }
            else if (i % 5 == 0){
                multiples++;
            }
        }
        System.out.println(multiples);
    }
}
