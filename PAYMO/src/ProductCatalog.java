import java.util.Arrays;
import java.util.Scanner;



public class ProductCatalog {
	Scanner sc= new Scanner(System.in);
	String CatalogName;
	int CatalogID;
	// Item[] items= new Item[10];
	ProductDescription[] pd = new ProductDescription[10];

	public ProductCatalog(int id, String name) {
		this.CatalogName = name;
		this.CatalogID = id;
		System.out.print(this.CatalogName);
		this.setItemList();
		
	
	}

	public void getItemlist() {

		System.out.print("Get Items in the itemlist \n");
		for (int i = 0; i < 10; i++) {
			System.out.print(" " + this.pd[i].getItemID());
		}

	}
	
	public void getItemDescription(int selectedItemId) {
			System.out.println(" - ITEM ID : \t" + this.pd[selectedItemId].getItemID());
			System.out.println(" - ITEM PRICE : \t" + this.pd[selectedItemId].getPrice());
			System.out.println(" - ITEM DESCRIPTION : \t" + this.pd[selectedItemId].getDescription());
			System.out.println(" - ITEM OPTION : \t" + Arrays.toString(this.pd[selectedItemId].getOption()));
			
			String[] option = this.pd[selectedItemId].getOption();
			this.pd[selectedItemId].selectOption(option);
			
	}
	
	
	public void setItemList() {

		System.out.print("Put Items in the itemlist\n");
		String[] option = { "s", "xl" };
		for (int i = 0; i < 10; i++) {
			ProductDescription temp = new ProductDescription(i, 15000,  option, "DO BUN SEOL NO JAM");
			pd[i] = temp;
		}

	}

}
