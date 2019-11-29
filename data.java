public class data {
    private String prod_name;
    private int prod_num;
    private int price;
    private int quantity;
    private float final_price;
    public String getProd_name() {
        return prod_name;   }
    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;   }
    public int getProd_num() {
        return prod_num;   }
    public void setProd_num(int prod_num) {
        this.prod_num = prod_num;   }
    public int getPrice() {
        return price;   }
    public void setPrice(int price) {
        this.price = price;   }
    public int getQuantity() {
        return quantity;   }
    public void setQuantity(int quantity) {
        this.quantity = quantity;   }
    public float getFinal_price() {
        return final_price;   }
    public void setFinal_price(float final_price) {
        this.final_price = final_price;   }
    public data(String prod_name, int prod_num, int price, int quantity, float final_price) {
        this.prod_name = prod_name;
        this.prod_num = prod_num;
        this.price = price;
        this.quantity = quantity;
        this.final_price = final_price;   }}
