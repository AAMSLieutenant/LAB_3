package App.Controller;

import App.Model.Builder.Types;
import App.Model.Builder.VehicleBuilder;
import App.Model.Help.Helper;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import java.util.Locale;
import java.util.ResourceBundle;
import java.io.UnsupportedEncodingException;

public class Controller {

    private static Locale current;
    private static ResourceBundle rb;

    private static final Logger log=Logger.getLogger(Controller.class);
    {
        PropertyConfigurator.configure("log4j.properties");
    }

    private static void getLocale(){
        String choice=new String();
        Scanner sc=new Scanner(System.in);
        String country=new String();
        String language=new String();
        while(true){
            System.out.print("Choose your language: (1-english, 2-українська, 3-русский:");
            choice=sc.next();
            if(isNumber(choice)){
                int c=Integer.parseInt(choice);
                switch(c){
                    case 1:country="US";language="EN";break;
                    case 2:country="UA";language="UK";break;
                    case 3:country="RU";language="RU";break;
                }
                break;
            }
            else{
                log.error("User made mistake in choosing the language");
                System.out.println("wrong format");
            }
        }
        current=new Locale(language,country);
        rb=ResourceBundle.getBundle("text",current);
        String st=rb.getString("strTypeChoice");
//        String s1=new String();
//        try{
//            s1=new String(st.getBytes("cp1252"), "cp1251");
//        }
//        catch(Exception e){}
//        System.out.println(s1);
    }


    public static boolean isNumber(String s){
        try {
            Integer.parseInt(s);
            log.info("User made an input in Controller:dataInput()");
            return true;
        } catch (NumberFormatException e) {
            log.error("User made wrong input in Controller:dataInput()");
            return false;
        }

    }

