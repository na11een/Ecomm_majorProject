package com.example.ecomm;

public class Order {

     public static boolean placeOrder (Customer customer,Product product){
         try{

               String placeOrder = "Insert into orders(customer_id,product_id,status)values(" +customer.getId()+","+product.getId()+",'Ordered')";
               DatabaseConnection dbConn = new DatabaseConnection();
               return dbConn.insertUpdate(placeOrder);

         } catch (Exception e){
             e.printStackTrace();
         }
         return false;
     }
}
