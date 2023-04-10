package bddSdet36L1.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class VtigerOrganizationInfoPage {

	//Step 1: declaration
			@FindBy(xpath = "//span[@class='dvHeaderText']")
			private WebElement headerText;
			
			//Step 2: initialization
			public VtigerOrganizationInfoPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}

			//Step 3: utilization
			public WebElement getHeaderText() {
				return headerText;
			}
			
			//business library
			public String OrgNameInfo()
			{
				String OrgInfo = headerText.getText();
				return OrgInfo;
			}

}
