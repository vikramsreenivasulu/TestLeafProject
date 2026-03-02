package LeafLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class ListLocators {

	public ListLocator listlocator;
	public Menu menu;
	
	public Tree tree;
	public ListLocators() {
		listlocator = new ListLocator();
		menu  = new Menu();
		tree = new Tree();
	}
	
	
	
	
	public class ListLocator{
		
		public ListLocator() {
			PageFactory.initElements(BaseClass.driver, this);
		}
		
		@FindBy(xpath="(//li[@id='menuform:j_idt42']//a)[1]")
		public WebElement ClickList;
		
		
	}//end ListLocator
	
	public class Menu{
		
		public MenuBar menubar;
		public TabMenu tabmenu;
		public PanelMenu panelmenu;
		
		public SlideMenu slidemenu;
		
		public MenuButton menubutton;
		public ContextMenu contextmenu;
		public Menu() {
			PageFactory.initElements(BaseClass.driver, this);
			menubar = new MenuBar();
			tabmenu = new TabMenu();
			panelmenu = new PanelMenu();
			slidemenu = new SlideMenu();
			menubutton = new MenuButton();
			contextmenu = new ContextMenu();
		}
		@FindBy(xpath="//li[@id='menuform:m_menu']//a[1]")
		public WebElement ClickMenu;
		
		
		
		public class MenuBar{
			
			public MenuBar() {
				PageFactory.initElements(BaseClass.driver, this);
			}
			@FindBy(xpath="(//ul//li//span[@class='ui-icon ui-icon-triangle-1-s'])[1]")
			public WebElement MenuBarCustomers;
			
			@FindBy(xpath="(//ul//li//span[@class='ui-icon ui-icon-triangle-1-s'])[2]")
			public WebElement MenuBarOrders;
			
			@FindBy(xpath="(//ul//li//span[@class='ui-icon ui-icon-triangle-1-s'])[3]")
			public WebElement MenuBarShipments;
			
			@FindBy(xpath="(//ul//li//span[@class='ui-icon ui-icon-triangle-1-s'])[4]")
			public WebElement MenuBarProfile;
			}
		
		
		public class TabMenu {
			
			public TabMenu() {
				PageFactory.initElements(BaseClass.driver, this);
			}
			
		@FindBy(xpath="//li//a[@href='/menu.xhtml?i=0']")
		public WebElement TabMenuOverview;
		
		@FindBy(xpath="//li//a[@href='/menu.xhtml?i=1']")
		public WebElement TabMenuMembers;
		
		@FindBy(xpath="//li//a[@href='/menu.xhtml?i=2']")
		public WebElement TabMenuSales;
		
		@FindBy(xpath="//li//a[@href='/menu.xhtml?i=3']")
		public WebElement TabMenuProfile;
		}
		
		
		public class PanelMenu{
			
			public PanelMenu() {
				PageFactory.initElements(BaseClass.driver, this);
			}
			
			@FindBy(xpath="(//div[@class='ui-panelmenu-panel'])[1]")
			public WebElement PanelMenuCustomer;
			
			@FindBy(xpath="(//div[@class='ui-panelmenu-panel'])[2]")
			public WebElement PanelMenuOrders;
			
			@FindBy(xpath="(//div[@class='ui-panelmenu-panel'])[3]")
			public WebElement PanelMenuShipments;
			
			@FindBy(xpath="(//div[@class='ui-panelmenu-panel'])[4]")
			public WebElement PanelMenuProfile;
			
		}//PanelMenu
		
		public class SlideMenu{
			
			public SlideMenuCustomers slidemenucustomers;
			public SlideMenuOrders slidemenuorders;
			public SlideMenu() {
				PageFactory.initElements(BaseClass.driver, this);
				slidemenucustomers = new SlideMenuCustomers();
				slidemenuorders = new SlideMenuOrders();
			}
			
			public class SlideMenuCustomers{
				
				public SlideMenuCustomers() {
					PageFactory.initElements(BaseClass.driver, this);
				}
				
				@FindBy(xpath="(//ul//li//a[@role='menuitem'])[31]")
				public WebElement SlideMenuCustomers;
				
				@FindBy(xpath="(//a[@role='menuitem'])[32]")
				public WebElement SlideMenuCustomersNew;
				
				@FindBy(xpath="//div[contains(@class,'ui-slidemenu-backward ui-widget-header')]")
				public WebElement SlideMenuBack;
			}
			
			public class SlideMenuOrders{
				
				public SlideMenuOrders() {
					PageFactory.initElements(BaseClass.driver, this);
				}
				
				@FindBy(xpath="(//ul//li//a[@role='menuitem'])[36]")
				public WebElement SlideMenuOrders;
				
				@FindBy(xpath="//div[contains(@class,'ui-slidemenu-backward ui-widget-header')]")
				public WebElement SlideMenuBack;
			}
			
			
		}//SlideMenu
		
		public class MenuButton{
			
			public MenuButton() {
				PageFactory.initElements(BaseClass.driver, this);
			}
			
			@FindBy(id = "j_idt87:j_idt144_button")
			public WebElement MenuButtonOptions;
			
		}//MenuButton
		
		public class ContextMenu{
			
			public ContextMenu() {
				PageFactory.initElements(BaseClass.driver, this);
			}
			
			@FindBy(xpath="//h5[normalize-space(text())='Context Menu']")
			public WebElement ContextMenuClick;
		}
		
	}//Menu
	
	public class Tree{
		
		public InsideTree insidetree;
		public Tree() {
			PageFactory.initElements(BaseClass.driver, this);
			insidetree = new InsideTree();
		}
		
		@FindBy(xpath="//li[@id='menuform:m_tree']//a[1]")
		public WebElement ClickTrue;
		
		public class InsideTree{
			
			public TreeDoc treedoc;
			
			public TreePics treepics;
			public TreeMovs treemovs;
			public InsideTree() {
				PageFactory.initElements(BaseClass.driver, this);
				treedoc = new TreeDoc();
				treepics = new TreePics();
				treemovs = new TreeMovs();
			}
			
			public class TreeDoc{
				
				public TreeDoc() {
					PageFactory.initElements(BaseClass.driver, this);
				}
				
				@FindBy(xpath="(//ul//li//div//span[@class='ui-tree-toggler ui-icon ui-icon-triangle-1-e'])[1]")
				public WebElement Treedocument;
				
				@FindBy(xpath="(//span[contains(@class,'ui-tree-toggler ui-icon')])[2]")
				public WebElement DocWork;
				
				@FindBy(xpath="(//span[@class='ui-treenode-label ui-corner-all'])[3]")
				public WebElement Expenses;
				
				@FindBy(xpath="(//span[text()='Resume.doc'])[1]")
				public WebElement Resume;
				
				@FindBy(xpath="(//span[contains(@class,'ui-tree-toggler ui-icon')])[3]")
				public WebElement TestLeaf;
				
				@FindBy(xpath="(//span[@role='treeitem'])[6]")
				public WebElement RefDoc;
			}
			
			public class TreePics{
				
				public TreePics() {
					PageFactory.initElements(BaseClass.driver, this);
				}
				
				@FindBy(xpath="//li[@id='j_idt88:1']//span[@class='ui-tree-toggler ui-icon ui-icon-triangle-1-e']")
				public WebElement TreePictures;
				
				@FindBy(xpath="(//span[@role='treeitem'])[8]")
				public WebElement Bercelona;
				
				@FindBy(xpath="(//span[@role='treeitem'])[9]")
				public WebElement Logo;
				
				@FindBy(xpath="(//span[@role='treeitem'])[10]")
				public WebElement optimusprime;
			}
			
			public class TreeMovs{
				
				public TreeMovs() {
					PageFactory.initElements(BaseClass.driver, this);
				}
				
				@FindBy(xpath="(//li[@id='j_idt88:2']//span[@class='ui-tree-toggler ui-icon ui-icon-triangle-1-e'])[1]")
				public WebElement TreeMovies;
				
				@FindBy(xpath="(//span[@class='ui-tree-toggler ui-icon ui-icon-triangle-1-e'])[1]")
				public WebElement AlPacino;
				
				
				@FindBy(xpath="(//span[@role='treeitem'])[13]")
				public WebElement Saceface;
				
				@FindBy(xpath="(//span[@role='treeitem'])[14]")
				public WebElement CarlitosWay;
				
				@FindBy(xpath="//span[@class='ui-tree-toggler ui-icon ui-icon-triangle-1-e']")
				public WebElement Robertde;
				
				@FindBy(xpath="(//span[@role='treeitem'])[16]")
				public WebElement Goodfellas ;
				
				@FindBy(xpath="(//span[@role='treeitem'])[17]")
				public WebElement  Untoubles;
			}
			
			
			
			
		}//InsideTree
		
	}//Tree
	
	
	
	
	
	
	
	
	
	
	
}//end ListLocators
