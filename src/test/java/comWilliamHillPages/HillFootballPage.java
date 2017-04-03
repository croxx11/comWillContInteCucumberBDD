package comWilliamHillPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by User on 02/04/2017.
 */
public class HillFootballPage {

    public WebDriver driver;

              public HillFootballPage(WebDriver driver){
                  this.driver = driver;
                  PageFactory.initElements(driver,this);

              }
        @FindBy(how = How.ID,using = "football")
             public static WebElement Football;


                 public void Search(){
                     Football.click();
                 }
}
