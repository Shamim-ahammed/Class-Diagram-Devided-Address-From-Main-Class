public class Association {
    
       public static void main (String args[]){
            
           customer cust1 = new customer("Shamim", "Shamim171442617", "1859");
           address addr1 = new address(2, 3, "Biruttom Road", "Tribeny", "Jhenaidah", "Jhenaidah");
           
           System.out.println(cust1.customer() + " " + addr1.address());
           
           
           admin admin1 = new admin("Administrator", "admin", "Admin@123");
           address addr2 = new address("Tribeny", "Jhenaidah", "Jhenaidah");
           
           
           System.out.println(admin1.admin() + " " + addr2.address());
           
           
        }
    
    
}