    public static void dataInput(){
        try {
            Scanner sc = new Scanner(System.in);
            String choice;
            int vehicleType;
            while (true) {
                System.out.print(rb.getString("strTypeChoice"));
                choice = sc.next();
                if (isNumber(choice)) {
                    vehicleType = Integer.parseInt(choice);
                    switch (vehicleType) {
                        case 1:
                            VehicleBuilder.Type = Types.CAR;
                            log.info("User have chosen Type.CAR");
                            break;
                        case 2:
                            VehicleBuilder.Type = Types.PLANE;
                            log.info("User have chosen Type.PLANE");
                            break;
                        case 3:
                            VehicleBuilder.Type = Types.SHIP;
                            log.info("User have chosen Type.SHIP");
                            break;
                    }
                    break;
                } else {
                    log.error("User made mistake in choosing the type");
                    String st=rb.getString("strWrongFormat");
                    String res=new String(st.getBytes("cp1252"), "cp1251");
                    System.out.println(res);
                }
            }
            while (true) {
                String st=rb.getString("strCostInput");
                String res=new String(st.getBytes("cp1252"), "cp1251");
                System.out.print(res);
                choice = sc.next();

                if (isNumber(choice)) {
                    VehicleBuilder.cost = Integer.parseInt(choice);
                    log.info("User inserted the cost");
                    break;
                } else {
                    //System.out.println("wrong format");
                    log.error("User made mistake in inserting the cost");
                    st=rb.getString("strWrongFormat");
                    res=new String(st.getBytes("cp1252"), "cp1251");
                    System.out.println(res);
                }
            }
            while (true) {
                String st=rb.getString("strSpeedInput");
                String res=new String(st.getBytes("cp1252"), "cp1251");
                System.out.println(res);
                choice = sc.next();
                if (isNumber(choice)) {
                    VehicleBuilder.speed = Integer.parseInt(choice);
                    log.info("User inserted the speed");
                    break;
                } else {
                    System.out.println("wrong format");
                    log.error("User made mistake in inserting the speed");
                    st=rb.getString("strWrongFormat");
                    res=new String(st.getBytes("cp1252"), "cp1251");
                    System.out.println(res);
                }
            }

            while (true) {

                String st=rb.getString("strIssueYearInput");
                String res=new String(st.getBytes("cp1252"), "cp1251");
                System.out.println(res);
                choice = sc.next();
                if (isNumber(choice)) {
                    VehicleBuilder.issueYear = Integer.parseInt(choice);
                    log.info("User inserted the issueYear");
                    break;
                } else {

                    log.error("User made mistake in inserting the year");
                    st=rb.getString("strWrongFormat");
                    res=new String(st.getBytes("cp1252"), "cp1251");
                    System.out.println(res);
                }
            }
            while (true) {
                String st=rb.getString("strXcordInput");
                String res=new String(st.getBytes("cp1252"), "cp1251");
                System.out.println(res);
                choice = sc.next();
                if (isNumber(choice)) {
                    VehicleBuilder.x = Integer.parseInt(choice);
                    log.info("User inserted the X-coordinate");
                    break;
                } else {
                    log.error("User made mistake in inserting the X-coordinate");
                    st=rb.getString("strWrongFormat");
                    res=new String(st.getBytes("cp1252"), "cp1251");
                    System.out.println(res);
                }
            }
            while (true) {
                String st=rb.getString("strXcordInput");
                String res=new String(st.getBytes("cp1252"), "cp1251");
                System.out.println(res);
                choice = sc.next();
                if (isNumber(choice)) {
                    VehicleBuilder.y = Integer.parseInt(choice);
                    log.info("User inserted the X-coordinate");
                    break;
                } else {

                    log.error("User made mistake in inserting the Y-coordinate");
                    st=rb.getString("strWrongFormat");
                    res=new String(st.getBytes("cp1252"), "cp1251");
                    System.out.println(res);
                }
            }
            switch (vehicleType) {
                case 2:
                    setPlaneSpec();
                    break;
                case 3:
                    setShipSpec();
                    break;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }


    private static void setPlaneSpec() throws UnsupportedEncodingException{
        Scanner sc=new Scanner(System.in);
        String choice;
        while(true){
            String st=rb.getString("strHeightInput");
            String res=new String(st.getBytes("cp1252"), "cp1251");
            System.out.println(res);
            choice=sc.next();
            if(isNumber(choice)){
                VehicleBuilder.height=Integer.parseInt(choice);
                log.info("User inserted the height");
                break;
            }
            else{

                log.error("User made mistake in inserting the height");
                st=rb.getString("strWrongFormat");
                res=new String(st.getBytes("cp1252"), "cp1251");
                System.out.println(res);
            }
        }
        while(true){
            String st=rb.getString("strPassInput");
            String res=new String(st.getBytes("cp1252"), "cp1251");
            System.out.println(res);
            choice=sc.next();
            if(isNumber(choice)){
                VehicleBuilder.passCount=Integer.parseInt(choice);
                log.info("User inserted the passengers count");
                break;
            }
            else{

                log.error("User made mistake in inserting the passengers count");
                st=rb.getString("strWrongFormat");
                res=new String(st.getBytes("cp1252"), "cp1251");
                System.out.println(res);
            }
        }
    }


    private static void setShipSpec() throws UnsupportedEncodingException{
        Scanner sc=new Scanner(System.in);
        String choice;
        String st=rb.getString("strPortInput");
        String res=new String(st.getBytes("cp1252"), "cp1251");
        System.out.println(res);
        choice=sc.next();
        VehicleBuilder.port=choice;
        log.info("User inserted the height");

        while(true){
            st=rb.getString("strPassInput");
            res=new String(st.getBytes("cp1252"), "cp1251");
            System.out.println(res);
            choice=sc.next();
            if(isNumber(choice)){
                VehicleBuilder.passCount=Integer.parseInt(choice);
                log.info("User inserted the passengers count");
                break;
            }
            else{

                log.error("User made mistake in inserting the passengers count");
                st=rb.getString("strWrongFormat");
                res=new String(st.getBytes("cp1252"), "cp1251");
                System.out.println(res);
            }
        }
    }

    public static void view(){

        getLocale();
        try {
            String choice;
            Scanner sc = new Scanner(System.in);
            while (true) {
//            System.out.println("Choose the option:");
//            System.out.println("1 - check the first sorting condition:");
//            System.out.println("2 - check the second sorting condition:");
//            System.out.println("3 - check the third sorting condition:");
//            System.out.println("4 - check the interface-based sorting condition:");
//            System.out.println("5 - create object by hand:");
//            System.out.print("/>");
                String st = rb.getString("strMenu");
                String res = new String(st.getBytes("cp1252"), "cp1251");
                System.out.print(res);

                choice = sc.next();
                if (isNumber(choice)) {
                    int var = Integer.parseInt(choice);
                    if (var == 1) {
                        log.info("User have chosen the first sort");
                        System.out.println("_______________________________________");
                        System.out.println("Now the first condition sort is used:");
                        System.out.println("Basic unsorted array:");
                        System.out.println(VehicleBuilder.getVehicles());
                        System.out.println("_______________________________________");
                        System.out.println("Result sorted array:");
                        System.out.println(Helper.sortOne(VehicleBuilder.getVehicles()));
                    }
                    if (var == 2) {
                        log.info("User have chosen the second sort");
                        System.out.println("_______________________________________");
                        System.out.println("Now the second condtition sort is used:");
                        System.out.println("Basic unsorted array:");
                        System.out.println(VehicleBuilder.getVehicles());
                        System.out.println("_______________________________________");
                        System.out.println("Result sorted array:");
                        System.out.println(Helper.sortTwo(VehicleBuilder.getVehicles()));
                    }
                    if (var == 3) {
                        log.info("User have chosen the third sort");
                        System.out.println("_______________________________________");
                        System.out.println("Now the third condtition sort is used:");
                        System.out.println("Basic unsorted array:");
                        System.out.println(VehicleBuilder.getVehicles());
                        System.out.println("_______________________________________");
                        System.out.println("Result sorted array:");
                        System.out.println(Helper.sortThree(VehicleBuilder.getVehicles()));
                    }
                    if (var == 4) {
                        log.info("User have chosen the interface-based sort");
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
                    if (var == 5) {
                        log.info("User have chosen the manual data insert");
                        Controller.dataInput();
                        System.out.println(VehicleBuilder.getVehicle(VehicleBuilder.Type));
                    }

                } else {
                    System.out.println("wrong format");
                    log.error("wrong insert in the main menu");
                }
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
