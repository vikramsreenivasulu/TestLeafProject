package LeafLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class TableLocators {

	public TableLocator tablelocator;
	
	public InsideTable insidetable;
	
	public Grid grid;
	
	public  TableLocators(){
		
		tablelocator= new TableLocator();
		insidetable = new InsideTable();
		grid = new Grid();
		
	}
	
	public class TableLocator{
		
		public TableLocator() {
			PageFactory.initElements(BaseClass.driver, this);
		}
		
		@FindBy(xpath="//i[contains(@class,'pi pi-table')]")
		public WebElement ClickTable;
	}

	public class InsideTable{
		
		public InsideTable() {
			 PageFactory.initElements(BaseClass.driver, this);
		}
		
		@FindBy(xpath="//a[starts-with(@href, '/table.xhtml')]")
		public WebElement InsideTableClick;
		
		
	}//EndInsideTable
	
	public class Grid{
		
		public Grid() {
			PageFactory.initElements(BaseClass.driver, this);
		}
		
		@FindBy(xpath="//a[starts-with(@href, '/grid.xhtml')]")
		public WebElement ClickGrid;
		
		@FindBy(xpath="(//span[contains(@class,'ui-button-icon-left ui-icon')])[1]")
		public WebElement CreatingNewItem;
		
		@FindBy(xpath="//input[@id='form:name']")
		public WebElement CreatingNewItemName;
		
		@FindBy(xpath="//textarea[contains(@class,'ui-inputfield ui-inputtextarea')]")
		public WebElement CreatingNewItemDescription;
		
		@FindBy(xpath="//label[normalize-space(text())='Accessories']")
		public WebElement Category;
		
		@FindBy(xpath="//input[@id='form:price_input']")
		public WebElement Price;
		
		@FindBy(xpath="//input[@aria-labelledby='form:j_idt150']")
		public WebElement ProductQuantity;
		
		@FindBy(xpath="//span[normalize-space(text())='Save']")
		public WebElement ProductSave;
		
		@FindBy(xpath="//span[normalize-space(text())='Product Added']")
		public WebElement ProductAdded;
		
		@FindBy(xpath="(//input[contains(@class,'ui-inputfield ui-inputtext')])[1]")
		public WebElement Search;
		
		@FindBy(xpath="//button[@id='form:dt-products:0:j_idt114']")     

		public WebElement ProductEdit;
		
		@FindBy(xpath="//input[@id='form:price_input']")
		public WebElement Re_Price;
		
		@FindBy(xpath="//input[contains(@class,'ui-spinner-input ui-inputfield')]")
		public WebElement Re_EditQuantity;
		
		@FindBy(xpath="//span[normalize-space(text())='Save']")
		public WebElement Re_EditSave;
		
		@FindBy(xpath="//table[contains(.,'Name')]")
		public WebElement GridTable;
		
		@FindBy(xpath="//div[@class='ui-chkbox ui-widget']")
		public WebElement checkBox; 
		
		@FindBy(xpath="(//button[contains(@class,'ui-button ui-widget')])[2]")
		public WebElement DeleteProduct;
		
		@FindBy(xpath="(//button[@name='form:j_idt159']//span)[2]")
		public WebElement DeleteYes;
		
		@FindBy(xpath="//span[normalize-space(text())='Selected Product(s) Deleted']")
		public WebElement VerifyDelete;
	}//endgrid
	
	
	
	
	
}//Mainend
