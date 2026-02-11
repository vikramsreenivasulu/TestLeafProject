package LeafAction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

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

		public void Price(String Price) {

			WebElement price = tablelocators.grid.Price;	
			price.click();
			price.clear();
			//price.sendKeys(Price);
			((JavascriptExecutor) BaseClass.driver).executeScript("arguments[0].value='" + Price + "';", price);
		}
		
		public void ProductQuantity(String Quantity) {
			tablelocators.grid.ProductQuantity.clear();
			tablelocators.grid.ProductQuantity.sendKeys(Quantity);
		}
		
		public void ProductSave() {
			tablelocators.grid.ProductSave.click();
		}
		
		public void Search(String search) {
			tablelocators.grid.Search.sendKeys(search);
		}
		
		public void ProductEdit() {
			
			JavascriptExecutor js = (JavascriptExecutor) BaseClass.driver;
			WebElement productEditClick = tablelocators.grid.ProductEdit;
			js.executeScript("arguments[0].click();", productEditClick);
			
		}
		
		public void Re_EditQuantity(String Quantity) {
			tablelocators.grid.Re_EditQuantity.sendKeys(Quantity);
		}
		
		public void Re_EditSave() {
			tablelocators.grid.Re_EditSave.click();
		}
	}//endGrid
	
}//End TableMethods
