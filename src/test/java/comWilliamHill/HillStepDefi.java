package comWilliamHill;

import comWilliamHillBase.HillBase;
import comWilliamHillPages.HiilsHomePage;
import comWilliamHillPages.HillFootballPage;
import comWilliamHillPages.HillLiveBetPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

/**
 * Created by User on 02/04/2017.
 */
public class HillStepDefi extends HillBase {

     WebDriver driver;


                     public HillStepDefi(){
                     this.driver = HillsHook.driver;

                 }

    @Given("^That am on WilliamHill home page$")
    public void that_am_on_WilliamHill_home_page() throws Throwable {
      driver.get("http://static.williamhill.com");


    }

    @Then("^Am able to click on football from main menu$")
    public void am_able_to_click_on_football_from_main_menu() throws Throwable {
        HiilsHomePage hmp = new HiilsHomePage(driver);
        hmp.AccessIn();


    }

    @When("^then am  able to see all live matches displayed$")
    public void then_am_able_to_see_all_live_matches_displayed() throws Throwable {
        HillFootballPage hfm = new HillFootballPage(driver);
        hfm.Search();
    }

    @When("^when i clicked on any live match displayed am able to see the match commentary$")
    public void when_i_clicked_on_any_live_match_displayed_am_able_to_see_the_match_commentary() throws Throwable {
        HillLiveBetPage hlbp = new HillLiveBetPage(driver);
        hlbp.CheckCommentary();
    }

}
