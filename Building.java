import java.util.Scanner;

/*Создать класс Building, который хранит информацию 
  о зданиях(количество этажей, общая площадь этажа, 
  количество жильцов). Необходимо вычислить площадь, 
  приходящуюся на одного жильца дома
*/
public class Building {
	int qtyFloor;
	double totalAreaFloor;
	int totalPerson;
	
	void setFields(int qtyFloor, double totalAreaFloor, int totalPerson){
		this.qtyFloor = qtyFloor;
		this.totalAreaFloor = totalAreaFloor;
		this.totalPerson = totalPerson;
	}

	double areaForOnePerson() {
		double area = qtyFloor * totalAreaFloor / totalPerson;
		return area;		
	}

	public static void main(String[] args) {
		Building one = new Building();
		one.setFields(3, 30, 9);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Число этажей = ");
		int qtyFloor = sc.nextInt();
		
		System.out.println("Площадь этажа = ");
		double totalAreaFloor = sc.nextDouble();
		
		System.out.println("Количество жильцов = ");
		int totalPerson = sc.nextInt();
		
		Building two = new Building();
		one.setFields(qtyFloor, totalAreaFloor, totalPerson);
		System.out.println("Площадь на одного человека " + one.areaForOnePerson());

	}

}
