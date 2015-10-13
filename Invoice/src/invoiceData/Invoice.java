package invoiceData;



public class Invoice 
{
	private String customerName;
	private double total;
	private int invNum;
	private String date;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getInvNum() {
		return invNum;
	}
	public void setInvNum(int invNum) {
		this.invNum = invNum;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public Invoice(String bCustomerName,Double bTotal,Integer bInvNum,String bDate)
	{
		customerName = bCustomerName;
		total = bTotal;
		invNum = bInvNum;
		date = bDate;
		
	}

}
	
