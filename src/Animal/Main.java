package Animal;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		AnimalFarm animalFarm = new AnimalFarm();
		
		boolean check = true;
		int choice;
		Scanner scanner = new Scanner(System.in);
		
		while(check) {
		System.out.println(
				"1. 동물 추가 \n"
				+ "2. 이름으로 동물 찾기\n"
				+ "3. 특정 동물의 소리 내기\n"
				+ "4. 모든 동물의 소리 내기(구현x)\n"
				+ "5. 모든 동물의 이름, 무게, 색깔 표시\n"
				+ "6. 종료");
		choice = scanner.nextInt();
		
			switch(choice) {
			case 1:
				animalFarm.addAnimal();
				System.out.println("저장 완료");
				break;
				
			case 2:
				animalFarm.search();
				break;
				
			case 3:
				break;
				
			case 4:
				animalFarm.AllSound();
				break;
				
			case 5:
				System.out.println("이름   무게   색깔");
				animalFarm.AllShow();
				break;
				
			case 6:
				check = false;
				break;
			}
		}
	}
}
