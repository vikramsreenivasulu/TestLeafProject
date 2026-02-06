package LeafAction;

import static org.testng.Assert.assertTrue;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//import org.openqa.selenium.support.ui.Select;

import LeafLocators.ElementLocators;
import Utility.BaseClass;

public class ElementMethods {

	public ElementMethod elementmethod;
	public DropDown dropdown;

	public Waits waits;

	public RadioBttns radiobttns;
	public TextBox textbox;

	public Button button;

	public CheckBox checkbox;
	
	public HyperLink hyperlink;
	public ElementLocators elementlocators = new ElementLocators();

	public ElementMethods() {
		elementmethod = new ElementMethod();
		dropdown = new DropDown();
		waits = new Waits();
		radiobttns = new RadioBttns();
		textbox = new TextBox();
		button = new Button();
		checkbox = new CheckBox();
		hyperlink = new HyperLink();
	}

	public class ElementMethod {

		public void ClickElement() {
			elementlocators.elementlocator.ClickElement.click();

		}
	}

	public class DropDown {

		public void ClickDropDown() {
			elementlocators.dropdowns.DropDown.click();
		}

		public void UIAuto() throws InterruptedException {
			Select a = new Select(elementlocators.dropdowns.UIAuto);
			a.selectByIndex(1);
		}

		public void Country(String country) throws InterruptedException {
			BaseClass.selectDropdown(elementlocators.dropdowns.Country, country);
		}

		public void City(String city) throws InterruptedException {
			BaseClass.selectDropdown(elementlocators.dropdowns.City, city);
		}

		public void Course(String course) throws InterruptedException {
			BaseClass.selectCourseDropdown(elementlocators.dropdowns.Course, course);

		}

		public void Language(String Lan) throws InterruptedException {
			BaseClass.selectDropdown(elementlocators.dropdowns.Language, Lan);
		}

		public void LanguageChoosen(String choosen) throws InterruptedException {
			BaseClass.selectDropdown(elementlocators.dropdowns.LanguageChoosen, choosen);

		}

	}// closing DropDown

	public class Waits {

		public void Clickwaits() {
			elementlocators.waits.ClickWaits.click();
		}

		public void WaitforVisibility() {
			elementlocators.waits.WaitforVisibility.click();
		}

		public void WaitforClickability() {
			elementlocators.waits.WaitforClickability.click();
		}

