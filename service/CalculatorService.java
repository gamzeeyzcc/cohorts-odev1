package service;

import entity.BaseHouse;

import java.util.ArrayList;
import java.util.List;

public class CalculatorService {

    public CalculatorService() {
    }

    private HouseService houseService = new HouseService();

    private List<BaseHouse> houseList;

    public int getTotalHousePrice (){
       houseList = houseService.getHouseList();
        return calculateHousePrice(houseList);
    }


    public int getTotalSummerHousePrice(){
       houseList = houseService.getSummerHouseList();
        return calculateHousePrice(houseList);
    }


    public int getTotalVillaPrice(){
       houseList = houseService.getVillaList();
        return calculateHousePrice(houseList);
    }

    public int getAllBuildsTotalPrice(){
        return getTotalHousePrice() + getTotalSummerHousePrice() + getTotalVillaPrice();
    }

    public double getAverageMeterSquareForHouse(){
        List<BaseHouse> houseList = houseService.getHouseList();
        return calculateAverageSquareMeter(houseList);
    }


    public double getAverageMeterSquareForVilla(){
        List<BaseHouse> houseList = houseService.getVillaList();
        return calculateAverageSquareMeter(houseList);
    }


    public double getAverageMeterSquareForSummerHouse(){
        List<BaseHouse> houseList = houseService.getSummerHouseList();
        return calculateAverageSquareMeter(houseList);
    }

    public double getAllAverageMeterSquare(){
        return (getAverageMeterSquareForHouse() + getAverageMeterSquareForSummerHouse() + getAverageMeterSquareForVilla())/3;
    }

    public List<BaseHouse> findWithRoomAndLivingRoom(int roomCount, int livingRoomCount){
        List<BaseHouse> baseHouseList = new ArrayList<>();

        List<BaseHouse> filteredHouseList = new ArrayList<>();

        baseHouseList.addAll(houseService.getHouseList());
        baseHouseList.addAll(houseService.getSummerHouseList());
        baseHouseList.addAll(houseService.getVillaList());

        for(BaseHouse house : baseHouseList){
            if(house.getLivingRoomCount() == livingRoomCount && house.getRoomCount() == roomCount){
                filteredHouseList.add(house);
            }
        }
        return filteredHouseList;
    }

    private static int calculateHousePrice(List<BaseHouse> houseList) {
        int totalPrice =0;

        for(BaseHouse house : houseList){
            totalPrice += house.getPrice();
        }
        return totalPrice;
    }

    private static double calculateAverageSquareMeter(List<BaseHouse> houseList) {
        double averageMeterSquare =0.0;

        for(BaseHouse house : houseList){
            averageMeterSquare += house.getSquareMeters();
        }
        return averageMeterSquare / houseList.size();
    }




}
