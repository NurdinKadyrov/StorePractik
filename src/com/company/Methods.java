package com.company;

import com.company.products.*;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Locale;
import java.util.Random;

public class Methods {
    Random random = new Random();
    Milk milk = new Milk("Milk",60);
    Salt salt = new Salt("Salt",150);
    Fish fish = new Fish("Fish",20);
    Corn corn = new Corn("Corn",0);
    Stew stew = new Stew("Stew",180);
     private  int a;
     private int b;
     private int data;
     private int life;

    public void arrayMethod (){
        String[] product = new String[]{"Milk", "Salt", "Fish", "Corn", "Stew"};
         int ran = random.nextInt(5);
         a = ran;
        System.out.print(product[ran] +"\t   |  ");
    }

    public void logicalMethod(){
        arrayMethod();
        dateMethod();
        showCaseMethod();

        switch (a) {
            // Milk
            case 0 :{
                if (b == 0){
                    life =milk.getShelfLife()/2;
                    System.out.print("     30       |");
                    if (life < data){
                        System.out.print("   true    ");
                    }
                    else if (life > data){
                        System.out.print("   false     ");
                    }
                }
                else if (b == 1){
                    life = milk.getShelfLife();
                    System.out.print("     60       |");
                    if (data < milk.getShelfLife()){
                        System.out.print("   true     ");
                    }
                    else if (data > milk.getShelfLife()){
                        System.out.print("   false   ");
                    }

                }
                break;}
            // Salt
            case 1 :{
                System.out.print("     INF      |");
                if (salt.getShelfLife() < data){
                System.out.print("   true      ");
                }
                else if (salt.getShelfLife() > data){
                    System.out.print("   false    ");
                }
                break;}
            // Fish
            case 2 :{
                if (b == 0){
                    life =fish.getShelfLife()/2;
                    System.out.print("     10       |");
                    if (life < data){
                        System.out.print("   true    ");
                    }
                    else if (life > data){
                        System.out.print("   false     ");
                    }
                }
                else if (b == 1){
                    life = 30;
                    System.out.print("     20       |");
                    if (life < data ){
                        System.out.print("   true     ");
                    }
                    else if (life > data){
                        System.out.print("   false   ");
                    }

                }
                break;
            }
            // Corn
            case 3 :{
                System.out.print("     150      |");
                if (corn.getShelfLife() < data){
                    System.out.print("   true      ");
                }
                else if (corn.getShelfLife() > data){
                    System.out.print("   false    ");
                }
                break;
            }
            // Stew
            case 4 :{
                System.out.print("     180      |");
                if (stew.getShelfLife() < data){
                    System.out.print("   true      ");
                }
                else if (stew.getShelfLife() > data){
                    System.out.print("   false    ");
                }
                break;
            }



        }

    }

    public void dateMethod(){
        int a = random.nextInt(200);
        data = a;
        LocalDate localDate = LocalDate.now().minusDays(a);
        System.out.print(localDate+"   |  ");
    }
    public void print(){
        System.out.println("""
                        
                        Inspection result.
          Product  |  Produced on  |  Storage place  |  S. live days  |  Fresh 
        -----------+---------------+-----------------+----------------+---------""");
    }
    public void methods(){

    }
    public void showCaseMethod(){
        String[] showCase = new String[]{"Showcase","Icebox  "};
        int ranShop = random.nextInt(2);
        b = ranShop;
        System.out.print(showCase[b]+"       |  ");
    }
}
