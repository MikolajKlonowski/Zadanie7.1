public class CalandarConverter {


    final static int poniedzialek = 1;
    final static int wtorek = 2;
    final static int sroda = 3;
    final static int czwartek = 4;
    final static int piatek = 5;
    final static int sobota = 6;
    final static int niedziela = 7;


    public static String convertDayToString(int dayNumber) {
        String dzienTygodnia = null;
        switch (dayNumber) {
            case poniedzialek:
                dzienTygodnia = "pon";
                break;
            case wtorek:
                dzienTygodnia = "wtorek";
                break;
            case sroda:
                dzienTygodnia = "sroda";
                break;
            case czwartek:
                dzienTygodnia = "sroda";
                break;
            case piatek:
                dzienTygodnia = "sroda";
                break;
            case sobota:
                dzienTygodnia = "sroda";
                break;
            case niedziela:
                dzienTygodnia = "sroda";
                break;
            default:
                dzienTygodnia = "niewlasciwa liczba ";
        }

        return dzienTygodnia;

    }

}
