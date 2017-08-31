//Создать метод вычисляющий степень числа через рекурсию
public class Pow {
	static double pow (double a, int b) {
		if (b == 0) {
			return 1;
		}
		else if (b < 0){
			return (double) (pow(a, b+1) * (1/a));
		}
		else {
			return pow(a, b-1) * a;
		}
	}

	public static void main(String[] args) {
		double x = Pow.pow(3, -2);
		System.out.println(x);

	}

}
