package bddSdet36L1.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class VtigerHomePage {

	//Step 1: Declaration
			@FindBy(linkText = "Organizations")
			private WebElement organizationLnk;
			
			@FindBy(linkText = "Contacts")
			private WebElement contactsLnk;
			
			@FindBy(linkText = "Opportunities")
			private WebElement opportunitiesLnk;
			
			@FindBy(linkText = "Products")
			private WebElement productsLnk;
			
			@FindBy(linkText = "More")
			private WebElement moreLnk;
			
			@FindBy(linkText = "Campaigns")
			private WebElement campaignsLnk;
			
			@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
			private WebElement adminisrtatorImg;
			
			@FindBy(linkText = "Sign Out")
			private WebElement signOutLnk;
			
			//Step 2: initialization
			public VtigerHomePage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}

			//Step 3: generate Getters
			public WebElement getOrganizationLnk() {
				return organizationLnk;
			}

			public WebElement getContactsLnk() {
				return contactsLnk;
			}

			public WebElement getOpportunitiesLnk() {
				return opportunitiesLnk;
			}

			public WebElement getProductsLnk() {
				return productsLnk;
			}

			public WebElement getMoreLnk() {
				return moreLnk;
			}

			public WebElement getCampaignsLnk() {
				return campaignsLnk;
			}

			public WebElement getAdminisrtatorImg() {
				return adminisrtatorImg;
			}

			public WebElement getSignOutLnk() {
				return signOutLnk;
			}
			
			//Business Library
			public void clickOnOrgLnk()
			{
				organizationLnk.click();
			}
			
			public void clickOnContactLnk()
			{
				contactsLnk.click();
			}

}
