package Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalFarm {
	
	List<Animal> list = new ArrayList<Animal>();
	Scanner scanner = new Scanner(System.in);
	
	//리스트에 기본으로 들어있는 정보
	public AnimalFarm() {
		Dog dog = new Dog("멍멍이", 10, "갈색");
		Cat cat = new Cat("야옹이", 10, "검정색");
		Chicken chicken = new Chicken("꼬꼬", 10, "흰색");
		
		list.add(dog);
		list.add(cat);
		list.add(chicken);
	}
	
	//1) 동물 추가
	public void addAnimal() {
		
		System.out.println("새로 저장할 동물을 선택하세요\n"
				+ "1. 강아치 추가 "
				+ "2. 고양이 추가 "
				+ "3. 닭 추가 ");
		int choice = scanner.nextInt();
		
		switch(choice) {
		case 1:
			scanner.nextLine();
			System.out.println("새로 저장할 강아지 이름: ");
			String name = scanner.nextLine();
			
			System.out.println("몸무게: ");
			int weight = scanner.nextInt();
			scanner.nextLine(); //사용자가 입력한 개행문자(enter)를 제거
			
			System.out.println("색깔: ");
			String color = scanner.nextLine();
			
			Dog addDog = new Dog(name, weight, color);
			list.add(addDog);
			
			break;
			
		case 2:
			
			scanner.nextLine();
			System.out.println("새로 저장할 고양이 이름: ");
			name = scanner.nextLine();
			
			System.out.println("몸무게: ");
			weight = scanner.nextInt();
			scanner.nextLine(); 
			
			System.out.println("색깔: ");
			color = scanner.nextLine();
			
			Cat addCat = new Cat(name, weight, color);
			list.add(addCat);
			
			break;
		
		case 3:
			scanner.nextLine();
			System.out.println("새로 저장할 강아지 이름: ");
			name = scanner.nextLine();
			
			System.out.println("몸무게: ");
			weight = scanner.nextInt();
			scanner.nextLine(); //사용자가 입력한 개행문자(enter)를 제거
			
			System.out.println("색깔: ");
			color = scanner.nextLine();
			
			Chicken addChicken = new Chicken(name, weight, color);
			list.add(addChicken);
			
			break;
		}
	}
	
	//2)이름으로 동물 찾기
	public void search() {
		
		System.out.println("찾고 싶은 동물의 이름");
		String SerchName = scanner.nextLine();
		
		boolean found = false;
		
		for(Animal animal : list) { //향상된 for문: for(declaration(변수선언) : expression(배열 또는 배열을 리턴하는 함수)) 
			if(animal.getName().equals(SerchName)) {
				found = true;
				System.out.printf(animal.getName()+" "
						+animal.getWeight()+" "
						+animal.getColor()+"\n");
			}
		}
		
		if(!found) {
			System.out.println("저장되지 않은 동물입니다.");
		}
	}
	
	//4)모든 동물의 소리 내기
	public void AllSound() {
		for(Animal animal : list) {
			animal.speack();
		}
	}
	
	//5) 모든 동물의 이름, 무게, 색깔 표시
	public void AllShow() {
		for(Animal animal : list) {
			System.out.printf(animal.getName()+" "
			+animal.getWeight()+" "
			+animal.getColor()+"\n");
		}
	}
}
