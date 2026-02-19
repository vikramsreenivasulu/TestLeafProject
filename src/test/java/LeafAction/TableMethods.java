package LeafAction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import LeafLocators.TableLocators;
import Utility.BaseClass;

public class TableMethods {

	public TableMethod tablemethod;
	
	public InsideTable insidetable;
	
	public Grid grid;
	
	public DynamicGrid dynamicgrid;
	
	public Calendar calendar;
	public TableLocators tablelocators = new TableLocators();
	
	public TableMethods() {
		tablemethod = new TableMethod();
		insidetable = new InsideTable();
		grid     = new Grid();
		dynamicgrid = new DynamicGrid();
		calendar = new Calendar();
	}
	
	public class TableMethod{
		
		public void ClickTable() {
			tablelocators.tablelocator.ClickTable.click();
		}
	}
	
	public class InsideTable {
		
		public void InsideTableClick() {
			tablelocators.insidetable.InsideTableClick.click();
		}
		
		
		
		
		
	}//EndInsideTable
	
	public class Grid{
		
		public void ClickGrid() {
			tablelocators.grid.ClickGrid.click();
		}
		
		public void CreatingNewItem() {
			tablelocators.grid.CreatingNewItem.click();
		}
		
		public void CreatingNewItemName(String Name) {
			tablelocators.grid.CreatingNewItemName.sendKeys(Name);
		}
		
		public void CreatingNewItemDescription(String Descrip) {
			tablelocators.grid.CreatingNewItemDescription.sendKeys(Descrip);
		}
		
		public void Category() {
			tablelocators.grid.Category.click();
		}

		public void Price(String Price) throws InterruptedException {

			tablelocators.grid.Price.sendKeys(Keys.CONTROL + "a");
			tablelocators.grid.Price.sendKeys(Keys.CLEAR);
			BaseClass.Sleep();
			WebElement price = tablelocators.grid.Price;	
			//price.sendKeys(Price);
			((JavascriptExecutor) BaseClass.driver).executeScript("arguments[0].value='" + Price + "';", price);
		}
		
		public void ProductQuantity(String Quantity) {
			tablelocators.grid.ProductQuantity.sendKeys(Keys.CONTROL + "a");
			tablelocators.grid.ProductQuantity.sendKeys(Keys.DELETE);
			tablelocators.grid.ProductQuantity.sendKeys(Quantity);
		}
		
		public void ProductSave() {
			tablelocators.grid.ProductSave.click();
		}
		
		public void ProductAdded() {
			
			boolean AddedProcDisplayed = tablelocators.grid.ProductAdded.isDisplayed();
			Assert.assertTrue(AddedProcDisplayed, "producted is not added");
		}
		public void Search(String search) throws InterruptedException {
			BaseClass.Sleep();
			tablelocators.grid.Search.sendKeys(search);
		}
		
		public void ProductEdit(String name) {

			WebElement tableRow = BaseClass.getTableRow(tablelocators.grid.GridTable, name);
			tableRow.findElement(By.xpath(".//button[contains(@class,'edit-button')]")).click();

		}
		
		public void Re_Price(String Price) throws InterruptedException {
			tablelocators.grid.Re_Price.sendKeys(Keys.CONTROL + "a");
			tablelocators.grid.Re_Price.sendKeys(Keys.CLEAR);
			BaseClass.Sleep();
			tablelocators.grid.Re_Price.sendKeys(Price);
		}
		public void Re_EditQuantity(String Quantity) throws InterruptedException {
			
			tablelocators.grid.Re_EditQuantity.sendKeys(Keys.CONTROL + "a");
			tablelocators.grid.Re_EditQuantity.sendKeys(Keys.CLEAR);
			BaseClass.Sleep();
			tablelocators.grid.Re_EditQuantity.sendKeys(Quantity);
		}
		
		
		public void Re_EditSave() {
			tablelocators.grid.Re_EditSave.click();
		}
		
		public void ClickCheckBox(String name) {
			
			WebElement clickcheckbox = BaseClass.getTableRow(tablelocators.grid.GridTable, name);
			clickcheckbox.findElement(By.xpath(".//div[@class='ui-chkbox ui-widget']")).click();
		}
		
		public void Import() {
			String FileName = "redtape sneakers.png";
			tablelocators.grid.Import.sendKeys("D:\\leafground\\".concat(FileName));
		}
		
		public void Export() {
			tablelocators.grid.Export.click();
		}
		public void DeleteProduct() {
			tablelocators.grid.DeleteProduct.click();
		}
		
		public void DeleteYes() {
			tablelocators.grid.DeleteYes.click();
			
			//Verifying Deleted Toasted Msg
			boolean verifydelete = tablelocators.grid.VerifyDelete.isDisplayed();
			Assert.assertTrue(verifydelete, "is not deleted");
		}
	}//endGrid
	
	public class DynamicGrid{
		
		public void ClickDyGrid() {
			tablelocators.dynamicgrid.ClickDyGrid.click();
		}
		
		public void Search(String search) {
			tablelocators.dynamicgrid.Search.clear();
			tablelocators.dynamicgrid.Search.sendKeys(search);
		}
		
