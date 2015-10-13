package invoiceData;
//import invoiceData.Invoice;
import invoiceData.Item;

import java.text.NumberFormat;
import java.util.Scanner;

public class InvoiceCalculator {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double subTotal,itemPrice;
		String itemName,itemDescription,invNum;
		double itemQuantity;
		double tax = .07;
		
		
		
		
		System.out.println("What is the item name?");
		itemName = keyboard.nextLine();
		
		System.out.println("What is the item Description?");
		itemDescription = keyboard.nextLine();
		
		do{
		System.out.println("What is the item Price?");
		itemPrice = keyboard.nextDouble();
		keyboard.nextLine();
		if(itemPrice >1000){
			System.out.println("Price cannot exceed $1000. Try again.");
		}
		}while(itemPrice >1000);
		
		System.out.println("What is the Inventory Number for this item?");
		invNum = keyboard.nextLine();
		
		
		do{
		System.out.println("How many of this item were purchased?");
		itemQuantity = keyboard.nextDouble();
		keyboard.nextLine();
		if(itemQuantity <1){
			System.out.println("Innsufficient number of items selected. Select again.");
		}
		}while(itemQuantity < 1);
		
		
		Item i = new Item(itemName, itemDescription, itemPrice, invNum, itemQuantity);
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		
		
		subTotal = i.getSubtotal(itemQuantity);
		String subTotalString = currency.format(subTotal);
		System.out.println("Subtotal: " +subTotalString);
		double taxAmount = subTotal*tax;
		double grandTotal = taxAmount+subTotal;
		String taxAmountString = currency.format(taxAmount);
		String grandTotalString = currency.format(grandTotal);
		
		System.out.println("Tax Amount: "+taxAmountString);
		System.out.println("Grand Total: "+grandTotalString);
		
		
		keyboard.close();
		
	
		
	}
}


//	NumberFormat currency = NumberFormat.getCurrencyInstance();
//String taxNrmString = currency.format(taxNrm);
//String taxNpfString = currency.format(taxNpf);
//String taxBizString = currency.format(taxBiz);
