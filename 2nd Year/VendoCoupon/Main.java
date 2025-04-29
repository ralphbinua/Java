package VendoCoupon;
import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
         Coupon neu2024 = new Coupon("neu2024", 15, false);
         int price = 20;

         System.out.println();
         System.out.println("Total price is: " + price);
         System.out.print("Do you have a voucher code? (y/n): ");
         String choice = input.nextLine();

         if (choice.equals("y")) {
             System.out.print("Enter voucher code: ");
             String vCode = input.nextLine();

             if (vCode.equals(neu2024.getCouponName())) {
                 if (!neu2024.getIsUse()) {
                     int discountedPrice = price - neu2024.getcouponDiscount();
                     neu2024.setIsUse(true); // Mark the coupon as used
                     System.out.println("Discounted price is: " + discountedPrice);
                 } else {
                     System.out.println("The coupon has already been used, please try another.");
                 }
             } else {
                 System.out.println("There is no such coupon available.");
             }
         } else {
             System.out.println("Final price is: " + price);
         }
    }
}