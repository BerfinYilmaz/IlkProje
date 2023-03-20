public class SwitchCaseOdev {
    // Haftanin 7 gunu vardir
    // Her gun icin "Bugun gunlerden -verilen gun-" konsola yazdir
    public static void main(String[] args) {

        int haftaninGunu = 10;

        switch (haftaninGunu){
            case 1:
                System.out.println("Bugun gunlerden Pazartesi");
                break;
            case 2:
                System.out.println("Bugun gunlerden Sali");
                break;
            case 3:
                System.out.println("Bugun gunlerden Carsamba");
                break;
            case 4:
                System.out.println("Bugun gunlerden Persembe");
                break;
            case 5:
                System.out.println("Bugun gunlerden Cuma");
                break;
            case 6:
                System.out.println("Bugun gunlerden Cumartesi");
                break;
            case 7:
                System.out.println("Bugun gunlerden Pazar");
                break;
            default:
                System.out.println("Yanlıs gun girdiniz");


        }
    }
}
