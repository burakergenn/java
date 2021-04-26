package homeWork1;

public class GameManager {
	
	public void sell(Game game , User userName) {
		System.out.println("Oyun alındı : "  + game.name + " " + game.price + " TL / " + "Satın alınan hesap : " +userName.userName );
	}
	

}
