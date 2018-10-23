package App;

import App.Controller.Controller;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import java.util.Locale;
import java.util.ResourceBundle;



public class Application {

    public static final Logger logger=Logger.getLogger(Application.class);
    public static void main(String[] args) {
//        Locale rus=new Locale("ru","RU");
//        System.out.println(rus.getCountry());
//        ResourceBundle rb=ResourceBundle.getBundle("text",rus);


        PropertyConfigurator.configure("log4j.properties");
        logger.info("Project is started");
        Controller.view();
    }
}
