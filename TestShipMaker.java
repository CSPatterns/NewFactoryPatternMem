package NewFactoryPatternMem;

import java.util.Scanner;

public class TestShipMaker {

	public static void main(String[] args) {
		EnemyShipFactory f = new EnemyShipFactory();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a letter:");
		
		if(scan.hasNext()){
			
			String var1 = scan.nextLine();
			f.makeEnemyShip(var1);
			
			
		}
		
	}

}
