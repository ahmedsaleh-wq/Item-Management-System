import java.util.*;

public class ItemCollection {
    public static void  main(String [] args) {
    	int ID;
    	int c1 = 1, c2 = 1;
    	String Name;
    	int Exit = 0;
    	Map<String, Item> HM = new HashMap<>();
    	while(Exit == 0) {
        Scanner in = new Scanner(System.in);
        System.out.println("**********************");
        System.out.println("Item Management System");
        System.out.println("**********************");
        System.out.println("1 - Add Stationery Item");
        System.out.println("2 - Add Lab Item"); 
        System.out.println("3 - Display All Items");
        System.out.println("4 - Exit");
        int Answer = in.nextInt();
        switch (Answer) 
        {
        case 1:
        	System.out.println("Enter Stationery Item name: ");
        	Name = in.next();
        	System.out.println("Enter Stationery Item ID: ");
        	ID= in.nextInt();
            HM.put("Stationery Item "+ c1+ " ", new StationeryItem(ID, Name));
            c1++;
            break;
        case 2:
        	System.out.println("Enter Lab Item name: ");
        	Name = in.next();
        	System.out.println("Enter Lab Item ID: ");
        	ID= in.nextInt();
            HM.put("Lab Item "+ c2 + " ", new LabItem(ID, Name));
            c2++;
            break;
        case 3:
        	System.out.println(HM);
            break;
        case 4:
        	Exit = 1;
            break;
        default:
            throw new IllegalArgumentException("Unexpected value: " + Answer + " Please enter a valid number!");
            
        }
    }
    	System.out.println("Thank you");	
 }
    

}
