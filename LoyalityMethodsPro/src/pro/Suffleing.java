package pro;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Suffleing {

	public static void top10(int[] a) {

		Set s = new LinkedHashSet();
		Random r = new Random();
		int i = 1;
		while (i != 11) {
			System.out.println();
			int ra = r.nextInt(a.length );
			if (!s.contains(ra)) {
				System.out.println(a[ra]);
				s.add(ra);
			} else {
				while (s.contains(ra)) {
					ra = r.nextInt(a.length);
				
				}
				System.out.println(a[ra]);
				s.add(ra);
			}
			i++;
		}

	}

	public static void main(String[] args) {

		top10(new int[] {1,2,3,4,5,6,7,8,9,10});
	}

}
