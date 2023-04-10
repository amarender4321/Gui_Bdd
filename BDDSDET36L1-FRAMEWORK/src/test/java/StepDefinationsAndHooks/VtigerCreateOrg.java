package StepDefinationsAndHooks;

import java.util.Random;

import org.testng.Assert;

import bddSdet36L1.injector.Base;
import bddSdet36L1.pomPages.VtigerCreateNewOrganizationPage;
import bddSdet36L1.pomPages.VtigerHomePage;
import bddSdet36L1.pomPages.VtigerOrganizationInfoPage;
import bddSdet36L1.pomPages.VtigerOrganizationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VtigerCreateOrg {
	Base base;
	public VtigerCreateOrg(Base base) {
		this.base=base;
		
	}

@When("Homepage is displayed click on org link")
public void homepage_is_displayed_click_on_org_link() {
	VtigerHomePage homePage = new  VtigerHomePage(base.driver);
	homePage.clickOnOrgLnk();
}

@When("In organizations page click on create new org image")
public void in_organizations_page_click_on_create_new_org_image() {
VtigerOrganizationPage orgPage = new  VtigerOrganizationPage(base.driver);
orgPage.clickOnCreateOrgImg();
}

@When("In create new org page enter madatory fields and click on save button")
public void in_create_new_org_page_enter_madatory_fields_and_click_on_save_button() {
	
 VtigerCreateNewOrganizationPage createneworg = new VtigerCreateNewOrganizationPage(base.driver);
 createneworg.createNewOrg("Amazon");
}

@Then("Verify org is ctreated or not")
public void verify_org_is_ctreated_or_not() {
	int randomNumber = new Random().nextInt(1000);
	VtigerOrganizationInfoPage orginfoPage = new VtigerOrganizationInfoPage(base.driver);
	String actualOrgName = orginfoPage.OrgNameInfo();
	Assert.assertTrue(actualOrgName.contains("Amazon"+randomNumber));
   
}

}
