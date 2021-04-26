package homeWork1;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1,"burake","Burak","Ergen","burak@","123456a");
		User user2 = new User(2,"enesc","Enes","Çaldıran","enes@","123456b");
		User user3 = new User(3,"berkeb","Berke","Bağıröz","berke@","123456c");
		
		UserManager userManager = new  UserManager();
		userManager.register(user1);
		userManager.register(user2);
		userManager.register(user3);
		
		
		Game game1 = new Game(1,"GTA5",85);
		Game game2 = new Game(2,"CS:GO",70);
		Game game3 = new Game(3,"FIFA21",200);
		
		GameManager gameManager = new GameManager();
		gameManager.sell(game1,user2);
		gameManager.sell(game2,user3);
		gameManager.sell(game3,user1);
	}

}