		public void ValueFromCells() {
			String text = tablelocators.dynamicgrid.ValueFromCells.getText();
			System.out.println(text);
		}
		
		
		public void ValueFromNameColumn() {
			
			
			WebElement tableHeadName1 = tablelocators.dynamicgrid.TableHeadNames;
			WebElement element = tableHeadName1.findElement(By.xpath(".//tr//th[1]"));
			String name = element.getText();
			System.out.println("               "+name);
			
			WebElement Names = tablelocators.dynamicgrid.Table;
			List<WebElement> elements = Names.findElements(By.xpath(".//tbody//tr//td[1]"));
			for (WebElement webElement : elements) {
				String text = webElement.getText();
				System.out.println("Name:"+text);
			} 
			
		}
		
		public void ValueFromDateColumn() {
			
			WebElement tableHeadDate1 = tablelocators.dynamicgrid.TableHeadNames;
			WebElement element = tableHeadDate1.findElement(By.xpath(".//tr//th[2]"));
			String date = element.getText();
			System.out.println("               "+date);
			
			WebElement Dates = tablelocators.dynamicgrid.Table;
		List<WebElement> elements = Dates.findElements(By.xpath(".//tbody//tr//td[2]"));
			for (WebElement webElement : elements) {
				String text = webElement.getText();
				System.out.println("Date:"+text);
			}
		}
		
		
		
		public void ValueFromStatusColumn() {
			
			WebElement tableHeadStatus1 = tablelocators.dynamicgrid.TableHeadNames;
			WebElement element = tableHeadStatus1.findElement(By.xpath(".//tr//th[3]"));
			String status = element.getText();
			System.out.println("               "+status);
			
			WebElement Status = tablelocators.dynamicgrid.Table;
			List<WebElement> elements = Status.findElements(By.xpath(".//tr//td[3]"));
			for (WebElement webElement : elements) {
				String text = webElement.getText();
				System.out.println("Status:"+text);
			}
		}
		
		public void ValueFromActivityColumn() {
			
			WebElement tableHeadActivity1 = tablelocators.dynamicgrid.TableHeadNames;
			WebElement element = tableHeadActivity1.findElement(By.xpath(".//tr//th[4]"));
			String activity = element.getText();
			System.out.println("               "+activity);
			
			
			WebElement Activity = tablelocators.dynamicgrid.Table;
			List<WebElement> elements = Activity.findElements(By.xpath(".//tr//td[4]"));
			for (WebElement webElement : elements) {
				String text = webElement.getText();
				System.out.println("Activity:"+text);
			}
		}
		
	}//DynamicGrid
	
	
	public class Calendar{
		
		public void ClickCalender() {
			
			tablelocators.calendar.ClickCalendar.click();
		}
		
		
		public void ClickPrevious(String date) {
			tablelocators.calendar.ClickPrevious.click();
			
			BaseClass.driver.findElement(By.xpath("//td[@data-date='"+date+"']")).click();
			
		}
		
								public void JanEventDetails(String title) {
									
									tablelocators.calendar.janeventdetails.SendTitle.sendKeys(title);
									
									//Clicking the AllDays button
									tablelocators.calendar.janeventdetails.AllDays.click();
									
									//Clicking the Save Button
									tablelocators.calendar.janeventdetails.Save.click();
									
									//Verifying the text
									String text = tablelocators.calendar.janeventdetails.VerifyOnTheDay.getText();
									System.out.println("Retrive_Value: "+text);
									Assert.assertEquals(text, "Sankranthi", "Testfailed");
								}//end JanEventDetails
		
		public void Currentdate(String date) {
			tablelocators.calendar.Currentdate.click();
			
			BaseClass.driver.findElement(By.xpath("//td[@data-date='"+date+"']")).click();
		}
		
								public void FebEventDetails(String title) {
									
									tablelocators.calendar.febeventdetails.SendTitle.sendKeys(title);
									
									//Clicking the AllDays button
									tablelocators.calendar.febeventdetails.AllDays.click();
									
									//Clicking the Save Button
									tablelocators.calendar.febeventdetails.Save.click();
									
									//Verifying the text
									String text = tablelocators.calendar.febeventdetails.VerifyOnTheDay.getText();
									System.out.println("Retrive_Value: "+text);
									Assert.assertEquals(text, "Client A Meeting", "Testfailed");
								}//end FebEventDetails
		
		public void NxtMonth(String date) {
			tablelocators.calendar.NxtMonth.click();
			
			BaseClass.driver.findElement(By.xpath("//td[@data-date='"+date+"']")).click();
		}
		
								public void MarEventDetails(String title) {
									
									tablelocators.calendar.mareventdetails.SendTitle.sendKeys(title);
									
									//Clicking the AllDays button
									tablelocators.calendar.mareventdetails.AllDays.click();
									
									//Clicking the Save Button
									tablelocators.calendar.mareventdetails.Save.click();
									
									//Verifying the text
									String text = tablelocators.calendar.mareventdetails.VerifyOnTheDay.getText();
									System.out.println("Retrive_Value: "+text);
									Assert.assertEquals(text, "Ugadhi", "Testfailed");
								}//end MarEventDetails
	}//Calendar
	
	
	
	
	
}//End TableMethods
