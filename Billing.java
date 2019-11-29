import java.io.*;
import java.util.*;
public class Billing {
    public static void main(String args[]) throws IOException {
    Scanner sc = new Scanner(System.in);
        int product[] = new int[100];int price[]=new int[100];
        int quantity[] = new int[100]; String arr[]=new String[100];
        float final_price[] = new float[100];
        int c = 0;float total=0,tax=0;
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("\t\t\t\tWELCOME TO OUR SHOP");
        System.out.println("-----------------------------------------------------------------------");
    while (true) {
      System.out.println("PLEASE SELECT ANY OF THE FOLLOWING CATAGORIES");
System.out.println("1. FRUITS AND VEGETABLES\n2. BEAUTY AND HYGIENE\n3. ELECTRONICS\n4. CLOTHES\n5. KITCHEN AND FURNITURE");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    BufferedReader in1 = new BufferedReader(new FileReader("fruits and vegetables.txt"));
                    String str1;
                    List<String> output = new LinkedList<String>();
                    while((str1= in1.readLine()) != null){
                        output.add(str1);   }
                    String[] arr1 = output.toArray(new String[output.size()]);
                    System.out.println("SELECT PRODUCT(S) FROM THE LIST BELOW");
                    for(int i=0;i<10;i++)
                        System.out.println(arr1[i]);
                    int price1[] = {100, 25, 50, 35, 25, 80, 90, 110, 55, 60};
                    while(true) {//SELECTING PRODUCTS FROM THE LIST AND CALCULATING FINAL PRICE AFTER TAX
                        System.out.print("ENTER THE PRODUCT NUMBER: ");
                        product[c] = sc.nextInt();
                        System.out.print("\nENTER THE QUANTITY: ");
                        quantity[c] = sc.nextInt();
                        price[c]=price1[product[c]-1];
                        tax=tax+(((price1[product[c]-1] * 0) / 100)* quantity[c]);
                        final_price[c] = (((price1[product[c]-1] * 0) / 100) + price1[product[c]-1]) * quantity[c];
                        total=total+final_price[c];
                        arr[c]=arr1[product[c]-1];c++;
                System.out.print("\nPRESS 0 IF YOU ARE DONE SELECTING PRODUCT(S) ELSE PRESS ANY KEY TO CONTINUE: ");
                        if (sc.nextInt() == 0) break;  }
                    break;
                case 2:
                    BufferedReader in2 = new BufferedReader(new FileReader("beauty and hygiene.txt"));
                    String str2;
                    List<String> out = new LinkedList<String>();
                    while((str2= in2.readLine()) != null){
                        out.add(str2); }
                    String[] arr2 = out.toArray(new String[out.size()]);
                    System.out.println("SELECT PRODUCT(S) FROM THE LIST BELOW");
                    for(int i=0;i<10;i++)
                        System.out.println(arr2[i]);
                    int price2[] = {150, 250, 375, 135, 35, 500, 900, 100, 285, 335};
                    while(true) {//SELECTING PRODUCTS FROM THE LIST AND CALCULATING FINAL PRICE AFTER TAX
                        System.out.print("ENTER THE PRODUCT NUMBER: ");
                        product[c] = sc.nextInt();
                        System.out.print("\nENTER THE QUANTITY: ");
                        quantity[c] = sc.nextInt();
                        price[c]=price2[product[c]-1];
                        tax=tax+(((price2[product[c]-1] * 5) / 100)* quantity[c]);
                        final_price[c] = (((price2[product[c]-1] * 5) / 100) + price2[product[c]-1]) * quantity[c];
                        total=total+final_price[c];
                        arr[c]=arr2[product[c]-1];c++;
                System.out.print("\nPRESS 0 IF YOU ARE DONE SELECTING PRODUCT(S) ELSE PRESS ANY KEY TO CONTINUE: ");
                        if (sc.nextInt() == 0) break;   }
                    break;
                case 3:
                    BufferedReader in3 = new BufferedReader(new FileReader("electronics.txt"));
                    String str3;
                    List<String> o = new LinkedList<String>();
                    while((str3= in3.readLine()) != null){
                        o.add(str3);  }
                    String[] arr3 = o.toArray(new String[o.size()]);
                    System.out.println("SELECT PRODUCT(S) FROM THE LIST BELOW");
                    for(int i=0;i<10;i++)
                        System.out.println(arr3[i]);
                    int price3[] = {15000, 25550, 10000, 800, 50000, 6000, 250, 20000, 500, 800};
                    while(true) {//SELECTING PRODUCTS FROM THE LIST AND CALCULATING FINAL PRICE AFTER TAX
                        System.out.print("ENTER THE PRODUCT NUMBER: ");
                        product[c] = sc.nextInt();
                        System.out.print("\nENTER THE QUANTITY: ");
                        quantity[c] = sc.nextInt();
                        price[c]=price3[product[c]-1];
                        tax=tax+(((price3[product[c]-1] * 25) / 100)* quantity[c]);
                        final_price[c] = (((price3[product[c]-1] * 25) / 100) + price3[product[c]-1]) * quantity[c];
                        total=total+final_price[c];
                        arr[c]=arr3[product[c]-1];c++;
                    System.out.print("\nPRESS 0 IF YOU ARE DONE SELECTING PRODUCT(S) ELSE PRESS ANY KEY TO CONTINUE: ");
                        if (sc.nextInt() == 0) break;  }
                    break;
                case 4:
                    BufferedReader in4 = new BufferedReader(new FileReader("clothes.txt"));
                    String str4;
                    List<String> o4 = new LinkedList<String>();
                    while((str4= in4.readLine()) != null){
                        o4.add(str4);  }
                    String[] arr4 = o4.toArray(new String[o4.size()]);
                    System.out.println("SELECT PRODUCT(S) FROM THE LIST BELOW");
                    for(int i=0;i<10;i++)
                        System.out.println(arr4[i]);
                    int price4[] = {1000, 600, 500, 800, 1500, 100, 300, 80, 300, 950};
                    while(true) {//SELECTING PRODUCTS FROM THE LIST AND CALCULATING FINAL PRICE AFTER TAX
                        System.out.print("ENTER THE PRODUCT NUMBER: ");
                        product[c] = sc.nextInt();
                        System.out.print("\nENTER THE QUANTITY: ");
                        quantity[c] = sc.nextInt();
                        price[c]=price4[product[c]-1];
                        tax=tax+(((price4[product[c]-1] * 12) / 100)* quantity[c]);
                        final_price[c] = (((price4[product[c]-1] * 12) / 100) + price4[product[c]-1]) * quantity[c];
                        total=total+final_price[c];
                        arr[c]=arr4[product[c]-1];c++;
                 System.out.print("\nPRESS 0 IF YOU ARE DONE SELECTING PRODUCT(S) ELSE PRESS ANY KEY TO CONTINUE: ");
                        if (sc.nextInt() == 0) break; }
                    break;
                case 5:
                    BufferedReader in5 = new BufferedReader(new FileReader("kitchen and furniture.txt"));
                    String str5;
                    List<String> o5 = new LinkedList<String>();
                    while((str5= in5.readLine()) != null){
                        o5.add(str5);  }
                    String[] arr5 = o5.toArray(new String[o5.size()]);
                    System.out.println("SELECT PRODUCT(S) FROM THE LIST BELOW");
                    for(int i=0;i<10;i++)
                        System.out.println(arr5[i]);
                    int price5[] = {150, 100, 1375, 535, 30000, 5000, 10000, 50, 1500, 800};
                    while(true) {//SELECTING PRODUCTS FROM THE LIST AND CALCULATING FINAL PRICE AFTER TAX
                        System.out.print("ENTER THE PRODUCT NUMBER: ");
                        product[c] = sc.nextInt();
                        System.out.print("\nENTER THE QUANTITY: ");
                        quantity[c] = sc.nextInt();
                        price[c]=price5[product[c]-1];
                        tax=tax+(((price5[product[c]-1] * 18) / 100)* quantity[c]);
                        final_price[c] = (((price5[product[c]-1] * 18) / 100) + price5[product[c]-1]) * quantity[c];
                        total=total+final_price[c];
                        arr[c]=arr5[product[c]-1];c++;
                System.out.print("\nPRESS 0 IF YOU ARE DONE SELECTING PRODUCT(S) ELSE PRESS ANY KEY TO CONTINUE: ");
                        if (sc.nextInt() == 0) break;  }
                    break;
                default:
                    System.out.println("\nINVALID CHOICE PLEASE TRY AGAIN!!");  }
            System.out.print("\nPRESS 1 IF YOU WISH TO CONTINUE ELSE PRESS 0: ");
            if(sc.nextInt()==0) break; }
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("PRODUCT NUMBER\tPRODUCT NAME\tPRICE\tQUANTITY\tFINAL PRICE");
        System.out.println("----------------------------------------------------------------------------------");
        for (int i = 0; i < c; i++)
        {   printItems obj=new printItems(arr[i],product[i],price[i], quantity[i], final_price[i]); }
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("TOTAL NUMBER OF PRODUCT PURCHASED: "+c);
        System.out.println("TOTAL AMOUNT OF TAX TO BE PAID IS: "+tax);
        System.out.println("TOTAL AMOUNT TO BE PAID: "+total);  }}
