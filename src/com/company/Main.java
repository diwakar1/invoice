package com.company;

import java.util.Iterator;
import java .util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        String itemId;
        int quantity;
        String name;
        int price;

        Item myItem = new Item();

        Scanner input = new Scanner(System.in);




        ArrayList<String> a = new ArrayList<>();
        ArrayList<Integer> b= new ArrayList<>();
        ArrayList<String> c = new ArrayList<>();
        ArrayList<Integer> d= new ArrayList<>();


        System.out.println("Enter the item number of the product or q to exit");
        itemId = input.nextLine();


        while (!itemId.equals("q")){



           // System.out.println("enter the itemID: ");
            //itemId = input.nextLine();
            myItem.setItem(itemId);



            System.out.println("enter the taxable item name: ");
            name = input.nextLine();
            myItem.setName(name);

            System.out.println("enter the quantity  ");
            quantity = input.nextInt();
            input.nextLine();
            myItem.setQuantity(quantity);



            System.out.println("enter price: ");
            price= input.nextInt();
            input.nextLine();
            myItem.setPrice(price);



            a.add(myItem.getItem() + " " + myItem.getName() + myItem.getPrice() +
                    myItem.getPrice());
            b.add(myItem.getQuantity() * myItem.getPrice());



            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("Enter the Next item number of the product or q to exit");
            itemId = input.nextLine();


        }


        double x=0;

        for (int i=0; i<b.size();i++){
            System.out.print( a.get(i)+ " ");
            System.out.println("for--->"+ b.get(i));
            x=x+b.get(i);

        }


        System.out.println("---------------------------------------");
        System.out.println("SubTotal: "+ x);
        System.out.println("Tax: "+ x*0.06);//Assuming 6 % tax
        System.out.print("Grand Total: " + (x+ (x*0.06)));
        System.out.println();











    }
}

