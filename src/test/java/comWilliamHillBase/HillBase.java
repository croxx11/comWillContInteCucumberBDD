package comWilliamHillBase;

import comWilliamHill.HillsHook;
import comWilliamHillPages.HiilsHomePage;
import comWilliamHillPages.HillFootballPage;
import comWilliamHillPages.HillLiveBetPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by User on 02/04/2017.
 */
public class HillBase {

    public static WebDriver driver;
    public  HiilsHomePage hmp;
    public HillFootballPage hfm;


                 public HillBase(){
                 this.driver = HillsHook.driver;

                     HiilsHomePage hmp = new HiilsHomePage(driver);
                     HillFootballPage hfm = new HillFootballPage(driver);
                     HillLiveBetPage hlbp = new HillLiveBetPage(driver);
             }

}
