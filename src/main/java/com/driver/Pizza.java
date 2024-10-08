package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;
    private boolean isTakeawayAdded;
    private boolean isBilled;
    private int basePrice;
    private int topping;
    private int cheese;
    private int takeaway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        isExtraCheeseAdded = false;
        isExtraToppingsAdded= false;
        isTakeawayAdded =false;
        isBilled = false;
        if(isVeg){
            basePrice = 300;
            topping = 70;
        } else{
            basePrice = 400;
            topping = 120;
        }
        cheese = 80;
        takeaway = 20;
        bill = "";
        price = basePrice;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded){
            price += cheese;
            isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingsAdded){
            price += topping;
            isExtraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeawayAdded){
            price += takeaway;
            isTakeawayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBilled){
            bill += "Base Price Of The Pizza: " + basePrice + "\n";
            if(isExtraCheeseAdded) bill += "Extra Cheese Added: " + cheese + "\n";
            if(isExtraToppingsAdded) bill += "Extra Toppings Added: " + topping + "\n";
            if(isTakeawayAdded) bill += "Paperbag Added: " + takeaway + "\n";
            bill += "Total Price: " + price + "\n";
            isBilled = true;
        }
        return this.bill;
    }
}
