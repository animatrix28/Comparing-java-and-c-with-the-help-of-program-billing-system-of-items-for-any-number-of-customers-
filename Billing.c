#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <fcntl.h>
#include <sys/stat.h>
#include <sys/types.h>
char prod_name[100][100];
void printItems(int prod_num, int price, int quantity, float final_price, int i)
{  printf("%d\t\t%s\t\t\t\t%d\t  %d\t\t%f", prod_num, prod_name[i], price, quantity, final_price);}
int main()
{int product[100],price[100],c=0,quantity[10];
 float tax = 0,total=0,final_price[100];
 printf("-----------------------------------------------------------------------\n");
 printf("\t\t\tWELCOME TO OUR SHOP\n");
 printf("-----------------------------------------------------------------------\n");
 while (1)
 { printf("\nPLEASE SELECT ANY OF THE FOLLOWING CATAGORIES\n");
   printf("1. FRUITS AND VEGETABLES\n2. BEAUTY AND HYGIENE\n3. ELECTRONICS\n4. CLOTHES\n5. KITCHEN AND FURNITURE\n");
   int choice;
   scanf("%d", &choice);
        switch (choice)
       {case 1:
            printf("SELECT FROM THE BELOW LIST\n");
            char buffer1[1024], ch1;
            FILE *fp1;
            fp1 = fopen("fruits and vegetables.txt", "r");
            int rownum = 0, coloumnnum = 0;
            char prod_name1[30][30];
            while (fgets(buffer1, 1024, fp1))
            {   coloumnnum = 0;
                rownum++;
                char *field = strtok(buffer1, ",");
                while (field)
                {   if (coloumnnum == 1)
                    { strcpy((char *)prod_name1[rownum], field); }
                    field = strtok(NULL, ",");
                    coloumnnum++;  }
                printf("%d. %s", rownum, prod_name1[rownum]);  }
            int price1[] = {100, 25, 50, 35, 25, 80, 90, 110, 55, 60};
            for (int i = 0; i < 100; i++)
            { //SELECTING PRODUCTS FROM THE LIST AND CALCULATING FINAL PRICE AFTER TAX
                printf("\nENTER THE PRODUCT NUMBER: ");
                scanf("%d", &product[c]);
                printf("\nENTER THE QUANTITY: ");
                scanf("%d", &quantity[c]);
                price[c] = price1[product[c] - 1];
                tax = tax + (((price1[product[c] - 1] * 0) / 100) * quantity[c]);
                final_price[c] = (((price1[product[c] - 1] * 0) / 100) + price1[product[c] - 1]) * quantity[c];
                total = total + final_price[c];
                strcpy((char *)prod_name[c], prod_name1[product[c]]);
                printf("\nPRESS 0 IF YOU ARE DONE SELECTING PRODUCT(S) ELSE PRESS ANY KEY TO CONTINUE: ");
                int d; c++; scanf("%d", &d);
                if (d == 0) break;}  break;
        case 2:
            printf("SELECT FROM THE BELOW LIST\n");
            char buffer2[1024], ch2;
            FILE *fp2;
            fp2 = fopen("beauty and hygiene.txt", "r");
            int rownum2 = 0, coloumnnum2 = 0;
            char prod_name2[30][30];
            while (fgets(buffer2, 1024, fp2))
            {   coloumnnum2 = 0;
                rownum2++;
                char *field = strtok(buffer2, ",");
                while (field)
                {   if (coloumnnum2 == 1)
                    { strcpy((char *)prod_name2[rownum2], field); }
                    field = strtok(NULL, ",");
                    coloumnnum2++; }
                printf("%d. %s", rownum2, prod_name2[rownum2]); }
            int price2[] = {150, 250, 375, 135, 35, 500, 900, 100, 285, 335};
            for (int i = 0; i < 100; i++)
            { //SELECTING PRODUCTS FROM THE LIST AND CALCULATING FINAL PRICE AFTER TAX
                printf("\nENTER THE PRODUCT NUMBER: ");
                scanf("%d", &product[c]);
                printf("\nENTER THE QUANTITY: ");
                scanf("%d", &quantity[c]);
                price[c] = price2[product[c] - 1];
                tax = tax + (((price2[product[c] - 1] * 5) / 100) * quantity[c]);
                final_price[c] = (((price2[product[c] - 1] * 5) / 100) + price2[product[c] - 1]) * quantity[c];
                total = total + final_price[c];
                strcpy(prod_name[c], prod_name2[product[c]]);
                printf("\nPRESS 0 IF YOU ARE DONE SELECTING PRODUCT(S) ELSE PRESS ANY KEY TO CONTINUE: ");
                int d;c++; scanf("%d", &d);
                if (d == 0)  break; }  break;
        case 3:
            printf("SELECT FROM THE BELOW LIST\n");
            char buffer3[1024], ch3;
            FILE *fp3;
            fp3 = fopen("electronics.txt", "r");
            int rownum3 = 0, coloumnnum3 = 0;
            char prod_name3[30][30];
            while (fgets(buffer3, 1024, fp3))
            {   coloumnnum3 = 0;
                rownum3++;
                char *field = strtok(buffer3, ",");
                while (field)
                {   if (coloumnnum3 == 1)
                    {strcpy((char *)prod_name3[rownum3], field); }
                    field = strtok(NULL, ",");
                    coloumnnum3++; }
                printf("%d. %s", rownum3, prod_name3[rownum3]);}
            int price3[] = {15000, 25550, 10000, 800, 50000, 6000, 250, 20000, 500, 800};
            for (int i = 0; i < 100; i++)
            { //SELECTING PRODUCTS FROM THE LIST AND CALCULATING FINAL PRICE AFTER TAX
                printf("\nENTER THE PRODUCT NUMBER: ");
                scanf("%d", &product[c]);
                printf("\nENTER THE QUANTITY: ");
                scanf("%d", &quantity[c]);
                price[c] = price3[product[c] - 1];
                tax = tax + (((price3[product[c] - 1] * 25) / 100) * quantity[c]);
                final_price[c] = (((price3[product[c] - 1] * 25) / 100) + price3[product[c] - 1]) * quantity[c];
                total = total + final_price[c];
                strcpy(prod_name[c], prod_name3[product[c]]);
                printf("\nPRESS 0 IF YOU ARE DONE SELECTING PRODUCT(S) ELSE PRESS ANY KEY TO CONTINUE: ");
                int d; c++; scanf("%d", &d);
                if (d == 0) break; }  break;
        case 4:
            printf("SELECT FROM THE BELOW LIST\n");
            char buffer4[1024], ch4;
            FILE *fp4;
            fp4 = fopen("clothes.txt", "r");
            int rownum4 = 0, coloumnnum4 = 0;
            char prod_name4[30][30];
            while (fgets(buffer4, 1024, fp4))
            {   coloumnnum4 = 0;
                rownum4++;
                char *field = strtok(buffer4, ",");
                while (field)
                {   if (coloumnnum4 == 1)
                    { strcpy((char *)prod_name4[rownum4], field); }
                    field = strtok(NULL, ",");
                    coloumnnum4++;}
                printf("%d. %s", rownum4, prod_name4[rownum4]);}
            int price4[] = {1000, 600, 500, 800, 1500, 100, 300, 80, 300, 950};
            for (int i = 0; i < 100; i++)
            { //SELECTING PRODUCTS FROM THE LIST AND CALCULATING FINAL PRICE AFTER TAX
                printf("\nENTER THE PRODUCT NUMBER: ");
                scanf("%d", &product[c]);
                printf("\nENTER THE QUANTITY: ");
                scanf("%d", &quantity[c]);
                price[c] = price4[product[c] - 1];
                tax = tax + (((price4[product[c] - 1] * 12) / 100) * quantity[c]);
                final_price[c] = (((price4[product[c] - 1] * 12) / 100) + price4[product[c] - 1]) * quantity[c];
                total = total + final_price[c];
                strcpy(prod_name[c], prod_name4[product[c]]);
                printf("\nPRESS 0 IF YOU ARE DONE SELECTING PRODUCT(S) ELSE PRESS ANY KEY TO CONTINUE: ");
                int d;c++;scanf("%d", &d);
                if (d == 0) break;} break;
        case 5:
            printf("SELECT FROM THE BELOW LIST\n");
            char buffer5[1024], ch5;
            FILE *fp5;
            fp5 = fopen("kitchen and furniture.txt", "r");
            int rownum5 = 0, coloumnnum5 = 0;
            char prod_name5[30][30];
            while (fgets(buffer5, 1024, fp5))
            {   coloumnnum5 = 0;
                rownum5++;
                char *field = strtok(buffer5, ",");
                while (field)
                {   if (coloumnnum5 == 1)
                    { strcpy((char *)prod_name5[rownum5], field); }
                    field = strtok(NULL, ",");
                    coloumnnum5++; }
                printf("%d. %s", rownum5, prod_name5[rownum5]); }
            int price5[] = {150, 100, 1375, 535, 30000, 5000, 10000, 50, 1500, 800};
            for (int i = 0; i < 100; i++)
            { //SELECTING PRODUCTS FROM THE LIST AND CALCULATING FINAL PRICE AFTER TAX
                printf("\nENTER THE PRODUCT NUMBER: ");
                scanf("%d", &product[c]);
                printf("\nENTER THE QUANTITY: ");
                scanf("%d", &quantity[c]);
                price[c] = price5[product[c] - 1];
                tax = tax + (((price5[product[c] - 1] * 18) / 100) * quantity[c]);
                final_price[c] = (((price5[product[c] - 1] * 18) / 100) + price5[product[c] - 1]) * quantity[c];
                total = total + final_price[c];
                strcpy(prod_name[c], prod_name5[product[c]]);
                printf("\nPRESS 0 IF YOU ARE DONE SELECTING PRODUCT(S) ELSE PRESS ANY KEY TO CONTINUE: ");
                int d;c++; scanf("%d", &d);
                if (d == 0) break; } break;
    default:
    printf("\nINVALID CHOICE PLEASE TRY AGAIN!!");  }
    printf("\nPRESS 1 IF YOU WISH TO CONTINUE ELSE PRESS 0: ");
    int d; scanf("%d", &d);
    if (d == 0) break; }
    printf("\n---------------------------------------------------------------------------------");
    printf("\nPRODUCT NUMBER\tPRODUCT NAME\tPRICE\tQUANTITY\tFINAL PRICE");
    printf("\n----------------------------------------------------------------------------------\n");
    for (int i = 0; i < c; i++)
    {   printItems(product[i], price[i], quantity[i], final_price[i], i );
        printf("\n"); }
    printf("\n---------------------------------------------------------------------------------");
    printf("\nTOTAL NUMBER OF PRODUCT PURCHASED: %d", c);
    printf("\nTOTAL TAX APPLIED ON YOUR PRODUCTS IS: %f", tax);
    printf("\nTOTAL AMOUNT TO BE PAID: %f", total);
    printf("\nTHANK YOU FOR SHOPPING WITH US :)");
    return 0;}
