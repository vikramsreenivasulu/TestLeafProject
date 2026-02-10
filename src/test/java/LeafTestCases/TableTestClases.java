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
	    	tablemethods.grid.Re_EditQuantity("2");
	    	BaseClass.Sleep();
	    	tablemethods.grid.Re_EditSave();
	    	
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
}//end
