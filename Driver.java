
public class Driver {

	public static void main(String[] args) {
		//Item class
		Item item = new Item(20,30,4,2);
		//enemy class
		Enemy enemy = new Enemy(5,0,35,52,10,"Characters/Enemy.jpg");
		//Movement and collision
		MovementandCollision mac = new MovementandCollision(1,19,25,8,2,true);
		
		//print item
		System.out.println("Current Level:"+item.getCurrentLevel());
		System.out.println("X location:"+item.getItemXLocation());
		System.out.println("Y location:"+item.getItemYLocation());
		System.out.println("Number of items:"+item.getNumberOfItems());

		//print enemy
		System.out.println("\nEnemy Direction:"+enemy.getEnemyDirection());
		System.out.println("Enemy Image:"+enemy.getEnemyImage());
		System.out.println("Enemy Speed:"+enemy.getEnemySpeed());
		System.out.println("Enemy X location"+enemy.getEnemyXLocation());
		System.out.println("Enemy Y location"+enemy.getEnemyYLocation());
		//print movement and collisions
		System.out.println("\nCollision type :"+mac.getCollisionType());
		System.out.println("Movement Current Direction:"+mac.getCurrentDirection());
		System.out.println("Movement X location:"+mac.getXLocation());
		System.out.println("Movement Y location:"+mac.getYLocation());
		System.out.println("Movement Speed:"+mac.getMovementSpeed());
		System.out.println("If collision happened:"+mac.getCollision());


	}

}
