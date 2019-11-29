public class printItems extends data {
    public printItems(String prod_name, int prod_num, int price, int quantity, float final_price) {
        super(prod_name, prod_num, price, quantity, final_price);
        if(prod_num<10)
System.out.println("\t"+prod_num+"\t\t\t"+prod_name.substring(3)+"\t\t\t"+price+"\t\t\t"+quantity+"\t\t"+final_price);
else
System.out.println("\t"+prod_num+"\t\t\t"+prod_name.substring(4)+"\t\t\t"+price+"\t\t\t"+quantity+"\t\t\t"+final_price);
    }}
