package NewFactoryPatternMem;

import java.util.Scanner;

public class TestShipMaker {

	public static void main(String[] args) {
		EnemyShipFactory f = new EnemyShipFactory();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a letter:");
		
		if(scan.hasNext()){
			
			String var1 = scan.nextLine();
			EnemyShip enemyShip = f.makeEnemyShip(var1);
			
			if(var1 != null){
				doStuff(enemyShip);
			}
			else{
				System.out.println("Please enter a letter");
			}
			
		}
		
	}
	
	public static void doStuff(EnemyShip enemyShip){
		
		enemyShip.printName();
		
	}

}

