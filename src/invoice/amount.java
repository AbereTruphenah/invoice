package invoice;

public class amount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("*************************Adamson Computers Ltd*************************");
System.out.println("#99 ACS Building Gilmore Ave. New Mla.. Quezon City * Tel. No:123-4567");
System.out.println("                 VAT REG. TIN 098-765-4321-0000");
System.out.println("                         SALES INVOICE ");
System.out.println(" ");
System.out.println("");
System.out.println("");

String soldTo="C026-01-0981/2022";
String date="28/04/2020";
String address="Abere Barongo Truphenah";
String contactNumber="0100100100";

System.out.print("Sold to:"+soldTo);System.out.println("\t\t\t\t\tDate:"+date);
System.out.print("Address:"+address);System.out.println("\t\t\t\t\tContact Number:"+contactNumber);
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("======================================================================================");
int quantity1=4;
int quantity2=10;
int quantity3=9;
int quantity4=10;
String item1="Pencil";
String item2="Duster";
String item3="Pens";
String item4="crayon";
int price1=20;
int price2=50;
int price3=30;
int price4=80;
double amount1=(double)quantity1*price1;
double amount2=(double)quantity2*price2;
double amount3=(double)quantity3*price3;
double amount4=(double)quantity4*price4;
System.out.println("Qty     |       Item Description        |       Unit Price              |Amount");
System.out.println("======================================================================================");
System.out.print(""+quantity1);
System.out.print("\t|\t"+item1);
System.out.print("\t\t\t|\t"+price1);
System.out.printf("\t\t\t|%.2f\n",amount1);
System.out.println("--------------------------------------------------------------------------------------");
System.out.print(""+quantity2);
System.out.print("\t|\t"+item2);
System.out.print("\t\t\t|\t"+price2);
System.out.printf("\t\t\t|%.2f\n",amount2);
System.out.println("--------------------------------------------------------------------------------------");
System.out.print(""+quantity3);
System.out.print("\t|\t"+item3);
System.out.print("\t\t\t|\t"+price3);
System.out.printf("\t\t\t|%.2f\n",amount3);
System.out.println("--------------------------------------------------------------------------------------");
System.out.print(""+quantity4);
System.out.print("\t|\t"+item4);
System.out.print("\t\t\t|\t"+price4);
System.out.printf("\t\t\t|%.2f\n",amount4);
System.out.println("======================================================================================");
double total=amount1+amount2+amount3+amount4;
double vat=(16*total)/100;
double overall=total+vat;
System.out.printf("                                               |Sub Total               |%.2f\n",total);
System.out.println("                                               =======================================");
System.out.println("                                               |VAT(16%)                |"+String.format("%.2f",vat));
System.out.println("                                               =======================================");
System.out.printf("                                               |Total Amount            |%.2f\n",overall);
System.out.println("                                               =======================================");



}
	}