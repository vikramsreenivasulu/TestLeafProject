package LeafAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import LeafLocators.ListLocators;
import LeafLocators.ListLocators.Menu.MenuBar;
import LeafLocators.ListLocators.Menu.TabMenu;
import Utility.BaseClass;

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
	
	public class Menu {
		public MenuBar menubar;
		public TabMenu tabMenu;
		
		public PanelMenu panelmenu;
		public Menu() {
			menubar =new MenuBar();
			tabMenu =new TabMenu();
			panelmenu = new PanelMenu();
		}
		
		
		
		public void ClickMenu() {
			listlocators.menu.ClickMenu.click();
		}
		
		
			public class MenuBar{
				
			public void MenuBarCustomers() {
				listlocators.menu.menubar.MenuBarCustomers.click();
				
				//New Hover
				Actions NewHover = new Actions(BaseClass.driver);
				WebElement hovervalue = BaseClass.driver.findElement(By.xpath("(//li[@class='ui-widget ui-menuitem ui-corner-all ui-menu-parent'])[1]"));
				hovervalue.getAttribute("class");
				NewHover.moveToElement(hovervalue).build().perform();
				
				CustomerHover();
				Duplicate();
			}//MenuBarCustomers
			
			public void CustomerHover() {
				Actions CustomerHover = new Actions(BaseClass.driver);
				WebElement Customerhovervalue = BaseClass.driver.findElement(By.xpath("(//li[@class='ui-menuitem ui-widget ui-corner-all'])[1]"));
				Customerhovervalue.getAttribute("class");
				CustomerHover.moveToElement(Customerhovervalue).build().perform();
				
				}
			public void Duplicate() {
				Actions DuplicateHover = new Actions(BaseClass.driver);
				WebElement DuplicateHovervalue = BaseClass.driver.findElement(By.xpath("(//li[@class='ui-menuitem ui-widget ui-corner-all'])[2]"));
				DuplicateHovervalue.getAttribute("class");
				DuplicateHover.moveToElement(DuplicateHovervalue).build().perform();
				DuplicateHovervalue.click();
			}
			
			public void MenuBarOrders() {
				listlocators.menu.menubar.MenuBarOrders.click();
				
				Actions NewHover = new Actions(BaseClass.driver);
				WebElement hovervalue = BaseClass.driver.findElement(By.xpath("(//li[@class='ui-menuitem ui-widget ui-corner-all'])[4]"));
				hovervalue.getAttribute("class");
				NewHover.moveToElement(hovervalue).build().perform();
				
				OrdersSearch();
			}//MenuBarOrders
			
			public void OrdersSearch() {
				
				Actions OrdersSearch = new Actions(BaseClass.driver);
				WebElement OrdersSearchvalue = BaseClass.driver.findElement(By.xpath("(//a[@role='menuitem'])[8]"));
				OrdersSearchvalue.getAttribute("class");
				OrdersSearch.moveToElement(OrdersSearchvalue).build().perform();
				OrdersSearchvalue.click();
			}
			
			public void MenuBarShipments() {
				listlocators.menu.menubar.MenuBarShipments.click();
				
				Actions TrackerHover = new Actions(BaseClass.driver);
				WebElement TrackerHovervalue = BaseClass.driver.findElement(By.xpath("(//li[@class='ui-menuitem ui-widget ui-corner-all'])[6]"));
				TrackerHovervalue.getAttribute("class");
				TrackerHover.moveToElement(TrackerHovervalue).build().perform();
				
				MenuBarMap();
				MenuBarManage();
			}//MenuBarShipments
			
			public void MenuBarMap() {
				
				Actions MapHover = new Actions(BaseClass.driver);
				WebElement MapHovervalue = BaseClass.driver.findElement(By.xpath("(//a[@role='menuitem'])[11]"));
				MapHovervalue.getAttribute("class");
				MapHover.moveToElement(MapHovervalue).build().perform();
				
			}
			
			public void MenuBarManage() {
				
				Actions ManageHover = new Actions(BaseClass.driver);
				WebElement ManageHovervalue = BaseClass.driver.findElement(By.xpath("(//a[@role='menuitem'])[12]"));
				ManageHovervalue.getAttribute("class");
				ManageHover.moveToElement(ManageHovervalue).build().perform();
				ManageHovervalue.click();
			}
			public void MenuBarProfile() {
				listlocators.menu.menubar.MenuBarProfile.click();
				
				Actions SettingHover = new Actions(BaseClass.driver);
				WebElement SettingHovervalue = BaseClass.driver.findElement(By.xpath("(//li[@class='ui-menuitem ui-widget ui-corner-all'])[9]"));
				SettingHovervalue.getAttribute("class");
				SettingHover.moveToElement(SettingHovervalue).build().perform();
				
				MenuBarBilling();
			}
			
			public void MenuBarBilling() {
				
				Actions BillingHover = new Actions(BaseClass.driver);
				WebElement BillingHovervalue = BaseClass.driver.findElement(By.xpath("(//a[@role='menuitem'])[15]"));
				BillingHovervalue.getAttribute("class");
				BillingHover.moveToElement(BillingHovervalue).build().perform();
				BillingHovervalue.click();
			}
		
			}
			
			public class TabMenu{
			
			public void TabMenuOverview() {
				listlocators.menu.tabmenu.TabMenuOverview.click();
			}
			
			public void TabMenuMembers() {
				listlocators.menu.tabmenu.TabMenuMembers.click();
			}
			
			public void TabMenuSales() {
				listlocators.menu.tabmenu.TabMenuSales.click();
			}
			
			public void TabMenuProfile() {
				listlocators.menu.tabmenu.TabMenuProfile.click();
			}
		
			}
			
			
			public class PanelMenu{
				
				public void PanelMenuCustomers() throws InterruptedException {
					listlocators.menu.panelmenu.PanelMenuCustomer.click();
					
					BaseClass.Sleep();
					WebElement CustomersNew = BaseClass.driver.findElement(By.xpath("(//a[@role='menuitem'])[20]"));
					CustomersNew.click();
					
					
					Actions CustomerHover = new Actions(BaseClass.driver);
					WebElement Customerhovervalue = BaseClass.driver.findElement(By.xpath("(//li[@class='ui-menuitem ui-widget ui-corner-all'])[11]"));
					Customerhovervalue.getAttribute("class");
					BaseClass.Sleep();
					CustomerHover.moveToElement(Customerhovervalue).build().perform();
					
				
					Actions DuplicateHover = new Actions(BaseClass.driver);
					WebElement DuplicateHovervalue = BaseClass.driver.findElement(By.xpath("(//li[@class='ui-menuitem ui-widget ui-corner-all'])[12]"));
					DuplicateHovervalue.getAttribute("class");
					BaseClass.Sleep();
					DuplicateHover.moveToElement(DuplicateHovervalue).build().perform();
					
					
					//CustomerEdit
					WebElement CustomersEdit = BaseClass.driver.findElement(By.xpath("(//a[@role='menuitem'])[23]"));
					CustomersEdit.click();
					
					
					
				}
				
				public void PanelMenuOrders() throws InterruptedException {
					listlocators.menu.panelmenu.PanelMenuOrders.click();
					
					Actions ViewHover = new Actions(BaseClass.driver);
					WebElement Viewhovervalue = BaseClass.driver.findElement(By.xpath("(//li[@class='ui-menuitem ui-widget ui-corner-all'])[14]"));
					Viewhovervalue.getAttribute("class");
					BaseClass.Sleep();
					ViewHover.moveToElement(Viewhovervalue).build().perform();
					
					Actions SearchHover = new Actions(BaseClass.driver);
					WebElement SearchHovervalue = BaseClass.driver.findElement(By.xpath("(//li[@class='ui-menuitem ui-widget ui-corner-all'])[15]"));
					SearchHovervalue.getAttribute("class");
					BaseClass.Sleep();
					SearchHover.moveToElement(SearchHovervalue).build().perform();
					
					
					
				}
				
				public void PanelMenuShipments() throws InterruptedException {
					listlocators.menu.panelmenu.PanelMenuShipments.click();
					
					Actions TrackerHover = new Actions(BaseClass.driver);
					WebElement TrackerHovervalue = BaseClass.driver.findElement(By.xpath("(//li[@class='ui-menuitem ui-widget ui-corner-all'])[16]"));
					TrackerHovervalue.getAttribute("class");
					BaseClass.Sleep();
					TrackerHover.moveToElement(TrackerHovervalue).build().perform();
					
					Actions MapHover = new Actions(BaseClass.driver);
					WebElement MapHovervalue = BaseClass.driver.findElement(By.xpath("(//li[@class='ui-menuitem ui-widget ui-corner-all'])[17]"));
					MapHovervalue.getAttribute("class");
					BaseClass.Sleep();
					MapHover.moveToElement(MapHovervalue).build().perform();
					
					Actions ManageHover = new Actions(BaseClass.driver);
					WebElement ManageHovervalue = BaseClass.driver.findElement(By.xpath("(//li[@class='ui-menuitem ui-widget ui-corner-all'])[18]"));
					ManageHovervalue.getAttribute("class");
					BaseClass.Sleep();
					ManageHover.moveToElement(ManageHovervalue).build().perform();
					
				}
				
				
				public void PanelMenuProfile() throws InterruptedException {
					listlocators.menu.panelmenu.PanelMenuProfile.click();
					
					Actions SettingsHover = new Actions(BaseClass.driver);
					WebElement SettingsHovervalue = BaseClass.driver.findElement(By.xpath("(//li[@class='ui-menuitem ui-widget ui-corner-all'])[19]"));
					SettingsHovervalue.getAttribute("class");
					BaseClass.Sleep();
					SettingsHover.moveToElement(SettingsHovervalue).build().perform();
					
					Actions BillingHover = new Actions(BaseClass.driver);
					WebElement BilliingHovervalue = BaseClass.driver.findElement(By.xpath("(//li[@class='ui-menuitem ui-widget ui-corner-all'])[20]"));
					BilliingHovervalue.getAttribute("class");
					BaseClass.Sleep();
					BillingHover.moveToElement(BilliingHovervalue).build().perform();
				}
				
				
				
				
			}//PanelMenu
			
			
	}//EndMenu

	
	
	
}//endListMethods
