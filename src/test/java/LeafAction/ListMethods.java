package LeafAction;

import LeafLocators.ListLocators;

public class ListMethods {

	public ListMethod listmethod;
	
	
	
	public ListLocators listlocators = new ListLocators(); 
	
	
	public ListMethods() {
		listmethod = new ListMethod();
	}
	
	
	public class ListMethod{
		
		public void ClickList() {
			listlocators.listlocator.ClickList.click();
		}
	}
	
	
	
	
	
}//endListMethods