		public void ClickSecondBtn() throws InterruptedException {
			Thread.sleep(5000);
			WebDriverWait w2 = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(90));
			w2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='ui-growl-message']")));
			WebElement btn = w2.until(ExpectedConditions.elementToBeClickable(elementlocators.waits.ClickSecondBtn));
			btn.click();
			Thread.sleep(2000);
		}

		public void WaitforInvisibility() {
			elementlocators.waits.WaitforInvisibility.click();
			By disappearingElement = By.xpath("//button[contains(.,'I am about to hide')]");
			WebDriverWait w4 = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(30));
			w4.until(ExpectedConditions.invisibilityOfElementLocated(disappearingElement));
		}

		public void WaitforTextChange() {
			elementlocators.waits.WaitforTextChange.click();
			WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(10));
			By message = By.xpath("(//span[contains(@class,'ui-button-text')])[7]");
			wait.until(ExpectedConditions.not(ExpectedConditions.textToBe(message, "I am going to change!")));
			String newText = BaseClass.driver.findElement(message).getText();
			System.out.println("Text changed to: " + newText);
		}

	}// end of waits

	public class RadioBttns {

		public void ClickRadioBttn() throws InterruptedException {
			BaseClass.Sleep();
			elementlocators.radiobttns.ClickRadioBttn.click();
		}

		public void ChromeBrowser() {
			elementlocators.radiobttns.ChromeBrowser.click();
		}

		public void defaultBttn() {

			// 1st style
			boolean selected = elementlocators.radiobttns.defaultBttn.isSelected();
			if (Boolean.TRUE.equals(selected)) {
				System.out.println("**Safari radio button is selected by default**");
			} else {
				System.out.println("**Safari button is not selected**");
			}

			// 2nd Style
			WebElement safariRadio = elementlocators.radiobttns.defaultBttn;
			if (safariRadio.isSelected()) {
				System.out.println("**Safari radio button is selected by default**");
			} else {
				System.out.println("**Safari button is not selected**");
			}

			// 3rd style
			if (elementlocators.radiobttns.defaultBttn.isSelected()) {
				System.out.println("**Safari radio button is selected by default**");
			} else {
				System.out.println("**Safari button is not selected**");
			}

		}// closing defaultBttn

		public void UnSelected() {

			boolean unSelectable = elementlocators.radiobttns.UnSelectable.isSelected();
			if (unSelectable == false) {
				System.out.println("**Chennai radio button is Unselected**");
			} else {
				System.out.println("**Chennai button is  selected**");
			}
		}

		public void SelectAgeGrp() {

			boolean selected = elementlocators.radiobttns.SelectAgeGrp.isSelected();
			if (Boolean.TRUE.equals(selected)) {
				System.out.println("**Safari radio button is selected by default**");
				WebElement AgeSelector = BaseClass.driver
						.findElement(By.xpath("//label[normalize-space(text())='1-20 Years']"));
				AgeSelector.click();

			} else {
				elementlocators.radiobttns.SelectAgeGrp.click();
				System.out.println("**Safari button is not selected**");
			}
		}
	}// closing RadioBttns

	public class TextBox {

		public void Clicktextbox() {
			elementlocators.textbox.ClickTextBox.click();
		}

		public void TypeName(String typename) {
			elementlocators.textbox.TypeName.sendKeys(typename);
		}

		public void ErroMsg() {
//					Actions a = new Actions(BaseClass.driver);
//					 a.click(ErroMsg).build().perform();
			elementlocators.textbox.ErroMsg.sendKeys(Keys.ENTER);

		}

		public void AppendCity(String City) {
			elementlocators.textbox.AppendCity.clear();
			elementlocators.textbox.AppendCity.sendKeys(City);
		}

		public void PositionChanged() {

			elementlocators.textbox.PositionChange.click();

			String username = "";
			if (username.equals("")) {
				System.out.println("username positon was changed ");
			} else {
				System.out.println("username position was not changed");
			}
		}

		public void textboxdisabled() {

			boolean status = elementlocators.textbox.textboxdisabled.isEnabled();

			if (status != true) {
				System.out.println("it is disabled");
			} else {
				System.out.println("it is enabled");
			}
		}

		public void chooseThirdOpt(String name) {

			WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(10));
			WebElement chooseThirdOpt = wait
					.until(ExpectedConditions.elementToBeClickable(elementlocators.textbox.ChoosethirdOpt));

			chooseThirdOpt.sendKeys(name);

			WebElement element = BaseClass.driver
					.findElement(By.xpath(("(//span[@id='j_idt106:auto-complete_panel']//ul//li)[3]")));
			element.click();

		}// Closing chooseThirdOpt

		public void ClearText() {
			elementlocators.textbox.ClearText.clear();
		}

		public void DOBChoosen(String DOB) {

			elementlocators.textbox.DOBChoosen.sendKeys(DOB, Keys.ENTER, Keys.ESCAPE);
			System.out.println(DOB);
			// dateElement.sendKeys(Keys.ESCAPE);
			String Birth = "10/16/2000";
			if (Birth == DOB) {
				System.out.println("Given DOB is printed");
			} else {
				System.out.println("Given DOB is not printed");
			}
		}

		public void Retrieve() {

			String Text = elementlocators.textbox.Retrieve.getAttribute("Value");
			System.out.println("Retrieve text: " + Text);
			String Value = "My learning is superb so far.";
			if (Text != Value) {
				System.out.println("Retrieved Value is same ");
			} else {
				System.out.println("Retrieved Value is not same ");
			}
		}

		public void SpintheValue(String Value) throws InterruptedException {
			elementlocators.textbox.SpintheValue.sendKeys(Value);
			BaseClass.Sleep();
			BaseClass.Sleep();
			elementlocators.textbox.UpArrowSpin.click();
			BaseClass.Sleep();
			elementlocators.textbox.UpArrowSpin.click();

			if (Value.equals("121")) {
				System.out.println("Given Value Changed ");
			} else {
				System.out.println("Given Value is not Changed......");
			}
		}

		public void TypeMail(String Mail) {
			elementlocators.textbox.TypeMail.sendKeys(Mail);
		}

		public void Abouturself(String About) {
			elementlocators.textbox.Abouturself.sendKeys(About);
		}

		public void SliderMove(String Num) {
			elementlocators.textbox.SliderMove.sendKeys(Num);

		}

		public void KeyBoardAppead() {
			elementlocators.textbox.KeyBoardAppead.click();

			Boolean appears = elementlocators.textbox.KeyBoardPopup.isDisplayed();
			System.out.println("Keyboard is appears: " + appears);
			Assert.assertTrue(appears, "Keyboard is appears");

			// elementlocators.textbox.KeyBoardAppead.sendKeys(Keys.ESCAPE);

//					Actions actions = new Actions(BaseClass.driver);
//				    actions.sendKeys(Keys.ESCAPE).perform();
		}

		public void KeyboardClose() {
			elementlocators.textbox.KeyboardClose.click();
		}

		public void TextEditor(String text) throws InterruptedException {
			elementlocators.textbox.TextEditor.sendKeys(text);
			BaseClass.Sleep();
			elementlocators.textbox.Bold.click();
			BaseClass.Sleep();
			elementlocators.textbox.Italic.click();
			BaseClass.Sleep();
			elementlocators.textbox.Underline.click();
		}

		public void Toolbar(String tool) {
			elementlocators.textbox.Toolbar.sendKeys(tool);
		}
	}// Closing TextBox

	public class Button {

		public void ClickButton() {
			elementlocators.button.ClickButton.click();
		}

		public void Confirmtitle() {
			elementlocators.button.Confirmtitle.click();
		}

		public void Sendkeys(String possi) {
			elementlocators.button.SendKeys.sendKeys(possi);
		}

		public void heightWidth() {
			int height = elementlocators.button.Submit.getSize().getHeight();
			int width = elementlocators.button.Submit.getSize().getWidth();
			System.out.println("height of submit box" + height);
			System.out.println("width of submit box" + width);
		}

		public void disablebutton() {
			boolean disable = elementlocators.button.disablebutton.isEnabled();

			Assert.assertFalse(disable, "is not enables which means it is disabled");
			System.out.println("button is disable");

//			SoftAssert sa = new SoftAssert();
			Assert.assertEquals(disable, false, "is not enables which means it is disabled");
//			
//			sa.assertAll();	
			System.out.println("testing\nnew line\n\nanother line");
		}

		public void SuccessHover() {

			Actions hover = new Actions(BaseClass.driver);
			String actualValue = elementlocators.button.Success.getAttribute("style");

			hover.moveToElement(elementlocators.button.Success).build().perform();

			String actuchangedValuealValue = elementlocators.button.Success.getAttribute("style");

			Assert.assertNotEquals(actualValue, actuchangedValuealValue, "Value did nit changfe");
		}

		public void FindPosition() {
			Point location = elementlocators.button.FindPosition.getLocation();

			int Valuex = location.getX();
			int Valuey = location.getY();

			System.out.println("button value x position" + Valuex);
			System.out.println("button value y position" + Valuey);
		}

		public void Image() {
			elementlocators.button.Image.click();
		}

		public void EmptySpace() {
			elementlocators.button.Emptyspace.click();
		}

		public void FindColor() {
			String backgroundcolor = elementlocators.button.FindColor.getCssValue("background-color");
			System.out.println("backgroundcolor " + backgroundcolor);

		}

		public void roundedButtons() {

			int size = elementlocators.button.roundedButtons.size();
			System.out.println("Number of round buttons: " + size);
		}
	}// Closing Button

	public class CheckBox {

		public void ClickCheckBox() {
			elementlocators.checkbox.ClickCheckBox.click();
		}

		public void BasicCheckBox() {
			elementlocators.checkbox.BasicCheckBox.click();
		}

		public void ToggleSwitch() {

//			WebElement element = driver.findElement(By.id("submit"));
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].click();", element);

			WebElement toggleSwitch = elementlocators.checkbox.ToggleSwitch;
			JavascriptExecutor js = (JavascriptExecutor) BaseClass.driver;
			js.executeScript("arguments[0].click();", toggleSwitch);

			boolean Toggledisplayed = elementlocators.checkbox.ToggleChecked.isDisplayed();
			Assert.assertTrue(Toggledisplayed, "is not displayed");

			// Assert.assertFalse(disable, "is not enables which means it is disabled");
		}

		public void Notification() throws InterruptedException {

			BaseClass.Sleep();
			elementlocators.checkbox.Notification.click();
			BaseClass.Sleep();
			boolean NotiCheck = elementlocators.checkbox.NotifyCheck.isDisplayed();
			Assert.assertTrue(NotiCheck, "is not displayed");
		}

		public void CheckBoxDisabled() {

			boolean disable = elementlocators.checkbox.CheckBoxDisabled.isEnabled();
			Assert.assertFalse(disable, "check box is Enabled");

			System.out.println("checkbox is disable");
		}

		
		
		public void FavLang() {

			List<WebElement> totalLang = elementlocators.checkbox.FavLang;
			int count = totalLang.size();
			System.out.println("Total Clickable checkboxes: " + count);

			for (int i = 0; i <3; i++) {
				totalLang.get(i).click();
				System.out.println(totalLang.get(i).getText());
			}	
		}
			
