
public class Enemy {
	private int spawnTime;
	private int enemyDirection;
	private int enemyXLocation;
	private int enemyYLocation;
	private int enemySpeed;
	private String enemyImage;
	public Enemy(int spawnTime,int enemyDirection,int enemyXLocation,int enemyYLocation,int enemySpeed,
			 String enemyImage)
	{
		this.spawnTime = spawnTime;
		this.enemyDirection = enemyDirection;
		this.enemyXLocation = enemyXLocation;
		this.enemyYLocation = enemyYLocation;
		this.enemySpeed = enemySpeed;
		this.enemyImage = enemyImage;
	}
	
	//spawn time
	public void setSpawnTime() 
	{
		this.spawnTime = spawnTime;
	}
	public int getSpawnTime()
	{
		return enemyDirection;
	}
	//enemy direction and location
	public void setEnemyDirection() 
	{
		this.enemyDirection = enemyDirection;
	}
	public int getEnemyDirection()
	{
		return enemyDirection;
	}
	
	public void setEnemyXLocation()
	{
		this.enemyXLocation = enemyXLocation;
	}
	public int getEnemyXLocation()
	{
		return enemyXLocation;
	}
	
	public void setEnemyYLocation() 
	{
		this.enemyYLocation = enemyYLocation;
	}
	public int getEnemyYLocation()
	{
		return enemyYLocation;
	} 
	//enemy speed
	public void setEnemySpeed() 
	{
		this.enemySpeed = enemySpeed;
	}
	public int getEnemySpeed()
	{
		return enemySpeed;
	} 
	//enemy image
	public void setEnemyImage() 
	{
		this.enemyImage = enemyImage;
	}
	public String getEnemyImage()
	{
		return enemyImage;
	} 
	 
	

}
