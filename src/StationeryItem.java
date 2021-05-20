
public class StationeryItem extends Item {
	private int ID;
	private String  Name;
	StationeryItem(int id, String name) {
		super(id, name);
		ID = id;
		Name = name;
	}
	@Override
    public String toString() { 
        return " Name: " + getName() +", ID: "+ getID(); 
    } 

}
