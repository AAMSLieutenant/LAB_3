package App;

import App.Controller.Controller;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;



public class Application {
    static{
        //new DOMConfigurator().doConfigure("log4j.xml", LogManager.getLoggerRepository());
        //new DOMConfigurator().doConfigure("log4j.txt", LogManager.getLoggerRepository());
    }

    public static final Logger logger=Logger.getLogger(Application.class);
    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");


            logger.info("Project is started");
//        Controller.dataInput();
//        System.out.println(VehicleBuilder.getVehicle(VehicleBuilder.Type));
        Controller.view();

//        ArrayList<AbstractVehicle> arr= VehicleBuilder.getVehicles();
//        for(AbstractVehicle ab : arr){
//            System.out.println(ab);
//
//        }
//        arr=Helper.sortTwo(arr);
//        System.out.println("ARR"+arr);
    }
}
