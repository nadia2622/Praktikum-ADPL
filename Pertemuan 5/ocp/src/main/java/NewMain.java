/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator(); 
 
        double price = 100000; 
 
        // Diskon untuk Member 
        Discount memberDiscount = new MemberDiscount(); 
        double memberResult = calculator.calculateDiscount(memberDiscount, price); 
        System.out.println("Harga setelah diskon Member: " + (price - memberResult)); 
 
        // Diskon untuk VIP 
        Discount vipDiscount = new VIPDiscount(); 
        double vipResult = calculator.calculateDiscount(vipDiscount, price); 
        System.out.println("Harga setelah diskon VIP: " + (price - vipResult)); 
    }
}
