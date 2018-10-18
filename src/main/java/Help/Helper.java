package Help;

import Vehicles.AbstractVehicle;
import Vehicles.Car;
import Vehicles.Plane;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class Helper{


    public static ArrayList<AbstractVehicle> sortOne(ArrayList<AbstractVehicle> arr){
        ArrayList<AbstractVehicle> noPlaneArr=new ArrayList<>();
        ArrayList<AbstractVehicle> minCostArr=new ArrayList<>();
        ArrayList<AbstractVehicle> resArr=new ArrayList<>();

        for(AbstractVehicle av:arr){
            if (!(av instanceof Plane)){
                noPlaneArr.add(av);
            }
        }


        Collections.sort(noPlaneArr,AbstractVehicle.Comparators.COST);
        int minCost=noPlaneArr.get(noPlaneArr.size()-1).getCost();
        for(AbstractVehicle av: noPlaneArr){
            if((av.getCost()==minCost)||(av.getCost()>=minCost+20000)){
                minCostArr.add(av);
            }
        }

        Collections.sort(minCostArr,AbstractVehicle.Comparators.SPEED);

        int maxSpeed=minCostArr.get(0).getSpeed();
        for(AbstractVehicle av: minCostArr){
            if((av.getSpeed()==maxSpeed)||(av.getCost()>=maxSpeed+100)){
                resArr.add(av);
            }
        }





        //System.out.println(res);
        return resArr;
    }


    public static ArrayList<AbstractVehicle> sortThree(ArrayList<AbstractVehicle> arr){

        ArrayList<AbstractVehicle> res=new ArrayList<AbstractVehicle>();
        //res.add(arr.get(0));

        for(AbstractVehicle av: arr){
            if(!(av instanceof Plane)){
                if((av.getSpeed()>200)&&(av.getSpeed()<500)){
                    res.add(av);
                }
            }
        }
        return res;
    }

    public static ArrayList<AbstractVehicle> sortTwo(ArrayList<AbstractVehicle> arr) {


        ArrayList<AbstractVehicle> res = new ArrayList<AbstractVehicle>();
        for (AbstractVehicle av : arr)
            if ((av instanceof Plane)) {

                if ((((Plane) av).getHeight() > 5000) && (av.getIssueYear() > 2000)) {
                    res.add(av);
                }

                //System.out.println(res.size());


            }
        return res;
    }







    public static ArrayList<AbstractVehicle> interfaceSort(ArrayList<AbstractVehicle> fArr){
        ArrayList<AbstractVehicle> arr=new ArrayList<>();
        int maxSpeed=0;
        for(AbstractVehicle fl: fArr){
            if(fl.getSpeed()>maxSpeed){
                maxSpeed=fl.getSpeed();
            }
        }

        for(AbstractVehicle fl: fArr){
            if(fl.getSpeed()==maxSpeed){
                System.out.println(fl);
                arr.add(fl);
            }
        }
        return arr;
    }






}





