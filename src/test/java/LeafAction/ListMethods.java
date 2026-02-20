package LeafAction;

import LeafLocators.ListLocators;

public class ListMethods {

	public ListMethod listmethod;
	
	public Menu menu;
	
	public ListLocators listlocators = new ListLocators(); 
	
	
	public ListMethods() {
		listmethod = new ListMethod();
		menu = new Menu();
	}
	
	
	public class ListMethod{
		
		public void ClickList() {
			listlocators.listlocator.ClickList.click();
		}
	}
	
	public class Menu{
		
		public void ClickMenu() {
			listlocators.menu.ClickMenu.click();
		}
		
		
		
		
		
	}//EndMenu

	
	
	
}//endListMethods
