public class WhileDoDemo {
    public static void main(String[] args) {

        // i 1 den 5 e kadar deger alabilirdi
        // i degerlerini konsola yazdir

        for (int i = 1;i <= 5;i++){
            System.out.println("for loop u ile " + i);
        }

        System.out.println("................");

        int j = 1;
 //       while (j <= 5){
 //           System.out.println("While loop ile sayiniz " +j);
 //           j++;
 //       }

        System.out.println("................");

        do {
            System.out.println("Do while loop ile sayiniz " +j);
            j++;
        } while (j <= 5);
    }
}




