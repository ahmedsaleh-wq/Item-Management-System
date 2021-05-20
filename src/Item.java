
 public class Item {
	private int ID;
	private String  Name;
	
	 Item(int id, String name){
		ID = id;
		Name = name;
		}
	 
	public String getName() {
		return Name;
	}
	
	public int getID() {
		return ID;
	}
	
	void setName(String name) {
		Name = name;
	}
	
	void setID(int id) {
		ID = id;
	}
	
	
	@Override
    public String toString() { 
        return " Name: " + getName() +", ID: "+ getID(); 
    } 
}
