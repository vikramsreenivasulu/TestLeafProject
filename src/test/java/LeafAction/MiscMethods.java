package LeafAction;

import LeafLocators.MiscLocators;

public class MiscMethods {

	public MiscMethods miscmethod;
	
	public MiscLocators misclocators = new MiscLocators();
	
	public MiscMethods() {
		miscmethod = new MiscMethods();
	}
	
	public class MiscMethod {
		
		public void ClickMisc() {
			misclocators.misclocator.ClickMisc.click();
		}	
	}
	
	
}
