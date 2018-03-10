
public class Item {
	
	private int itemXLocation;
	private int itemYLocation;
	private int numItems;
	private int currentLevel;
	public Item(int itemXLocation, int itemYLocation, int numItems, int currentLevel)
	{
		this.itemXLocation = itemXLocation;
		this.itemYLocation = itemYLocation;
		this.numItems = numItems;
		this.currentLevel = currentLevel;
	}
	//item location
	public void setItemXLocation() 
	{
		this.itemXLocation = itemXLocation;
	}
	public int getItemXLocation()
	{
		return itemXLocation;
	}
	public void setItemYLocation() 
	{
		this.itemYLocation = itemYLocation;
	}
	public int getItemYLocation()
	{
		return itemYLocation;
	}
	//number of items
	public void setNumberOfItems() 
	{
		this.numItems = numItems;
	}
	public int getNumberOfItems()
	{
		return numItems;
	}
	//current level
	public void setCurrentLevel()
	{
		this.currentLevel = currentLevel;
	}
	public int getCurrentLevel()
	{
		return currentLevel;
	}

}
