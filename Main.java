import service.CalculatorService;

public class Main {
    public static void main(String[] args) {

        CalculatorService calculatorService = new CalculatorService();

        System.out.println(" Evlerin toplam fiyatları :" + calculatorService.getTotalHousePrice());

        System.out.println(" Yazlıkların toplam fiyatları :" + calculatorService.getTotalSummerHousePrice());

        System.out.println(" Villaların toplam fiyatları :" + calculatorService.getTotalVillaPrice());

        System.out.println(" Tüm tipteki evlerin toplam fiyatı :" + calculatorService.getAllBuildsTotalPrice());

        System.out.println(" Evlerin ortalama metrekaresi :" + calculatorService.getAverageMeterSquareForHouse());

        System.out.println(" Yazlıkların ortalama metrekaresi :" + calculatorService.getAverageMeterSquareForSummerHouse());

        System.out.println(" Villaların ortalama metrekaresi :" + calculatorService.getAverageMeterSquareForVilla());

        System.out.println(" Tüm evlerin ortalama metrekaresi :" + calculatorService.getAllAverageMeterSquare());

        System.out.println("Oda sayısı 3, Salon sayısı 1 için filtrelenmiş ev listesi " + calculatorService.findWithRoomAndLivingRoom(3,1));




    }
}