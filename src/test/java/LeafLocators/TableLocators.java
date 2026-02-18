package LeafLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class TableLocators {

	public TableLocator tablelocator;
	
	public InsideTable insidetable;
	
	public Grid grid;
	
	public DynamicGrid dynamicgrid;
	
	public Calendar calendar;
	public  TableLocators(){
		
		tablelocator= new TableLocator();
		insidetable = new InsideTable();
		grid = new Grid();
		dynamicgrid = new DynamicGrid();
		calendar = new Calendar();
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
		
		@FindBy(xpath="//input[@id='form:j_idt92_input']")
		public WebElement Import;
		
		@FindBy(xpath="//span[normalize-space(text())='Export']")
		public WebElement Export;
		
		@FindBy(xpath="(//button[contains(@class,'ui-button ui-widget')])[2]")
		public WebElement DeleteProduct;
		
		@FindBy(xpath="(//button[@name='form:j_idt159']//span)[2]")
		public WebElement DeleteYes;
		
		@FindBy(xpath="//span[normalize-space(text())='Selected Product(s) Deleted']")
		public WebElement VerifyDelete;
		
		
	}//endgrid
	
	public class DynamicGrid{
		
		public DynamicGrid() {
			PageFactory.initElements(BaseClass.driver, this);
		}
		
		@FindBy(id="menuform:m_dynamic")
		public WebElement ClickDyGrid;
		
		@FindBy(id="form:template")
		public WebElement Search;
		
		@FindBy(xpath="//tbody[@id='form:customers_data']//tr[contains(@role,'row')]//td[contains(@role,'')]")
		
		//tbody[@id='form:customers_data']//tr/td[3]
		public WebElement ValueFromCells;
		
		
		@FindBy(xpath ="//table[contains(.,'NAME')]")
		public WebElement Table;
		
		@FindBy(xpath="//table//thead")
		public WebElement TableHeadNames;
		
		
	}
	
	public class Calendar{
		
		public EventDetails eventdetails;
		
		public Calendar() {
			PageFactory.initElements(BaseClass.driver, this);
			eventdetails = new EventDetails();
		}
		
		@FindBy(xpath="//li[@id='menuform:m_calendar']//a[1]")
		public WebElement ClickCalendar;
		
		@FindBy(xpath="//button[text()='Previous']")
		public WebElement ClickPrevious;
		
		
		
		public class EventDetails{
			public EventDetails(){
				PageFactory.initElements(BaseClass.driver, this);
			}
			
			@FindBy(xpath="//input[@id='j_idt87:title']")
			public WebElement SendTitle;
			
			@FindBy(xpath="//div[contains(@class,'ui-chkbox-box ui-widget')]")
			public WebElement AllDays;
			
			@FindBy(xpath="//span[normalize-space(text())='Save']")
			public WebElement Save;
			
			@FindBy(xpath="//div[contains(@class,'fc-event-title')]")
			public WebElement VerifyOnTheDay;
			
		}//EventDetails End
		
		
		
	}//calendar end
	
	
}//Mainend
