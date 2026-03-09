package LeafLocators;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class ListLocators {

	public ListLocator listlocator;
	public Menu menu;
	
	public List list;
	public Tree tree;
	public ListLocators() {
		listlocator = new ListLocator();
		menu  = new Menu();
		tree = new Tree();
		list = new List();
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
		public TreeTable treetable;
		
		public HorizontalTree horizontaltree;
		public Tree() {
			PageFactory.initElements(BaseClass.driver, this);
			insidetree = new InsideTree();
			treetable = new TreeTable();
			horizontaltree = new HorizontalTree();
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
		
		public class TreeTable{
			public TreeDoc treedoc;
			public TreePictures treepictures;
			public TreeMovies  treemovies;
			public TreeTable() {
				PageFactory.initElements(BaseClass.driver, this);
				treedoc = new TreeDoc();
				treepictures = new TreePictures();
				treemovies = new TreeMovies();
				
			}
			
			public class TreeDoc{
				
				public TreeDoc() {
					PageFactory.initElements(BaseClass.driver, this);
				}
				
				@FindBy(xpath="(//tr//td[@role='gridcell']//span)[1]")
				public WebElement Documents;
				
				@FindBy(xpath="//tr[@id='j_idt98_node_0_0']//td[@role='gridcell']//span[@class='ui-treetable-toggler ui-icon ui-icon-triangle-1-e ui-c']")
				public WebElement Work;
				
				@FindBy(xpath="(//tr//td[@role='gridcell'])[7]")
				public WebElement Expenses;
				
				@FindBy(xpath="(//tr//td[@role='gridcell'])[10]")
				public WebElement Resume;
				
				@FindBy(xpath="//tr[@id='j_idt98_node_0_1']//td[@role='gridcell']//span[@class='ui-treetable-toggler ui-icon ui-icon-triangle-1-e ui-c']")
				public WebElement TestLeaf;
				
				@FindBy(xpath="(//tr//td[@role='gridcell'])[16]")
				public WebElement RefDoc;
				
			}//TreeDoc
			
			public class TreePictures{
				
				public TreePictures() {
					PageFactory.initElements(BaseClass.driver, this);
				}
				
				@FindBy(xpath="(//tr//td[@role='gridcell']//span)[21]")
				public WebElement Pictures;
				
				@FindBy(xpath="(//tr//td[@role='gridcell'])[22]")
				public WebElement Barcelona;
				
				@FindBy(xpath="(//tr//td[@role='gridcell'])[25]")
				public WebElement logo;
				
				@FindBy(xpath="(//tr//td[@role='gridcell'])[28]")
				public WebElement Optimusprime;
				
			}//TreePictures
			
			public class TreeMovies{
				
				public TreeMovies() {
					PageFactory.initElements(BaseClass.driver, this);
				}
				
				@FindBy(xpath="(//tr//td[@role='gridcell']//span)[32]")
				public WebElement Movies;
				
				@FindBy(xpath="(//tr//td[@role='gridcell']//span)[35]")
				public WebElement AlPacino;
				
				@FindBy(xpath="(//tr//td[@role='gridcell'])[37]")
				public WebElement ScarFace;
				
				@FindBy(xpath="(//tr//td[@role='gridcell'])[40]")
				public WebElement carlitosWay;
				
				@FindBy(xpath="(//tr//td[@role='gridcell']//span)[46]")
				public WebElement RobertDe;
				
				@FindBy(xpath="(//tr//td[@role='gridcell'])[46]")
				public WebElement GoodFellas;
				
				@FindBy(xpath="(//tr//td[@role='gridcell'])[49]")
				public WebElement untouchables;
				
			}
		}//TreeTable
		
		public class HorizontalTree{
			
			public Documents documents;
			public Pictures pictures;
			public Movies movies;
			public HorizontalTree() {
				
				PageFactory.initElements(BaseClass.driver, this);
				documents = new Documents();
				pictures = new Pictures();
				movies = new Movies();
				
			}
			
			@FindBy(xpath="(//tr//td[@data-rowkey='root']//span)[1]")
			public WebElement Files;
			
			public class Documents{
				
				public Documents() {
					PageFactory.initElements(BaseClass.driver, this);
				}
				
				@FindBy(xpath="(//td[@data-nodetype='default']//span[@class='ui-tree-toggler ui-icon ui-icon-plus'])[1]")
				public WebElement ClickDocumnets;
				
				@FindBy(xpath="(//td//div//span[@class='ui-tree-toggler ui-icon ui-icon-plus'])[1]")
				public WebElement Work;
				
				@FindBy(xpath="(//span[text()='TestLeaf']/preceding-sibling::span)[3]")
				public WebElement TestLeaf;
			}//Documents
			
			public class Pictures{
				
				public Pictures() {
					PageFactory.initElements(BaseClass.driver, this);
				}
				
				@FindBy(xpath="(//span[text()='Pictures']/preceding-sibling::span)[3]")
				public WebElement ClickPictures;
				
			}//Pictures
			
			public class Movies{
				
				public Movies() {
					PageFactory.initElements(BaseClass.driver, this);
				}
				
				@FindBy(xpath="(//span[text()='Movies']/preceding-sibling::span)[3]")
				public WebElement ClickMovies;
				
				@FindBy(xpath="(//td[@data-nodetype='default']//span[@class='ui-tree-toggler ui-icon ui-icon-plus'])[1]")
				public WebElement AIPacino;
				
				@FindBy(xpath="(//span[text()='Robert De Niro']/preceding-sibling::span[contains(@class,'ui-tree-toggler')])[2]")
				public WebElement RobertDeNiro;
			}
		}//HorizontalTree
		
	}//Tree
	
	
	public class List{
		public ListProductDetails listproductdetails;
		public List() {
			PageFactory.initElements(BaseClass.driver, this);
			listproductdetails = new ListProductDetails();
		}
		
		@FindBy(xpath="//a[contains(@href,'/list.xhtml')]")
		public WebElement ClickInsideList;
		
		@FindBy(xpath="(//span[contains(@class,'ui-button-icon-left ui-icon')])[1]")
		public WebElement ViewOfListProduct;
		
		public class ListProductDetails{
			
			public ListProductDetails() {
				PageFactory.initElements(BaseClass.driver, this);
			}
			
			@FindBy(xpath="//ul//li[@class='ui-dataview-row']")
			public WebElement ProductName;
			
			@FindBy(xpath="//div[@class='product-list-action']")
			public WebElement ProductPrice;
			
			@FindBy(xpath="//a[contains(@class,'ui-paginator-next ui-state-default')]")
			public WebElement PageTwoProductDetails;
			
			@FindBy(xpath="//div[@class='product-list-action']")
			public WebElement  PageTwoProductPrice;
		}
	}
	
	
	
	
	
	
	
	
	
}//end ListLocators
