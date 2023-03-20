public class TryCatchDemo {

    public static void main(String[] args) {

        int[] sayilar ={1,5,10,555,678};
        try{
            System.out.println(sayilar[2]);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Hata sonrasi konsola yazdir");
    }
}
