package service;

import entity.BaseHouse;
import entity.House;
import entity.SummerHouse;
import entity.Villa;

import java.util.Arrays;
import java.util.List;

public class HouseService {

    public HouseService() {
    }

    private House house1 = new House(100,120,3,1);
    private House house2 = new House(150,90,2,0);
    private House house3 = new House(125,150,4,2);



    private SummerHouse summerHouse1 = new SummerHouse(111,145,5,1);
    private SummerHouse summerHouse2 = new SummerHouse(123,79,1,0);
    private SummerHouse summerHouse3 = new SummerHouse(135,126,3,2);



    private Villa villa1 = new Villa(250,170,5,1);
    private Villa villa2 = new Villa(160,100,1,0);
    private Villa villa3 = new Villa(190,140,3,1);


    public List<BaseHouse> getVillaList(){
        return Arrays.asList(villa1, villa2, villa3);
    }

    public List<BaseHouse> getHouseList(){
        return Arrays.asList(house1, house2, house3);
    }

    public List<BaseHouse> getSummerHouseList(){
        return Arrays.asList(summerHouse1, summerHouse2, summerHouse3);
    }



}
