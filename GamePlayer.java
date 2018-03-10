
public class GamePlayer {

	String name;
	String image;
	int numItems;
	public GamePlayer(String name, String image, int numItems) 
	{
		this.name = name;
		this.image = image;
		this.numItems = numItems;
	}
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;	
	}
	public String getImage()
	{
		return image;
	}
	
	public void setImage(String image)
	{
		this.image = image;	
	}

	public String toString()
	{
		return "\nName: "+name+"\nNumber of items:"+numItems;
	}

}
