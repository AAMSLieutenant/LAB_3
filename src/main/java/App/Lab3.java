package App;

import Builder.Types;
import Builder.VehicleBuilder;
import Help.Helper;

import java.util.Scanner;

public class Lab3 {

    public static boolean isNumber(String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    public static void dataInput(){
        Scanner sc=new Scanner(System.in);
        String choice;
        int vehicleType;
        while(true){
            System.out.print("Choose the vehicle type (1-Car, 2-Plane, 3-Ship: ");
            choice=sc.next();
            if(isNumber(choice)){
                vehicleType=Integer.parseInt(choice);
                switch(vehicleType){
                    case 1: VehicleBuilder.Type= Types.CAR;break;
                    case 2: VehicleBuilder.Type= Types.PLANE;break;
                    case 3: VehicleBuilder.Type= Types.SHIP;break;
                }
                break;
            }
            else{
                System.out.println("wrong format");
            }
        }
        while(true){
            System.out.print("Input the cost of the vehicle: ");
            choice=sc.next();
            if(isNumber(choice)){
                VehicleBuilder.cost=Integer.parseInt(choice);
                break;
            }
            else{
                System.out.println("wrong format");
            }
        }
        while(true){
            System.out.print("Input the speed of the vehicle: ");
            choice=sc.next();
            if(isNumber(choice)){
                VehicleBuilder.speed=Integer.parseInt(choice);
                break;
            }
            else{
                System.out.println("wrong format");
            }
        }

        while(true){
            System.out.print("Input the issue year of the vehicle: ");
            choice=sc.next();
            if(isNumber(choice)){
                VehicleBuilder.issueYear=Integer.parseInt(choice);
                break;
            }
            else{
                System.out.println("wrong format");
            }
        }
        while(true){
            System.out.print("Input the X-coordinate of the vehicle: ");
            choice=sc.next();
            if(isNumber(choice)){
                VehicleBuilder.x=Integer.parseInt(choice);
                break;
            }
            else{
                System.out.println("wrong format");
            }
        }
        while(true){
            System.out.print("Input the Y-coordinate of the vehicle: ");
            choice=sc.next();
            if(isNumber(choice)){
                VehicleBuilder.y=Integer.parseInt(choice);
                break;
            }
            else{
                System.out.println("wrong format");
            }
        }
        switch(vehicleType){
            case 2: setPlaneSpec();break;
            case 3: setShipSpec();break;
        }
    }


    private static void setPlaneSpec(){
        Scanner sc=new Scanner(System.in);
        String choice;
        while(true){
            System.out.print("Input the height of the vehicle: ");
            choice=sc.next();
            if(isNumber(choice)){
                VehicleBuilder.height=Integer.parseInt(choice);
                break;
            }
            else{
                System.out.println("wrong format");
            }
        }
        while(true){
            System.out.print("Input the passengers count of the vehicle: ");
            choice=sc.next();
            if(isNumber(choice)){
                VehicleBuilder.passCount=Integer.parseInt(choice);
                break;
            }
            else{
                System.out.println("wrong format");
            }
        }
    }


    private static void setShipSpec(){
        Scanner sc=new Scanner(System.in);
        String choice;
        System.out.print("Input the port of the vehicle: ");
        choice=sc.next();
        VehicleBuilder.port=choice;
        while(true){
            System.out.print("Input the passengers count of the vehicle: ");
            choice=sc.next();
            if(isNumber(choice)){
                VehicleBuilder.passCount=Integer.parseInt(choice);
                break;
            }
            else{
                System.out.println("wrong format");
            }
        }
    }

    public static void lab3(){
        String choice;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Choose the option:");
            System.out.println("1 - check the first sorting condition:");
            System.out.println("2 - check the second sorting condition:");
            System.out.println("3 - check the third sorting condition:");
            System.out.println("4 - check the interface-based sorting condition:");
            System.out.println("5 - create object by hand:");
            System.out.print("/>");
            choice=sc.next();
            if(isNumber(choice)){
                int var=Integer.parseInt(choice);
                if(var==2){
                    System.out.println("_______________________________________");
                    System.out.println("Now the second condtition sort is used:");
                    System.out.println("Basic unsorted array:");
                    System.out.println(VehicleBuilder.getVehicles());
                    System.out.println("_______________________________________");
                    System.out.println("Result sorted array:");
                    System.out.println(Helper.sortTwo(VehicleBuilder.getVehicles()));
                }
                if(var==3){
                    System.out.println("_______________________________________");
                    System.out.println("Now the third condtition sort is used:");
                    System.out.println("Basic unsorted array:");
                    System.out.println(VehicleBuilder.getVehicles());
                    System.out.println("_______________________________________");
                    System.out.println("Result sorted array:");
                    System.out.println(Helper.sortThree(VehicleBuilder.getVehicles()));
                }
                if(var==4){
                    System.out.println("_______________________________________");
                    System.out.println("Now the interface-based sort is used:");
                    System.out.println("Basic unsorted array (MOVABLES):");
                    System.out.println(VehicleBuilder.getMovables());
                    System.out.println("_______________________________________");
                    System.out.println("Result sorted array (MOVABLES):");
                    System.out.println(Helper.interfaceSort(VehicleBuilder.getMovables()));

                    System.out.println("_______________________________________");
                    System.out.println("Basic unsorted array (FLYABLES):");
                    System.out.println(VehicleBuilder.getFlyables());
                    System.out.println("_______________________________________");
                    System.out.println("Result sorted array (FLYABLES):");
                    System.out.println(Helper.interfaceSort(VehicleBuilder.getFlyables()));

                    System.out.println("_______________________________________");
                    System.out.println("Basic unsorted array (SWIMABLES):");
                    System.out.println(VehicleBuilder.getSwimables());
                    System.out.println("_______________________________________");
                    System.out.println("Result sorted array (SWIMABLES):");
                    System.out.println(Helper.interfaceSort(VehicleBuilder.getSwimables()));
                }
                if(var==5){
                    Lab3.dataInput();
                    System.out.println(VehicleBuilder.getVehicle(VehicleBuilder.Type));
                }

                break;
            }
            else{
                System.out.println("wrong format");
            }
        }
        //dataInput();
        //VehicleBuilder.getVehicle(VehicleBuilder.Type);
    }


}
