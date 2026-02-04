package LeafAction;

import LeafLocators.MiscLocators;

public class MiscMethods {

    public MiscMethod miscmethod;
   
    public Message message;
    
    
    
    
    public MiscLocators misclocators = new MiscLocators();
    public MiscMethods() {
    	miscmethod = new MiscMethod();
    	message = new Message();
    }

    public class MiscMethod{
    	
    	public void ClickMisc() {
    		misclocators.misclocator.ClickMisc.click();
    	}
    }
    
    public class Message{
    	
    	public void ClickMessage() {
    		misclocators.message.ClickMessage.click();
    	}
    }
    
    
    
    
    
    
} //end MiscMethods

