package Part2;

import java.util.*;


public class Main {
	
	static void menu() {
	System.out.println();
	System.out.println("Enter 1 to output an array of random cars");
	System.out.println("Enter 2 to fill an array with the same values of a random car");
	}
	
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	List<HelmMaterials> HM = new ArrayList <HelmMaterials>();
	
	for (HelmMaterials HMValue : HelmMaterials.values()) {
        HM.add(HMValue);
	}
	
	while (true) {
		menu();
		
		switch(scanner.nextInt()) {
		
		case 1: {
//			Auto AutoArray[][] = new Auto[RandomValue(1,5)][RandomValue(1,5)]; //
			
			List <Auto> AutoList = new ArrayList <Auto>();
			
			for (int i =0; i <RandomValue(1,5); i++) {
				List <Auto> AutoList1 = new ArrayList<Auto>();
				for (int s = 0; s<RandomValue(1,5); s++) {
					AutoList1.add(new Auto(RandomValue(100, 250),
							RandomValue(2000, 2022),
							new Helm(RandomValue(35, 50),
									HM.get(RandomValue(0, HM.size() - 1)).toString()),
							new Engine(RandomValue(6, 12))));
				}
				AutoList.addAll(AutoList1);
			}
			System.out.println(AutoList);
			
			break;
		}
		
		case 2: {
			
			
			Auto auto = new Auto(RandomValue(100,250),RandomValue(2000,2022),
					new Helm(RandomValue(35,50),     
							HM.get(RandomValue(0, HM.size() -1)).toString()), 
					new Engine(RandomValue(6,12)));
			
			List <Auto> AutoList = new ArrayList <Auto>();
			
			
			for (int i = 0; i<RandomValue(1,5); i++) {
				AutoList.add(auto);
			}
			
			System.out.println(AutoList);
			
			break;
	
		}
		
		default : {
			System.out.println("Only 1 or 2 can be entered");
			break;
		}
		
		
		}
	}
		
	
	}

	 static int RandomValue(int min, int max) {
		if (min>=max) {
			throw new IllegalArgumentException("Min value must be less than max value");
		}

		Random randomValue = new Random();
		return randomValue.nextInt(max - min + 1) + min;
	}
}
