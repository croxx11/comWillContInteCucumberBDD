package comWilliamHillPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by User on 02/04/2017.
 */
public class HillLiveBetPage {

    public WebDriver driver;


                public HillLiveBetPage(WebDriver driver){
                    this.driver = driver;
                    PageFactory.initElements(driver,this);
                }
                @FindBy(how = How.CLASS_NAME,using = "inPlayLinks")
                public static WebElement Live;
                @FindBy(how = How.XPATH,using = "//*[@id='joinNowBtnHolder\']/a/span")
                public static WebElement Join;


                public void CheckCommentary(){
                    Live.click();
                    Join.click();

                }

    }
