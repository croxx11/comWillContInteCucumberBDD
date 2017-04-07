package comWilliamHillPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by User on 02/04/2017.
 */
public class HiilsHomePage {

    public  WebDriver driver;

                      public HiilsHomePage(WebDriver driver){
                      this.driver = driver;
                   PageFactory.initElements(driver,this);

              }

              @FindBy(how = How.CSS,using = ".login>a")
              public static WebElement Log;





                public void AccessIn(){
                    Log.click();

              }

}
