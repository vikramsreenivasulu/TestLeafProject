package LeafTestCases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import LeafAction.TableMethods;
import Utility.BaseClass;

public class TableTestClases {

	 public TableMethods tablemethods;

	    @BeforeSuite
	    public void BeforeSuit() {
	        BaseClass.startdriver();
	        tablemethods = new TableMethods();
	    }
	 
	 
	    @Test()
	    public void ATtestTable() throws InterruptedException {
	    	
	    	BaseClass.Sleep();
	    	tablemethods.tablemethod.ClickTable();
	    	BaseClass.Sleep();
	    	tablemethods.insidetable.InsideTableClick();
	    }
	    
	    
	    @Test()
	    public void ATTestGrid() throws InterruptedException {
	    	
	    	BaseClass.Sleep();
	    	tablemethods.tablemethod.ClickTable();
	    	BaseClass.Sleep();
	    	tablemethods.grid.ClickGrid();
	    	BaseClass.Sleep();
	    	tablemethods.grid.CreatingNewItem();
	    	BaseClass.Sleep();
	    	tablemethods.grid.CreatingNewItemName("Redtape Sneaker");
	    	BaseClass.Sleep();
	    	tablemethods.grid.CreatingNewItemDescription("Red Tape\r\n"
	    			+ "₹1,740\r\n"
	    			+ "In stock online\r\n"
	    			+ "Free delivery between 16–19 Feb·Free 7-day returns");
	    	BaseClass.Sleep();
	    	tablemethods.grid.Category();
	    	BaseClass.Sleep();
	    	tablemethods.grid.Price("1250");
	    	BaseClass.Sleep();
	    	tablemethods.grid.ProductQuantity("1");
	    	BaseClass.Sleep();
	    	tablemethods.grid.ProductSave();
	    	BaseClass.Sleep();
	    	tablemethods.grid.Search("Redtape Sneaker");
	    	BaseClass.Sleep();
	    	tablemethods.grid.ProductEdit("Redtape Sneaker");
	    	BaseClass.Sleep();
	    	tablemethods.grid.Re_Price("1500");
	    	BaseClass.Sleep();
	    	tablemethods.grid.Re_EditQuantity("2");
	    	BaseClass.Sleep();
	    	tablemethods.grid.Re_EditSave();
	    	BaseClass.Sleep();
	    	tablemethods.grid.ClickCheckBox("Redtape Sneaker");
	    	BaseClass.Sleep();
	    	tablemethods.grid.Import();
	    	BaseClass.Sleep();
	    	tablemethods.grid.Export();
	    	BaseClass.Sleep();
	    	//BaseClass.clickAfterPopupGone(By.xpath("//span[normalize-space(text())='Product Added']"), By.xpath("//input[@id='form:j_idt92_input']"));
	    	BaseClass.Sleep();
	    	tablemethods.grid.DeleteProduct();
	    	BaseClass.Sleep();
	    	tablemethods.grid.DeleteYes();
	    }
	    
	    
	    @Test()
	    public void ATTestDynamicGrid() throws InterruptedException {
	    	
	    	BaseClass.Sleep();
	    	tablemethods.tablemethod.ClickTable();
	    	BaseClass.Sleep();
	    	tablemethods.dynamicgrid.ClickDyGrid();
	    	BaseClass.Sleep();
	    	tablemethods.dynamicgrid.Search("Steven Smith");
	    	BaseClass.Sleep();
	    	//tablemethods.dynamicgrid.ValueFromCells();
	    	BaseClass.Sleep();
	    	System.out.println("...................................");
	    	tablemethods.dynamicgrid.ValueFromNameColumn();
	    	
	    	BaseClass.Sleep();
	    	System.out.println("...................................");
	    	tablemethods.dynamicgrid.ValueFromDateColumn();
	    	
	    	BaseClass.Sleep();
	    	System.out.println("...................................");
	    	tablemethods.dynamicgrid.ValueFromStatusColumn();
	    	
	    	BaseClass.Sleep();
	    	System.out.println("...................................");
	    	tablemethods.dynamicgrid.ValueFromActivityColumn();
	    	
	    	
	    }
	    
	    
	    @Test()
	    public void AtTestCalendar() throws InterruptedException {
	    	
	    	BaseClass.Sleep();
	    	tablemethods.tablemethod.ClickTable();
	    	BaseClass.Sleep();
	    	tablemethods.calendar.ClickCalender();
	    	BaseClass.Sleep();
	    	tablemethods.calendar.ClickPrevious("2026-01-14");
	    	BaseClass.Sleep();
	    	tablemethods.calendar.EventDetails("Sankranthi");
	    	BaseClass.Sleep();
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
}//end
