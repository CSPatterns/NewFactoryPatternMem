package NewFactoryPatternMem;

public class EnemyShipFactory {
	
		public EnemyShip enemyShip = null;
		
		public EnemyShip makeEnemyShip(String newShipType){
			if(newShipType.equals("U")){
				return new UFOEnemyShip();
			}
			
			else if(newShipType.equals("B")){
				return new BigEnemyShip();
			}
			
			else if(newShipType.equals("R")){
				return new RookieEnemyShip();
			}
			
			else return enemyShip;
		}

}
