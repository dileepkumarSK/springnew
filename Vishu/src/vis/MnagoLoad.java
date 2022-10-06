package vis;

public class MnagoLoad {
	static double parts = 4;
	static double disel = 3.0, count;

	public void load(double parts) {
		if (parts / 4 == 0.0) {
			count += 2.5;
			parts = parts - parts / 4;
			System.out.println(parts);
			load(parts);
		} else
			return;

	}

	public static void main(String[] args) {
		MnagoLoad ms = new MnagoLoad();
		ms.load(parts);
		double diselreq = count / disel;
		System.out.println(diselreq);
	}

}
