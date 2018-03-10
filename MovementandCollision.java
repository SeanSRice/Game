
public class MovementandCollision{
	private int currentDirection;
	private int xLocation;
	private int yLocation;
	private int movementSpeed;
	private int collisionType;
	private boolean collision;
	
	public MovementandCollision(int currentDirection, int xLocation, int yLocation, int movementSpeed, int collisionTypew, boolean collision)
	{
		this.currentDirection = currentDirection;
		this.xLocation = xLocation;
		this.yLocation = yLocation;
		this.movementSpeed = movementSpeed;
		this.collisionType = collisionType;
		this.collision = collision;
	}
	//current Direction
	public void setCurrentDirection()
	{
		this.currentDirection = currentDirection;
	}
	public int getCurrentDirection()
	{
		return currentDirection;
	}
	//current X and Y Lcoations
	public void setXLocation()
	{
		this.xLocation = xLocation;
	}
	public int getXLocation()
	{
		return xLocation;
	}
	
	public void setYLocation()
	{
		this.yLocation = yLocation;
	}
	public int getYLocation()
	{
		return yLocation;
	}
	//collision type
	public void setCollisionType()
	{
		this.collisionType = collisionType;
	}
	public int getCollisionType()
	{
		return collisionType;
	}
	
}

