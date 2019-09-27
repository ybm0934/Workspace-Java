package NetworkScoreTableServer;

public class NetworkScoreTableServerMain {
	
	public static void main(String[] args) {
		NetworkScoreTableServer scoreTable = new NetworkScoreTableServer( 9000 );
		scoreTable.loopServer();
	}

}