/*//				for (int i = 0; i <count; i++) {
//				String tempText = totalLang.get(i).getText();
//				if(tempText.equalsIgnoreCase("Java")  || tempText.equalsIgnoreCase("C-Sharp")) 
//				{
//					 totalLang.get(i).click();
//				}
*/			
		
		public void SelectMulti() throws InterruptedException {
			elementlocators.checkbox.SelectMulti.click();
			BaseClass.Sleep();
			BaseClass.Sleep();
			elementlocators.checkbox.DropDown.click();
			BaseClass.Sleep();
			elementlocators.checkbox.DropDownClose.click();
		}
		
		
		public void TriStateCheckBox() {
			
			   WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(5));
			while (true) {
		        
		        WebElement stateElement = wait.until(
		                ExpectedConditions.visibilityOf(elementlocators.checkbox.StateValue));

		        String text = stateElement.getText();
		        String value = text.split("=")[1].trim();
		        System.out.println( value);
		        if (value.equals("0")) {
		            break;
		        }
		        elementlocators.checkbox.TriStateCheckBox.click();
		    }
		
		}
		
	}//checkboxClosing
		
	
	public class HyperLink{
		
		public void ClickHypeLink() {
			elementlocators.hyperlinks.ClickHypeLink.click();
		}
		
		public void DashBoard() {
			elementlocators.hyperlinks.DashBoard.click();
	}
		
		public void destination() {
			String destination = elementlocators.hyperlinks.destination.getAttribute("href");
			System.out.println("Find my destination:"+destination);
		}
		
		public void CountLinks() {
			
			//no. of element use chesetapudu manam list<> tag ni vaadali
			
			int size = elementlocators.hyperlinks.CountLinks.size();
			System.out.println("size of counted links:"+size);
		}
		
		public void CountLayoutLinks() {
			int size = elementlocators.hyperlinks.CountLayoutLinks.size();
			System.out.println("Counted links in layout"+size);
		}
		
		public void BrokenLink() {

			WebElement link = elementlocators.hyperlinks.BrokenLink;
			String href = link.getDomProperty("href");

			try {
//  Convert String → URL
				URL url = new URI(href).toURL();

//  Open connection
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.connect();
				System.out.println(connection.getResponseCode());

				Assert.assertTrue(connection.getResponseCode() >= 400, "The Link is not Broken");

			} catch (Exception e) {
				System.out.println("Exception while checking link: " + e.getMessage());
			}
		}		
//-----------------------------------------------------------
			/*
			   Links -
				When we click on a link, the client request will go to the server.
				Then it will fetch the resource and return it to client
			Broken Links-
				When the link we clicked dont have any resource on server side, then the link is broken link
				Eg : Page not found, 404 error etc

			Note - If the link is having resource in server, then the resource will be returned
	   			If the link dont have no resource, then it will return a status code
	   			We can find if the link is broken or not by the status code return
	   			By analyzing the status code, we can find if the link is broken or not

			Conditions for checking broken link
				>A link should have href attribute and corresponding value (eg href = "https://abc.com") 
				>Then the url will be hit with a request to server
					Once we hit the server, it will return a status code
				>If status code is greater than 400, then the link is broken
			We need to repeat this step for all links to check if its broken or not
			 */
			

			public void checkAllLinkStatus() {
				
				//  getting all the links into a variable    
				List<WebElement> links = BaseClass.driver.findElements(By.tagName("a"));
				// Total links
				System.out.println(links.size());
				// checking if href links has value
				int brokenLinkCount = 0;
				for (WebElement linkElement : links) {
					String hrefAttribute = linkElement.getDomProperty("href"); // getAttribute() is deprecated

					if (hrefAttribute == null || hrefAttribute.isEmpty()) { // checking if the hrefattrubute have value
																			// or not
						System.out.println("href attrubite is not available");
						continue; // go to next iteration
					}
					// sending the request to server if the hrefattribute has value
					// we need to convert the href value from string to URL
					try {
						URL linkUrl = new URI(hrefAttribute).toURL(); // URL url = new URL is deprecated
						HttpURLConnection connectLinkURL = (HttpURLConnection) linkUrl.openConnection(); // open connection
						connectLinkURL.connect(); // send request to server
						//getting status code from the connectLinkURL
						if (connectLinkURL.getResponseCode() >= 400) {
							System.out.println(hrefAttribute + " is broken");
							brokenLinkCount++;
						} else
							System.out.println(hrefAttribute + " is not a broken");
					} catch (Exception e) { // catching all exceptions instead of URISyntaxException, IOException

					}
				}
				System.out.println("Total broken Links " + brokenLinkCount);

			}
		}	

	}// main Closing



