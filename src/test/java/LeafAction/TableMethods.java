package LeafAction;

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
	public TableLocators tablelocators = new TableLocators();
	
	public TableMethods() {
		tablemethod = new TableMethod();
		insidetable = new InsideTable();
		grid     = new Grid();
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
	
}//End TableMethods
