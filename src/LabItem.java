
public class LabItem extends Item{
	private int ID;
	private String  Name;
	LabItem(int id, String name) {
		super(id, name);
		ID = id;
		Name = name;
	}
	@Override
    public String toString() { 
        return " Name: " + getName() +", ID: "+ getID(); 
    } 
}
