package com.company;

import java .util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        String item;
        int quantity;
        String description;
        double price;
        String items;


        Scanner input = new Scanner(System.in);


        ArrayList<Double> totalStor = new ArrayList<>();
        ArrayList<Double> priceStor = new ArrayList<>();
        ArrayList<String> descriptionStor = new ArrayList<>();
        ArrayList<Integer> quantityStor = new ArrayList<>();
        ArrayList<String> itemStor = new ArrayList<>();

        Item my = new Item();

        System.out.println("enter the items of product or q to exit");
        items = input.nextLine();
        while (!items.equals("q")) {


            System.out.println("enter quantity of product: ");
            quantity = input.nextInt();
            input.nextLine();


            System.out.println("enter the description of product");
            description = input.nextLine();

            System.out.println("Enter the Price of the product: ");
            price = input.nextDouble();
            input.nextLine();

            my.setItem(items);
            my.setQuantity(quantity);
            my.setDescription(description);
            my.setPrice(price);

            totalStor.add(my.total());
            quantityStor.add(my.getQuantity());
            itemStor.add(my.getItem());
            priceStor.add(my.getPrice());
            descriptionStor.add(my.getDescription());

            System.out.println("_____________________________________________________");
            System.out.println("Enter the Next item number of the product or q to exit");
            items = input.nextLine();
        }


            System.out.println("item \t " + "quantity\t  "+"Descriptiont\t " + "price\t \t "+"total\t");
            for(int i =0; i <totalStor.size();i++){
                System.out.println(itemStor.get(i)+"  \t \t "+quantityStor.get(i)+" \t  \t\t\t\t "+descriptionStor.get(i)+" \t \t  "+
                        priceStor.get(i)+"  \t \t "+totalStor.get(i));
            }

        System.out.println(String.format("Taxable sub-total: %.2f",my.taxableSubTotal(totalStor)));
        System.out.println("Untaxable Subtotal:   " + my.untaxable());
        System.out.println(String.format("Tax: %.2f  ", my.tax(totalStor)));
        System.out.println("Grand Total:   "+ my.grandTotal(totalStor));

    }


        }



