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

              @FindBy(how = How.XPATH,using = "/html/body/div[3]/div[1]/div[2]/a")
              public static WebElement Log;





                public void AccessIn(){
                    Log.click();

              }

}
